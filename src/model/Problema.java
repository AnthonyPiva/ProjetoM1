//Problema 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import Saves.Save;
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
public class Problema {
    private String descricao, status;
    private Date dataProblema;   
    private String Cod;
    
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