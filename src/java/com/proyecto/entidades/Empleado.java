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
@Table(name = "EMPLEADO")
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODIGO_EMPLEADO")
    private Long CODIGO_EMPLEADO;
    @Column(name = "CODIGO_PAIS")
    private Long CODIGO_PAIS;
    @Column(name = "CODIGO_TIPDOC")
    private Long CODIGO_TIPDOC;
    @Column(name = "NRO_DOC")
    private String NRO_DOC;
    @Column(name = "APELLIDO_PATERNO")
    private String APELLIDO_PATERNO;
    @Column(name = "APELLIDO_MATERNO")
    private String APELLIDO_MATERNO;
    @Column(name = "NOMBRES")
    private String NOMBRES;
    @Column(name = "FECHA_NACIMIENTO")
    private Date FECHA_NACIMIENTO;
    @Column(name = "DOMICILIO")
    private String DOMICILIO;

    public Long getCODIGO_EMPLEADO() {
        return CODIGO_EMPLEADO;
    }

    public void setCODIGO_EMPLEADO(Long CODIGO_EMPLEADO) {
        this.CODIGO_EMPLEADO = CODIGO_EMPLEADO;
    }

    public Long getCODIGO_PAIS() {
        return CODIGO_PAIS;
    }

    public void setCODIGO_PAIS(Long CODIGO_PAIS) {
        this.CODIGO_PAIS = CODIGO_PAIS;
    }

    public Long getCODIGO_TIPDOC() {
        return CODIGO_TIPDOC;
    }

    public void setCODIGO_TIPDOC(Long CODIGO_TIPDOC) {
        this.CODIGO_TIPDOC = CODIGO_TIPDOC;
    }

    public String getNRO_DOC() {
        return NRO_DOC;
    }

    public void setNRO_DOC(String NRO_DOC) {
        this.NRO_DOC = NRO_DOC;
    }

    public String getAPELLIDO_PATERNO() {
        return APELLIDO_PATERNO;
    }

    public void setAPELLIDO_PATERNO(String APELLIDO_PATERNO) {
        this.APELLIDO_PATERNO = APELLIDO_PATERNO;
    }

    public String getAPELLIDO_MATERNO() {
        return APELLIDO_MATERNO;
    }

    public void setAPELLIDO_MATERNO(String APELLIDO_MATERNO) {
        this.APELLIDO_MATERNO = APELLIDO_MATERNO;
    }

    public String getNOMBRES() {
        return NOMBRES;
    }

    public void setNOMBRES(String NOMBRES) {
        this.NOMBRES = NOMBRES;
    }

    public Date getFECHA_NACIMIENTO() {
        return FECHA_NACIMIENTO;
    }

    public void setFECHA_NACIMIENTO(Date FECHA_NACIMIENTO) {
        this.FECHA_NACIMIENTO = FECHA_NACIMIENTO;
    }

    public String getDOMICILIO() {
        return DOMICILIO;
    }

    public void setDOMICILIO(String DOMICILIO) {
        this.DOMICILIO = DOMICILIO;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }
    private String EMAIL;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (CODIGO_EMPLEADO != null ? CODIGO_EMPLEADO.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.CODIGO_EMPLEADO == null && other.CODIGO_EMPLEADO != null) || (this.CODIGO_EMPLEADO != null && !this.CODIGO_EMPLEADO.equals(other.CODIGO_EMPLEADO))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.proyecto.entidades.Empleado[ id=" + CODIGO_EMPLEADO + " ]";
    }

}
