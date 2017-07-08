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
@Table(name = "TIP_DOC")
public class Tip_Doc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODITO_TIPDOC")
    private Long CODITO_TIPDOC;
    @Column(name = "DESCRIPCION")
    private String DESCRIPCION;

    public Long getCODITO_TIPDOC() {
        return CODITO_TIPDOC;
    }

    public void setCODITO_TIPDOC(Long CODITO_TIPDOC) {
        this.CODITO_TIPDOC = CODITO_TIPDOC;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (CODITO_TIPDOC != null ? CODITO_TIPDOC.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tip_Doc)) {
            return false;
        }
        Tip_Doc other = (Tip_Doc) object;
        if ((this.CODITO_TIPDOC == null && other.CODITO_TIPDOC != null) || (this.CODITO_TIPDOC != null && !this.CODITO_TIPDOC.equals(other.CODITO_TIPDOC))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.proyecto.entidades.Tip_Doc[ id=" + CODITO_TIPDOC + " ]";
    }

}
