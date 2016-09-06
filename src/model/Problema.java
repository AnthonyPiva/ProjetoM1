//Problema 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import Saves.Save;
import java.util.ArrayList;

/**
 *
 * @author 5725089
 */
public class Problema {
    private String descricao, status;
    private Date dataProblema;   
    private String Cod;
    
    public void Salvar(){
        Save.problemas.add(this);
    }
    
    public static ArrayList<Problema> ObterLista(){
        return Save.problemas;
    }
    
    public static Problema ObterProblemaPeloCod(String op){
        for(Problema obj : Problema.ObterLista()){
            if(obj.getCod().equals(op)){
                return obj;
            }
        }return null;
    }


    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the dataProblema
     */
    public Date getDataProblema() {
        return dataProblema;
    }

    /**
     * @param dataProblema the dataProblema to set
     */
    public void setDataProblema(Date dataProblema) {
        this.dataProblema = dataProblema;
    }

    /**
     * @return the Cod
     */
    public String getCod() {
        return Cod;
    }

    /**
     * @param Cod the Cod to set
     */
    public void setCod(String Cod) {
        this.Cod = Cod;
    }
    
}