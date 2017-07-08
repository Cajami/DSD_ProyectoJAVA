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
public class Excepcion_TasaTest {
    
    public Excepcion_TasaTest() {
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
     * Test of getCODIGO_PERFIL method, of class Excepcion_Tasa.
     */
    @Test
    public void testNuevaExcepcion_Tasa() {
        System.out.println("testNuevaExcepcion_Tasa");
        Excepcion_Tasa excepcion_tasa = new Excepcion_Tasa();
        int expResult = 0;
        excepcion_tasa.setCODIGO_PERFIL(1);
        excepcion_tasa.setCODIGO_EXCEPCION(15);
        int result = excepcion_tasa.getCODIGO_PERFIL();
        assertEquals(expResult, result);
    }
    
}
