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
public class PaisTest {
    
    public PaisTest() {
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
     * Test of getDESCRIPCION method, of class Pais.
     */
    @Test
    public void testNuevoPais() {
        System.out.println("testNuevoPais");
        Pais pais = new Pais();
        String expResult = "";
        pais.setDESCRIPCION("PERU");
        String result = pais.getDESCRIPCION();
        assertEquals(expResult, result);
        
    }
   
}
