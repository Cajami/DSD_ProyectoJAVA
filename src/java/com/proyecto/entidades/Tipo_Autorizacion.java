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
@Table(name = "TIPO_AUTORIZACION")
public class Tipo_Autorizacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODIGO_AUTORIZACION")
    private int CODIGO_AUTORIZACION;
    @Column(name = "DESCRIPCION")
    private String DESCRIPCION;

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public int getCODIGO_AUTORIZACION() {
        return CODIGO_AUTORIZACION;
    }

    public void setCODIGO_AUTORIZACION(int CODIGO_AUTORIZACION) {
        this.CODIGO_AUTORIZACION = CODIGO_AUTORIZACION;
    }

    
    @Override
    public String toString() {
        return "com.proyecto.entidades.Tipo_Autorizacion[ id=" + CODIGO_AUTORIZACION + " ]";
    }

}
