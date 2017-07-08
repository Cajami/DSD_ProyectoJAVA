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
@Table(name = "CTS")
public class Cts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODIGO_CTS")
    private int CODIGO_CTS;
    @Column(name = "CODIGO_USUARIO")
    private int CODIGO_USUARIO;
    @Column(name = "FECHA_INGRESO")
    private Date FECHA_INGRESO;
    @Column(name = "FECHA_MODIFICA")
    private Date FECHA_MODIFICA;
    @Column(name = "FECHA_APERTURA")
    private Date FECHA_APERTURA;
    @Column(name = "TASA")
    private double TASA;
    @Column(name = "ESTADO")
    private String ESTADO;
    @Column(name = "TRASLADO")
    private String TRASLADO;

    public int getCODIGO_USUARIO() {
        return CODIGO_USUARIO;
    }

    public void setCODIGO_USUARIO(int CODIGO_USUARIO) {
        this.CODIGO_USUARIO = CODIGO_USUARIO;
    }

    public Date getFECHA_INGRESO() {
        return FECHA_INGRESO;
    }

    public void setFECHA_INGRESO(Date FECHA_INGRESO) {
        this.FECHA_INGRESO = FECHA_INGRESO;
    }

    public Date getFECHA_MODIFICA() {
        return FECHA_MODIFICA;
    }

    public void setFECHA_MODIFICA(Date FECHA_MODIFICA) {
        this.FECHA_MODIFICA = FECHA_MODIFICA;
    }

    public Date getFECHA_APERTURA() {
        return FECHA_APERTURA;
    }

    public void setFECHA_APERTURA(Date FECHA_APERTURA) {
        this.FECHA_APERTURA = FECHA_APERTURA;
    }

    public double getTASA() {
        return TASA;
    }

    public void setTASA(double TASA) {
        this.TASA = TASA;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }

    public String getTRASLADO() {
        return TRASLADO;
    }

    public void setTRASLADO(String TRASLADO) {
        this.TRASLADO = TRASLADO;
    }


    public int getCODIGO_CTS() {
        return CODIGO_CTS;
    }

    public void setCODIGO_CTS(int CODIGO_CTS) {
        this.CODIGO_CTS = CODIGO_CTS;
    }

    @Override
    public String toString() {
        return "com.proyecto.entidades.Cts[ id=" + CODIGO_CTS + " ]";
    }

}
