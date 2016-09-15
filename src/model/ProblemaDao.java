/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

/**
 *
 * @author 5725089
 */
public class ProblemaDao {
    
    public static void Salvar(Problema Savethis){
        try{
            Path caminho = Paths.get("Problemas.txt");
            String equipamento = Savethis.getCod()+";"+Savethis.getDescricao()+";"+Savethis.getStatus()+";"+Savethis.getDataProblema().toString()+"\r\n";
            Files.write(caminho, equipamento.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
     
    
    public static ArrayList<Problema> ObterLista(){
        ArrayList<Problema> retorno = new ArrayList<>();
        try{
            Path leotxt = Paths.get("Problemas.txt");
            for(String linha : Files.readAllLines(leotxt)){
                String[] dados = linha.split(";");
                Problema obj = new Problema();
                //Date agora = new Date();
                SimpleDateFormat formatadorData = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
                //System.out.println(formatadorData.format(agora));
                obj.setCod(dados[0]);
                obj.setDescricao(dados[1]);
                obj.setStatus(dados[2]);
                obj.setDataProblema(formatadorData.parse(dados[3]));
                retorno.add(obj);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return retorno;
    }
    
    public static Problema ObterProblemaPeloCod(String op){
        for(Problema obj : ObterLista()){
            if(obj.getCod().equals(op)){
                return obj;
            }
        }return null;
    }
    
    public static void ReescreveArq(String op){
        for(Problema obj : ObterLista()){
            if(obj.getCod().equals(op)){
                ObterProblemaPeloCod(op);
                obj.setStatus("Resolvido");
                Salvar(obj);
            }
        }        
    }
    
}
