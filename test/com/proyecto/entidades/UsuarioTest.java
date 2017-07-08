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


public class UsuarioTest {
    
    public UsuarioTest() {
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
    public void testNuevoUsuario() {
        Calendar fc_ing = Calendar.getInstance();
        fc_ing.set(1989, 2,15);
        
        System.out.println("testNuevoUsuario");
        Usuario usuario = new Usuario();
        int expResult = 0;
        usuario.setDESCRIPCION("FUNCIONARIO 1");
        //probar la fecha
        usuario.setFECHA_INGRESO(fc_ing.getTime()); 
        int result = usuario.getCODIGO_USUARIO();
        assertEquals(expResult, result);
       
    }
    
}
