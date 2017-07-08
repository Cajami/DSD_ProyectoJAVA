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
@Table(name = "EXCEPCION_TASA")
public class Excepcion_Tasa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODIGO_EXCEPCION")
    private int CODIGO_EXCEPCION;
    @Column(name = "CODIGO_PERFIL")
    private int CODIGO_PERFIL;
    @Column(name = "TASA_MINIMA")
    private double TASA_MINIMA;

    public int getCODIGO_PERFIL() {
        return CODIGO_PERFIL;
    }

    public void setCODIGO_PERFIL(int CODIGO_PERFIL) {
        this.CODIGO_PERFIL = CODIGO_PERFIL;
    }

    public double getTASA_MINIMA() {
        return TASA_MINIMA;
    }

    public void setTASA_MINIMA(double TASA_MINIMA) {
        this.TASA_MINIMA = TASA_MINIMA;
    }

    public int getCODIGO_EXCEPCION() {
        return CODIGO_EXCEPCION;
    }

    public void setCODIGO_EXCEPCION(int CODIGO_EXCEPCION) {
        this.CODIGO_EXCEPCION = CODIGO_EXCEPCION;
    }

    @Override
    public String toString() {
        return "com.proyecto.entidades.Excepcion_Tasa[ id=" + CODIGO_EXCEPCION + " ]";
    }

}
