/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author JAVIER-PC
 */
@Entity
@Table(name = "TIP_DOC")
public class Tip_Doc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODITO_TIPDOC")
    private int CODITO_TIPDOC;
    @Column(name = "DESCRIPCION")
    private String DESCRIPCION;

    public int getCODITO_TIPDOC() {
        return CODITO_TIPDOC;
    }

    public void setCODITO_TIPDOC(int CODITO_TIPDOC) {
        this.CODITO_TIPDOC = CODITO_TIPDOC;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

   
   

    @Override
    public String toString() {
        return "com.proyecto.entidades.Tip_Doc[ id=" + CODITO_TIPDOC + " ]";
    }

}
