/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.psw;

/**
 *
 * @author Lucas Lima
 * versão 2.0
 */
public class Aluno {
    
    /**
 *
 * Metodo que retorna a situacao de um Aluno
 * frequencia = frequencia de presenca do aluno nas aulas
 * p1 = nota da primeira prova
 * trabalho = nota do trabalho
 * projeto = nota dos projetos feitos em aula
 * pf = nota da pf, caso o aluno tenha ficado em pf
 */
    
    public String situacao(double frequencia, double p1, double trabalho, double projeto, double pf){
         double m1 = (0.7 * ((p1 + trabalho) / 2)) + (projeto * 0.3);
         String situacao;
         
        if(frequencia >= 75){
            if(m1 >= 7) 
                situacao= "Aprovado";
            else if (m1 < 3) 
                situacao = "Reprovado";
            else{
                
                if( ((pf + m1) / 2) >= 5)
                    situacao = "Aprovado";
                else
                    situacao = "Reprovado";
            }
        }else{
            situacao= "Reprovado";
        }
    
        return situacao;
    }
    
}
