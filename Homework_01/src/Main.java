package main;

import Q6.Data;
import Q6.Funcionario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scd = new Scanner(System.in);
        System.out.print("Digite o nome do funcionário:");
        String nome = sc.nextLine();
        System.out.print("Digite o departamento do funcionário:");
        String departamento = sc.nextLine();
        System.out.print("Digite o salário do funcionário:");
        double salario = scd.nextDouble();        
        System.out.print("Digite o RG do funcionário:");
        String RG = sc.nextLine();
        System.out.print("Digite o status do funcionário:");
        boolean status = sc.nextBoolean();
        System.out.print("Digite o dia de contratação do funcionário:");
        int dia = sc.nextInt();
        System.out.print("Digite o mes de contratação do funcionário:");
        int mes = sc.nextInt();
        System.out.print("Digite o ano de contratação do funcionário:");
        int ano = sc.nextInt();
        
        Funcionario funcionario = new Funcionario(nome, departamento, salario, new Data(dia, mes, ano), RG, status);
        System.out.println(funcionario.toString());
    }
}
