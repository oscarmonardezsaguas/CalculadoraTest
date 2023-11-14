
package com.mycompany.calculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionTestEjemplo {
    private double a;
    private double b;
    
    public FuncionTestEjemplo() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println("@BeforeAll: Incializando test..."); 
    }
    
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("@AfterAll: Terminando test...");
    }
    
    @BeforeEach
    public void setUp() {
        a = 2.0;
        b = 2.0;
        System.out.println("BeforeEach: Ejecutando codigo antes del cada test...");
    }
    
    @AfterEach
    public void tearDown() {
        System.out.println("AfterEach: Ejecutando despues de terminar cada test...");
    }

    /**
     * Test of sumar method, of class Funcion.
     */
    @Test
    public void testSumar() {
        System.out.println("@Test: Ejecutando metodo sumar");  
        Funcion instance = new Funcion();
        double expResult = 4.0;
        double result = instance.sumar(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class Funcion.
     */
    @Test
    public void testRestar() {
        System.out.println("@Test: Ejecutando metodo restar");      
        Funcion instance = new Funcion();
        double expResult = 0.0;
        double result = instance.restar(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class Funcion.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("@Test: Ejecutando metodo multiplicar");  
        Funcion instance = new Funcion();
        double expResult = 5.0;
        double result = instance.multiplicar(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class Funcion.
     */
    @Test
    public void testDividir() {
        System.out.println("@Test: Ejecutando metodo dividir");     
        Funcion instance = new Funcion();
        double expResult = 0.0;
        double result = instance.dividir(a, b);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    
}
