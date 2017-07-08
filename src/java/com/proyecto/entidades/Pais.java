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
@Table(name = "PAIS")
public class Pais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODIGO_PAIS")
    private Long CODIGO_PAIS;
    @Column(name = "DESCRIPCION")
    private String DESCRIPCION;

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public Long getCODIGO_PAIS() {
        return CODIGO_PAIS;
    }

    public void setCODIGO_PAIS(Long CODIGO_PAIS) {
        this.CODIGO_PAIS = CODIGO_PAIS;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (CODIGO_PAIS != null ? CODIGO_PAIS.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the CODIGO_PAIS fields are not set
        if (!(object instanceof Pais)) {
            return false;
        }
        Pais other = (Pais) object;
        if ((this.CODIGO_PAIS == null && other.CODIGO_PAIS != null) || (this.CODIGO_PAIS != null && !this.CODIGO_PAIS.equals(other.CODIGO_PAIS))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.proyecto.entidades.Pais[ id=" + CODIGO_PAIS + " ]";
    }

}
