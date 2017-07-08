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
@Table(name = "PERFIL")
public class Perfil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODIGO_PERFIL")
    private Long CODIGO_PERFIL;
    @Column(name = "DESCRIPCION")
    private String DESCRIPCION;

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public Long getCODIGO_PERFIL() {
        return CODIGO_PERFIL;
    }

    public void setCODIGO_PERFIL(Long CODIGO_PERFIL) {
        this.CODIGO_PERFIL = CODIGO_PERFIL;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (CODIGO_PERFIL != null ? CODIGO_PERFIL.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the CODIGO_PERFIL fields are not set
        if (!(object instanceof Perfil)) {
            return false;
        }
        Perfil other = (Perfil) object;
        if ((this.CODIGO_PERFIL == null && other.CODIGO_PERFIL != null) || (this.CODIGO_PERFIL != null && !this.CODIGO_PERFIL.equals(other.CODIGO_PERFIL))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.proyecto.entidades.Perfil[ id=" + CODIGO_PERFIL + " ]";
    }

}
