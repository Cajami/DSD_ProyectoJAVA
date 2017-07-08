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


public class Tipo_AutorizacionTest {
    
    public Tipo_AutorizacionTest() {
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
    public void testNuevoTipo_Autorizacion() {
        System.out.println("testNuevoTipo_Autorizacion");
        Tipo_Autorizacion tipo_autorizacion = new Tipo_Autorizacion();
        String expResult = "";
        tipo_autorizacion.setDESCRIPCION("APROBADO");
        String result = tipo_autorizacion.getDESCRIPCION();
        assertEquals(expResult, result);
    }
}
