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
public class CtsTest {
    
    public CtsTest() {
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
    public void testNuevaCTS() {
        Calendar fc_ape = Calendar.getInstance();
        Calendar fc_ing = Calendar.getInstance();
        Calendar fc_mod = Calendar.getInstance();
        fc_ape.set(2017, 6,26);
        fc_ing.set(2017, 6,25);
        fc_mod.set(2017, 6,26);
        
        System.out.println("testNuevaCTS");
        Cts cts = new Cts();
        int expResult = 0;
        cts.setCODIGO_USUARIO(1);
        //PROBAR LAS FECHAS DE JAVA
        cts.setFECHA_APERTURA(fc_ape.getTime());
        cts.setFECHA_INGRESO(fc_ing.getTime());
        cts.setFECHA_MODIFICA(fc_mod.getTime());
        cts.setESTADO("OK");
        cts.setTASA(7);
        cts.setTRASLADO("1");
        
        int result = cts.getCODIGO_USUARIO();
        assertEquals(expResult, result);
    }

}
