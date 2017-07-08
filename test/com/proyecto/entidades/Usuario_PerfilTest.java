/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.entidades;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
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
public class Usuario_PerfilTest {
    
    public Usuario_PerfilTest() {
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
    public void testNuevoUsuario_Perfil() {
        Calendar fc_vto = Calendar.getInstance();
        fc_vto.set(1989, 6,26);
        
        System.out.println("testNuevoUsuario_Perfil");
        Usuario_Perfil usuario_perfil = new Usuario_Perfil();
        int expResult = 0;
        usuario_perfil.setCODIGO_PERFIL(1);
        usuario_perfil.setCODIGO_USUARIO(1);
         //revisar si sirve la fecha
        usuario_perfil.setFECHA_VTO(fc_vto.getTime());
        int result = usuario_perfil.getCODIGO_PERFIL();
        assertEquals(expResult, result);
    }

}
