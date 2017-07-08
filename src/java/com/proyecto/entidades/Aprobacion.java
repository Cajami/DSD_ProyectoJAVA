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
 * @author JAVIER-PC
 */
@Entity
@Table(name = "APROBACION")
public class Aprobacion implements Serializable {

    //private static final int serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODIGO_APROBACION")
    private int CODIGO_APROBACION;
    @Column(name = "CODIGO_AUTORIZACION")
    private int CODIGO_AUTORIZACION;
    @Column(name = "CODIGO_USUARIO")
    private int CODIGO_USUARIO;
    @Column(name = "COMENTARIO")
    private String COMENTARIO;
    @Column(name = "FECHA_APROBACION")
    private Date FECHA_APROBACION;

    public int getCODIGO_AUTORIZACION() {
        return CODIGO_AUTORIZACION;
    }

    public void setCODIGO_AUTORIZACION(int CODIGO_AUTORIZACION) {
        this.CODIGO_AUTORIZACION = CODIGO_AUTORIZACION;
    }

    public int getCODIGO_USUARIO() {
        return CODIGO_USUARIO;
    }

    public void setCODIGO_USUARIO(int CODIGO_USUARIO) {
        this.CODIGO_USUARIO = CODIGO_USUARIO;
    }

    public String getCOMENTARIO() {
        return COMENTARIO;
    }

    public void setCOMENTARIO(String COMENTARIO) {
        this.COMENTARIO = COMENTARIO;
    }

    public Date getFECHA_APROBACION() {
        return FECHA_APROBACION;
    }

    public void setFECHA_APROBACION(Date FECHA_APROBACION) {
        this.FECHA_APROBACION = FECHA_APROBACION;
    }

    public int getCODIGO_APROBACION() {
        return CODIGO_APROBACION;
    }

    public void setCODIGO_APROBACION(int CODIGO_APROBACION) {
        this.CODIGO_APROBACION = CODIGO_APROBACION;
    }

    @Override
    public String toString() {
        return "com.proyecto.entidades.Aproacion[ id=" + CODIGO_APROBACION + " ]";
    }

}
