/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.psw;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas Lima
 * versão 2.0
 */
public class AlunoTest {
    
    public static Aluno n;
    public AlunoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        n= new Aluno();
    }
    
    @After
    public void tearDown() {
    }

   

    /**
     * Teste da situaçao onde a frequencia reprova
     */
    @Test
    public void testSituacao2() {
        System.out.println("situacao");
        double frequencia = 70;
        double p1 = 10;
        double trabalho = 10;
        double projeto = 10;
        double pf = 0;
        Aluno instance = new Aluno();
        String expResult = "Reprovado";
        String result = instance.situacao(frequencia, p1, trabalho, projeto, pf);
        assertEquals(expResult, result);
       
    }
     /**
     * Teste onde o aluno reprova por ter a media menor que 3
     */
    @Test
    public void testSituacao3() {
        System.out.println("situacao");
        double frequencia = 75;
        double p1 = 2;
        double trabalho = 2;
        double projeto = 2;
        double pf = 0;
        Aluno instance = new Aluno();
        String expResult = "Reprovado";
        String result = instance.situacao(frequencia, p1, trabalho, projeto, pf);
        assertEquals(expResult, result);
       
    }
     /**
     * Teste onde o aluno passa direto
     */
    @Test
    public void testSituacao() {
        System.out.println("situacao");
        double frequencia = 75;
        double p1 = 10;
        double trabalho = 10;
        double projeto = 10;
        double pf = 0;
        Aluno instance = new Aluno();
        String expResult = "Aprovado";
        String result = instance.situacao(frequencia, p1, trabalho, projeto, pf);
        assertEquals(expResult, result);
       
    }
    /**
     * Teste onde o aluno é aprovado com a pf
     */
    @Test
    public void testSituacao4() {
        System.out.println("situacao");
        double frequencia = 75;
        double p1 = 6;
        double trabalho = 6;
        double projeto = 6;
        double pf = 4;
        Aluno instance = new Aluno();
        String expResult = "Aprovado";
        String result = instance.situacao(frequencia, p1, trabalho, projeto, pf);
        assertEquals(expResult, result);
       
    }
    /**
     * Teste onde o aluno reprova fazendo pf
     */
    @Test
    public void testSituacao5() {
        System.out.println("situacao");
        double frequencia = 75;
        double p1 = 6;
        double trabalho = 6;
        double projeto = 6;
        double pf = 3;
        Aluno instance = new Aluno();
        String expResult = "Reprovado";
        String result = instance.situacao(frequencia, p1, trabalho, projeto, pf);
        assertEquals(expResult, result);
       
    }
    
}
