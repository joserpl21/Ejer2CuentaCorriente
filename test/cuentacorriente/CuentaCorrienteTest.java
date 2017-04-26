/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentacorriente;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Berta
 */
public class CuentaCorrienteTest {
    
    public CuentaCorrienteTest() {
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
     * Test of ingresar method, of class CuentaCorriente.
     */
    @Test
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        double cantidad = 100.0;
        CuentaCorriente instance = new CuentaCorriente("Berta","111111111",1500,0.0);
        instance.ingresar(cantidad);
        assertEquals(1600, instance.estado(),0.0);
    }

    /**
     * Test of retirar method, of class CuentaCorriente.
     */
    @Test
    public void testRetirar() throws Exception {
        System.out.println("retirar");
        double cantidad = 100.0;
        CuentaCorriente instance = new CuentaCorriente("Berta","111111111",1500,0.0);
        instance.retirar(cantidad);
        assertEquals(1400, instance.estado(),0.0);
    }

    /**
     * Test of ingresar and retirar methods, of class CuentaCorriente.
     */
    @Test
    public void testIngresarRetirar() throws Exception {
        System.out.println("obtenerCuenta");
        CuentaCorriente instance = new CuentaCorriente("Berta","111111111",1500,0.0);
        instance.retirar(100);
        instance.ingresar(200);
        assertEquals(1600, instance.estado(),0.0);
    }
    
}
