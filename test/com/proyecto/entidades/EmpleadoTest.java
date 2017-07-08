/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.entidades;

import com.sun.xml.wss.util.DateUtils;
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
public class EmpleadoTest {
    
    public EmpleadoTest() {
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
     * Test of getCODIGO_EMPLEADO method, of class Empleado.
     */
    @Test
    public void testNuevoempleado() {
        Calendar fc_nac = Calendar.getInstance();
        fc_nac.set(1980, 1,20);
                
        System.out.println("testNuevoempleado");
        Empleado empleado = new Empleado();
        empleado.setCODIGO_PAIS(1);
        empleado.setCODIGO_TIPDOC(1);
        empleado.setNRO_DOC("45818405");
        empleado.setAPELLIDO_PATERNO("HUARCAYA");
        empleado.setAPELLIDO_MATERNO("SALAS");
        empleado.setNOMBRES("JONATHAN");
        //probar la fecha
        empleado.setFECHA_NACIMIENTO(fc_nac.getTime()); 
        empleado.setDOMICILIO("Av. Paso de los Andes 1171");
        empleado.setEMAIL("jhs@hotmail.com");
        
        int expResult = 0;
        int result = empleado.getCODIGO_EMPLEADO();
        assertEquals(expResult, result);
        
    }

       
}

