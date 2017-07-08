/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.entidades;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class Empresa_EmpleadoTest {
    
    public Empresa_EmpleadoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testNuevoEmpresa_Empleado() {
        System.out.println("testNuevoEmpresa_Empleado");
        Empresa_Empleado empresa_empleado = new Empresa_Empleado();
        int expResult = 0;
        empresa_empleado.setCODIGO_CTS(1);
        empresa_empleado.setCODIGO_EMPLEADO(1);
        empresa_empleado.setCODIGO_EMPRESA(1);
        empresa_empleado.setREMUNERACION(3000);
        int result = empresa_empleado.getCODIGO_EMPLEADO();
        assertEquals(expResult, result);

    }
    
}
