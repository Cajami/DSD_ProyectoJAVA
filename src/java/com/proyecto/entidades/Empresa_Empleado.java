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

/**
 *
 * @author JAVIER-PC
 */
@Entity
public class Empresa_Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "CODIGO_EMPRESA")
    private int CODIGO_EMPRESA;
    @Id
    @Column(name = "CODIGO_EMPLEADO")
    private int CODIGO_EMPLEADO;
    @Id
    @Column(name = "CODIGO_CTS")
    private int CODIGO_CTS;
    @Column(name = "REMUNERACION")
    private double REMUNERACION;

    public int getCODIGO_EMPLEADO() {
        return CODIGO_EMPLEADO;
    }

    public void setCODIGO_EMPLEADO(int CODIGO_EMPLEADO) {
        this.CODIGO_EMPLEADO = CODIGO_EMPLEADO;
    }

    public int getCODIGO_CTS() {
        return CODIGO_CTS;
    }

    public void setCODIGO_CTS(int CODIGO_CTS) {
        this.CODIGO_CTS = CODIGO_CTS;
    }

    public double getREMUNERACION() {
        return REMUNERACION;
    }

    public void setREMUNERACION(double REMUNERACION) {
        this.REMUNERACION = REMUNERACION;
    }

    public int getCODIGO_EMPRESA() {
        return CODIGO_EMPRESA;
    }

    public void setCODIGO_EMPRESA(int CODIGO_EMPRESA) {
        this.CODIGO_EMPRESA = CODIGO_EMPRESA;
    }

    @Override
    public String toString() {
        return "com.proyecto.entidades.Empresa_Empleado[ id=" + CODIGO_EMPRESA + " ]";
    }

}
