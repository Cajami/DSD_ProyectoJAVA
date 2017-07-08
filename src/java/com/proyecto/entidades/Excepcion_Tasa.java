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
    private Long CODIGO_EXCEPCION;
    @Column(name = "CODIGO_PERFIL")
    private Long CODIGO_PERFIL;
    @Column(name = "TASA_MINIMA")
    private double TASA_MINIMA;

    public Long getCODIGO_PERFIL() {
        return CODIGO_PERFIL;
    }

    public void setCODIGO_PERFIL(Long CODIGO_PERFIL) {
        this.CODIGO_PERFIL = CODIGO_PERFIL;
    }

    public double getTASA_MINIMA() {
        return TASA_MINIMA;
    }

    public void setTASA_MINIMA(double TASA_MINIMA) {
        this.TASA_MINIMA = TASA_MINIMA;
    }

    public Long getCODIGO_EXCEPCION() {
        return CODIGO_EXCEPCION;
    }

    public void setCODIGO_EXCEPCION(Long CODIGO_EXCEPCION) {
        this.CODIGO_EXCEPCION = CODIGO_EXCEPCION;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (CODIGO_EXCEPCION != null ? CODIGO_EXCEPCION.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the CODIGO_EXCEPCION fields are not set
        if (!(object instanceof Excepcion_Tasa)) {
            return false;
        }
        Excepcion_Tasa other = (Excepcion_Tasa) object;
        if ((this.CODIGO_EXCEPCION == null && other.CODIGO_EXCEPCION != null) || (this.CODIGO_EXCEPCION != null && !this.CODIGO_EXCEPCION.equals(other.CODIGO_EXCEPCION))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.proyecto.entidades.Excepcion_Tasa[ id=" + CODIGO_EXCEPCION + " ]";
    }

}
