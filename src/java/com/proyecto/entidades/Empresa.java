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
 * @author USER
 */
@Entity
@Table(name = "EMPRESA")
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODIGO_EMPLEADO")
    private int CODIGO_EMPLEADO;
    @Column(name = "DESCRIPCION")
    private String DESCRIPCION;

    public int getCODIGO_EMPLEADO() {
        return CODIGO_EMPLEADO;
    }

    public void setCODIGO_EMPLEADO(int CODIGO_EMPLEADO) {
        this.CODIGO_EMPLEADO = CODIGO_EMPLEADO;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }
        
    

    @Override
    public String toString() {
        return "com.proyecto.entidades.Empresa[ id=" + CODIGO_EMPLEADO + " ]";
    }
    
}
