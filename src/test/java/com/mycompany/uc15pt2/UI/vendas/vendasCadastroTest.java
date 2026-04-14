/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.uc15pt2.UI.vendas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author danto
 */
public class vendasCadastroTest {
    
    public vendasCadastroTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of desconto method, of class vendasCadastro.
     * @param valor
     */
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 3, 5, 10})
    public void testDesconto(int valor) {
        System.out.println("teste com valor:" + valor);
        int numero = 100;
        int valorCalculo = (numero*valor)/100;
        int valorTeste = numero - valorCalculo;
        vendasCadastro instance = new vendasCadastro();
        int expResult = valorTeste;
        int numero2 = 100;
        int result = instance.desconto(valor, numero, numero2);
        assertEquals(expResult, result);
    }
    
}
