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
import funcionario.*;

public class Main {
    public static void main(String[] args) {
        Funcionario f = new FuncionarioGraduado("A", "B", "0", 0);
        System.out.println(f.getRendaBasica());
    }
}
