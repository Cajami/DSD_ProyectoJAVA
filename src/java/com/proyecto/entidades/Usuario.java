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
    private Long CODIGO_USUARIO;
    @Column(name = "DESCRIPCION")
    private String DESCRIPCION;
    @Column(name = "FECHA_INGRESO")
    private Date FECHA_INGRESO;

    public Long getCODIGO_USUARIO() {
        return CODIGO_USUARIO;
    }

    public void setCODIGO_USUARIO(Long CODIGO_USUARIO) {
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
    public int hashCode() {
        int hash = 0;
        hash += (CODIGO_USUARIO != null ? CODIGO_USUARIO.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.CODIGO_USUARIO == null && other.CODIGO_USUARIO != null) || (this.CODIGO_USUARIO != null && !this.CODIGO_USUARIO.equals(other.CODIGO_USUARIO))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.proyecto.entidades.Usuario[ id=" + CODIGO_USUARIO + " ]";
    }
    
}
