/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.entidades;

import java.io.Serializable;
import java.util.Date;
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
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODIGO_USUARIO")
    private int CODIGO_USUARIO;
    @Column(name = "DESCRIPCION")
    private String DESCRIPCION;
    @Column(name = "FECHA_INGRESO")
    private Date FECHA_INGRESO;

    public int getCODIGO_USUARIO() {
        return CODIGO_USUARIO;
    }

    public void setCODIGO_USUARIO(int CODIGO_USUARIO) {
        this.CODIGO_USUARIO = CODIGO_USUARIO;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public Date getFECHA_INGRESO() {
        return FECHA_INGRESO;
    }

    public void setFECHA_INGRESO(Date FECHA_INGRESO) {
        this.FECHA_INGRESO = FECHA_INGRESO;
    }
    

    @Override
    public String toString() {
        return "com.proyecto.entidades.Usuario[ id=" + CODIGO_USUARIO + " ]";
    }
    
}
