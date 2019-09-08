/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import aluno.Cadastro;
import java.util.Scanner;

/**
 *
 * @author joaom
 */
public class Main {

    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        int op = 1;
        Cadastro cadastro = new Cadastro(10);
        do {
            System.out.println("1-Adicionar Contato\n2-Resetar Agenda\n3-Buscar por telefone\n4-Atualizar contato\n5-Remover contato\n6-Todos os contatos\n7-Buscar teleefones por nome\n8-Sair");
            op = scInt.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digite o Nome:");
                    String nomeAdd = scStr.nextLine();
                    System.out.println("Digite o Telefone:");
                    String telefoneAdd = scStr.nextLine();
                    if(cadastro.adicionarContato(telefoneAdd, nomeAdd)){
                        System.out.println("Cadastrado com sucesso!");
                    }else{
                        System.out.println("Agenda cheia!");
                    }
                    break;
                case 3:
                    System.out.println("Digite o Telefone:");
                    String telefoneB = scStr.nextLine();
                    try {
                        System.out.println(cadastro.getContatoByTel(telefoneB).toString());
                    } catch (Exception e) {
                        System.out.println("Contato não encontrado!");
                    }
                    break;
                case 4:
                    System.out.println("Digite o Telefone da busca:");
                    String telefoneUp = scStr.nextLine();                    
                    System.out.println("Digite o novo Nome:");
                    String nomeUp = scStr.nextLine();
                    if(cadastro.atualizarContato(telefoneUp, nomeUp)){
                        System.out.println("Atualização realizada com sucesso!");
                    }else{
                        System.out.println("Contato não encontrado!");
                    }
                    break;
                case 5:
                    System.out.println("Digite o Telefone da remoção:");
                    String telefoneDel = scStr.nextLine();
                    if(cadastro.removerContato(telefoneDel)){
                        System.out.println("Remoção efetuada com sucesso!");
                    }else{
                        System.out.println("Falha ao contrar o contato!");
                    }
                    break;
                case 6:
                    System.out.println(cadastro.getContatos().toString());
                    break;
                case 7:
                    System.out.println("Digite o Nome:");
                    String nomeB2 = scStr.nextLine();
                    System.out.println(cadastro.getTelefones(nomeB2));
                    break;
                case 8:
                    System.exit(0);
                    break;
                case 2:
                    System.out.println("Digite o número máximo:");
                    int max = scInt.nextInt();
                    cadastro.resetAgenda(max);
                    break;
            }
        } while (op != 8);
    }
}
