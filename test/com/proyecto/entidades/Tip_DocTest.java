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


public class Tip_DocTest {
    
    public Tip_DocTest() {
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
    public void testNuevoTip_Doc() {
        System.out.println("testNuevoTip_Doc");
        Tip_Doc tip_doc = new Tip_Doc();
        int expResult = 0;
        tip_doc.setDESCRIPCION("DNI");
        int result = tip_doc.getCODITO_TIPDOC();
        assertEquals(expResult, result);
    }
}
