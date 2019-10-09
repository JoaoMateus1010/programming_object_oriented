/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
/**
 *
 * @author joaom
 */
import funcionario.Funcionario;
import funcionario.FuncionarioBasico;
import funcionario.FuncionarioGraduado;
import funcionario.FuncionarioMedio;

public class Main {
    public static void main(String[] args) {
        Funcionario[] listFunc = new  Funcionario[10];
        //40% Básico
        listFunc[0] = new FuncionarioBasico("A", "Maria", "0",1);
        listFunc[1] = new FuncionarioBasico("AA", "João", "1",1);
        listFunc[2] = new FuncionarioBasico("AAA", "José", "2",2);
        listFunc[3] = new FuncionarioBasico("AAAA", "Marcos", "3",2);
        //40% Médio
        listFunc[4] = new FuncionarioMedio("B", "Jorge", "4",2);
        listFunc[5] = new FuncionarioMedio("BB", "Beatriz", "5",2);
        listFunc[6] = new FuncionarioMedio("BBB", "Claudia", "6",2);
        listFunc[7] = new FuncionarioMedio("BBBB", "Sara", "7",2);
        //20% sup8rior
        listFunc[8] = new FuncionarioGraduado("C", "Livia", "8",2);
        listFunc[9] = new FuncionarioGraduado("CC", "Mateus", "9",0);
        
        double result = 0;
        
        for (int i = 0; i < 10; i++) {
            result += listFunc[i].getRendaBasica();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(listFunc[i].toString());
        }
        System.out.println("Total: "+result);
    }
}
