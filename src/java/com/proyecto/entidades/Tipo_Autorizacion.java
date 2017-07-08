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
    private Long CODIGO_AUTORIZACION;
    @Column(name = "DESCRIPCION")
    private String DESCRIPCION;

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public Long getCODIGO_AUTORIZACION() {
        return CODIGO_AUTORIZACION;
    }

    public void setCODIGO_AUTORIZACION(Long CODIGO_AUTORIZACION) {
        this.CODIGO_AUTORIZACION = CODIGO_AUTORIZACION;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (CODIGO_AUTORIZACION != null ? CODIGO_AUTORIZACION.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the CODIGO_AUTORIZACION fields are not set
        if (!(object instanceof Tipo_Autorizacion)) {
            return false;
        }
        Tipo_Autorizacion other = (Tipo_Autorizacion) object;
        if ((this.CODIGO_AUTORIZACION == null && other.CODIGO_AUTORIZACION != null) || (this.CODIGO_AUTORIZACION != null && !this.CODIGO_AUTORIZACION.equals(other.CODIGO_AUTORIZACION))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.proyecto.entidades.Tipo_Autorizacion[ id=" + CODIGO_AUTORIZACION + " ]";
    }

}
