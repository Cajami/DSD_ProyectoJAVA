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


public class PerfilTest {
    
    public PerfilTest() {
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
    public void testNuevoPerfil() {
        System.out.println("testNuevoPerfil");
        Perfil perfil = new Perfil();
        perfil.setDESCRIPCION("FSO");
        String expResult = "";
        String result = perfil.getDESCRIPCION();
        assertEquals(expResult, result);
    }

}
