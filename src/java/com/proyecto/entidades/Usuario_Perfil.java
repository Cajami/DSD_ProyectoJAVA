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
@Table(name = "USUARIO_PERFIL")
public class Usuario_Perfil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "CODIGO_USUARIO")
    private int CODIGO_USUARIO;
    @Id
    @Column(name = "CODIGO_PERFIL")
    private int CODIGO_PERFIL;
    @Column(name = "FECHA_VTO")
    private Date FECHA_VTO;

    public int getCODIGO_PERFIL() {
        return CODIGO_PERFIL;
    }

    public void setCODIGO_PERFIL(int CODIGO_PERFIL) {
        this.CODIGO_PERFIL = CODIGO_PERFIL;
    }

    public Date getFECHA_VTO() {
        return FECHA_VTO;
    }

    public void setFECHA_VTO(Date FECHA_VTO) {
        this.FECHA_VTO = FECHA_VTO;
    }

    public int getCODIGO_USUARIO() {
        return CODIGO_USUARIO;
    }

    public void setCODIGO_USUARIO(int CODIGO_USUARIO) {
        this.CODIGO_USUARIO = CODIGO_USUARIO;
    }

    @Override
    public String toString() {
        return "com.proyecto.entidades.Usuario_Perfil[ id=" + CODIGO_USUARIO + " ]";
    }

}
