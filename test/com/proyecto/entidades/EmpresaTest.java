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
public class EmpresaTest {
    
    public EmpresaTest() {
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

    /**
     * Test of getCODIGO_EMPLEADO method, of class Empresa.
     */
    @Test
    public void TestNuevaEmpresa() {
        System.out.println("TestNuevaEmpresa");
        Empresa empresa = new Empresa();
        empresa.setDESCRIPCION("CRAC RAIZ");
        int expResult = 0;
        int result = empresa.getCODIGO_EMPLEADO();
        assertEquals(expResult, result);
    }

    
}
