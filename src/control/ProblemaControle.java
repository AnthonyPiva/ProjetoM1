//ProblemaControle

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.Date;
import model.Problema;
import model.ProblemaDao;
 
/**  
 * 
 * @author 5725089
 */
public class ProblemaControle {
    
    public static void recebeFormularioCadastroProblema(String descricao, Date dataProblema){
        Problema a = new Problema();
        int i=1;
        for(Problema obj : ProblemaDao.ObterLista()){
            i++;
        }
        a.setDescricao(descricao);
        a.setDataProblema(dataProblema);
        a.setCod(Integer.toString(i));
        a.setStatus("Aberto");
        ProblemaDao.Salvar(a);
    }
    
    public static ArrayList<Problema> ObterLista(){
        return ProblemaDao.ObterLista();
    }
    
    public static Problema ObterProblemaPeloCod(String op){
        return ProblemaDao.ObterProblemaPeloCod(op);
    }
    
}

