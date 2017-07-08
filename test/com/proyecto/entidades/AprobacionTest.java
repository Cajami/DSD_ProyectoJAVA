/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.entidades;

import java.util.Calendar;
import java.util.Date;
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
public class AprobacionTest {
    
    public AprobacionTest() {
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
     * Test of getCODIGO_AUTORIZACION method, of class Aprobacion.
     */
    @Test
    public void testNuevaAprobacion() {
        Calendar fc_apr = Calendar.getInstance();
        fc_apr.set(2017, 6,26);
        
        System.out.println("TestNuevaAprobacion");
        Aprobacion aprobacion = new Aprobacion();
        int expResult = 0;
        aprobacion.setCODIGO_AUTORIZACION(1);
        aprobacion.setCODIGO_USUARIO(1);
        aprobacion.setCOMENTARIO("TEST MODE");
        //probar la fecha
        aprobacion.setFECHA_APROBACION(fc_apr.getTime());
        int result = aprobacion.getCODIGO_AUTORIZACION();
        assertEquals(expResult, result);

    }
}
