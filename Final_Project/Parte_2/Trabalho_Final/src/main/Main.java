package main;

import java.util.ArrayList;
import java.util.Scanner;
import sistema.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    private static final ArrayList<Sistema> List_Sistemas = new ArrayList<>();

    public static void main(String[] args) {
        Sistema atualSistema;
        Scanner sc_str = new Scanner(System.in);
        int escolhaSistema = -1;
        while (true) {
            System.out.println("---> Bem vindo ao Sistema Geral");
            System.out.println("1-Entrar no sistema");
            System.out.println("2-Criar novo sistema");
            System.out.println("3-Visualizar sistemas cadastrados");
            System.out.println("4-Sair");
            System.out.print("Digite: ");
            try {
                escolhaSistema = sc.nextInt();
                switch (escolhaSistema) {
                    case 1:
                        try {
                            System.out.print("Digite o login do sistema: ");
                            int s_login_l = sc.nextInt();
                            System.out.print("Digite a senha do sistema: ");
                            int s_senha_l = sc.nextInt();
                            Sistema reqSistema = Sistema.verifica_duplicidade(List_Sistemas, new Sistema(null, s_login_l, s_senha_l));
                            System.out.println(reqSistema.getNome());
                            if (reqSistema != null) {
                                if ((reqSistema.getLogin() == s_login_l) && (reqSistema.getSenha() == s_senha_l)) {
                                    atualSistema = reqSistema;                                    
                                    Main.initSistema(atualSistema);
                                } else {
                                    System.out.println("Senha ou login incorreto");
                                }
                            } else {
                                System.out.println("Sistema não encontrado");
                            }
                        } catch (Exception e) {
                            System.out.println("Dados inválidos");
                        }
                        break;
                    case 2:
                        try {
                            System.out.println("---> Criação de um novo sistema");
                            System.out.print("Digite o nome do sistema: ");
                            String s_nome = sc_str.nextLine();
                            System.out.print("Digite o login do sistema: ");
                            int s_login = sc.nextInt();
                            System.out.print("Digite a senha do sistema: ");
                            int s_senha = sc.nextInt();
                            Sistema requeridoSistema = new Sistema(s_nome, s_login, s_senha);
                            if (Sistema.verifica_duplicidade(List_Sistemas, requeridoSistema) == null) {
                                List_Sistemas.add(requeridoSistema);
                                System.out.println("-> Sistema Adicionado");
                            } else {
                                System.out.println("! Sistema já adicionado !");
                            }
                        } catch (Exception e) {
                            System.out.println("Dados inválidos");
                            break;
                        }
                        break;
                    case 3:
                        System.out.println("-- Sistemas adicionados --");
                        List_Sistemas.forEach((nowSys) -> {
                            System.out.println(nowSys.getNome());
                        });
                        break;
                    case 4:
                        System.exit(0);
                        break;

                }
            } catch (Exception e) {
                System.out.println("Informação inválida");
                sc = new Scanner(System.in);
            }
        }
    }

    public static void initSistema(Sistema atual) {
        System.out.println("Sistema escolhido: " + atual.getNome());
        Scanner sc = new Scanner(System.in);
        String login = null;
        int senha;
        while (true) {
            try {
                if (atual.getInstituicao() != null) {
                    System.out.println("--> Deseja entrar como:");
                    System.out.println("1-Aluno");
                    System.out.println("2-Professor");
                    System.out.println("3-Reitor");
                    System.out.println("4-Coordenador");
                    System.out.println("5-Secretaria");
                    System.out.println("6-Sair");
                    System.out.print("Digite: ");
                    switch (sc.nextInt()) {
                        case 1: // ALUNO
                            sc = new Scanner(System.in);
                            System.out.println("Digite o login: ");
                            login = sc.nextLine();
                            System.out.println("Digite a senha: ");
                            senha = sc.nextInt();
                            Aluno reqAluno = atual.getInstituicao().getAlunoByLoginAndPassword(login, senha);
                            if(reqAluno!=null){
                                FluxoAluno(atual, reqAluno);
                            }else{
                                System.out.println("Aluno não encontrado");
                            }
                            break;
                        case 2://PROFESSOR
                            sc = new Scanner(System.in);
                            System.out.println("Digite o login: ");
                            login = sc.nextLine();
                            System.out.println("Digite a senha: ");
                            senha = sc.nextInt();
                            Professor requiredProfessor = atual.getInstituicao().getProfessorByLoginAndPassword(login, senha);
                            if(requiredProfessor!=null){
                                FluxoProfessor(atual, requiredProfessor);
                            }else{
                                System.out.println("Professor não encontrado");
                            }
                            break;
                        case 3://REITOR
                            sc = new Scanner(System.in);
                            System.out.println("Digite o login: ");
                            login = sc.nextLine();
                            System.out.println("Digite a senha: ");
                            senha = sc.nextInt();
                            if ((atual.getInstituicao().getReitor().getEmail().equals(login)) && (atual.getInstituicao().getReitor().getSenha() == senha)) {
                                FluxoReitor(atual);
                            } else {
                                System.out.println("Dados incorretor, tente novamente!");
                            }
                            break;
                        case 4://COORDENADOR
                            sc = new Scanner(System.in);
                            System.out.println("Digite o login: ");
                            login = sc.nextLine();
                            System.out.println("Digite a senha: ");
                            senha = sc.nextInt();      
                            if((atual.getInstituicao().getList_coordenadores().get(0).getEmail().equals(login))&&(atual.getInstituicao().getList_coordenadores().get(0).getSenha()==senha)){
                                FluxoCoordenador(atual);
                            }
                            break;
                        case 5://SECRETARIA
                            sc = new Scanner(System.in);
                            System.out.println("Digite o login: ");
                            login = sc.nextLine();
                            System.out.println("Digite a senha: ");
                            senha = sc.nextInt();
                            if((atual.getInstituicao().getSecretaria().getLogin().equals(login))&&(atual.getInstituicao().getSecretaria().getSenha()==senha)){
                                FluxoSecretaria(atual);
                            }else{
                                System.out.println("Dados incorretor, tente novamente!");
                            }
                            break;
                        case 6://SAIR
                            main(null);
                            break;
                        default:
                            System.out.println("Alunos");
                            atual.getInstituicao().getList_alunos().forEach((val)->{System.out.println(val.getNome());});
                            System.out.println("Professores");
                            atual.getInstituicao().getList_professores().forEach((val)->{System.out.println(val.getNome());});
                            System.out.println("Cursos");
                            atual.getInstituicao().getList_cursos().forEach((val)->{System.out.println(val.getNome());});                            
                            
                            
                    }
                } else {
                    System.out.println("! O sistema atual não contém nenhuma instituição cadastrada !");
                    System.out.println("-> Cadastro da instituição");
                    System.out.print("Digite o nome da instituição: ");
                    String inst_nome = sc.nextLine();

                    System.out.println("--> Cadastro do Reitor ");
                    System.out.print("Digite o nome do Reitor: ");
                    String reitor_nome = sc.nextLine();
                    System.out.print("Digite o email do Reitor: ");
                    String reitor_email = sc.nextLine();
                    System.out.print("Digite a senha do Reitor: ");
                    int reitor_senha = sc.nextInt();
                    System.out.print("Digite a senha especial do Reitor: ");
                    int reitor_senha_especial = sc.nextInt();
                    System.out.print("Digite o total de crédito aceitável: ");
                    int reitor_total_credito = sc.nextInt();
                    if(reitor_total_credito>16){
                        System.out.println("Total de créditos acima do permitido, colocado valor máximo 16 horas!");
                        reitor_total_credito = 16;
                    }else if(reitor_total_credito<8){
                        System.out.println("Total de créditos baixo do permitido, colocado valor mínimo 8 horas!");
                        reitor_total_credito = 8;
                    }
                    sc = new Scanner(System.in);

                    System.out.println("--> Cadastro da Secretaria: ");
                    System.out.print("Digite o login da secretaria: ");
                    String secretaria_login = sc.nextLine();
                    System.out.print("Digite a senha da secretaria: ");
                    int secretaria_senha = sc.nextInt();

                    atual.setInstituicao(new Instituicao(inst_nome, new Reitor(reitor_senha_especial, reitor_total_credito, reitor_nome, reitor_email, reitor_senha), new Secretaria(secretaria_login, secretaria_senha)));                                 
                }
            } catch (Exception e) {
                System.out.println("Opção inválida");
            } finally {
                sc = new Scanner(System.in);
            }
        }
    }

    public static void FluxoAluno(Sistema atual,Aluno aluno) {
        sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("*********************");
                System.out.println("*****  Aluno  "+aluno.getNome()+"*******");
                System.out.println("*********************");
                System.out.println("1- Emitir Resultados Finais");
                System.out.println("2- Sair");
                switch (sc.nextInt()) {
                    case 1:
                        aluno.Emitir_Historico_de_Medias(atual);
                        break;
                    case 2:
                        initSistema(atual);
                        break;
                }
            } catch (Exception e) {
                System.out.println("Opção inválida");
                sc = new Scanner(System.in);
            }

        }

    }

    public static void FluxoProfessor(Sistema atual,Professor professor) {
        sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("*************************");
                System.out.println("*****  Professor  "+professor.getNome()+"*******");
                System.out.println("*************************");
                System.out.println("1- Lançar Resultados Finais (Médias e frquências)");
                System.out.println("2- Sair");
                switch (sc.nextInt()) {
                    case 1:
                        professor.Lancar_Medias_Finais_e_Frquencia(atual);
                        break;
                    case 2:
                        initSistema(atual);
                        break;
                }
            } catch (Exception e) {
                System.out.println("Opção inválida");
                sc = new Scanner(System.in);
            }
        }
    }

    public static void FluxoReitor(Sistema atual) {
        sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("**********************");
                System.out.println("*****  Reitor  "+atual.getInstituicao().getReitor().getNome()+"*******");
                System.out.println("**********************");
                System.out.println("1- Cadastrar Professor");
                System.out.println("2- Cadastrar Curso");
                System.out.println("3- Adicionar disciplina");
                System.out.println("4- Sair");
                switch (sc.nextInt()) {
                    case 1:
                        atual.getInstituicao().getReitor().Cadastrar_Professor(atual);
                        break;
                    case 2:
                        atual.getInstituicao().getReitor().Cadastrar_Curso(atual);
                        break;
                    case 3:
                        atual.getInstituicao().getReitor().Adicionar_Disciplina(atual);
                        break;
                    case 4:
                        initSistema(atual);
                        break;                        
                }
            } catch (Exception e) {
                System.out.println("Opção inválida");
                sc = new Scanner(System.in);
            }
        }
    }

    public static void FluxoCoordenador(Sistema atual) {
        sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("***************************");
                System.out.println("*****  Coordenador  *******");
                System.out.println("***************************");
                System.out.println("1- Adicionar disciplina");
                System.out.println("2- Sair");
                switch (sc.nextInt()) {
                    case 1://OK
                        atual.getInstituicao().getReitor().Adicionar_Disciplina(atual);
                        break;
                    case 2://OK
                        initSistema(atual);
                        break;
                }
            } catch (Exception e) {
                System.out.println("Opção inválida");
                sc = new Scanner(System.in);
            }
        }
    }

    public static void FluxoSecretaria(Sistema atual) {
        sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("**************************");
                System.out.println("*****  Secretaria  *******");
                System.out.println("**************************");
                System.out.println("1- Cadastrar turmas");
                System.out.println("2- Cadastrar alunos");
                System.out.println("3- Matricular Aluno");
                System.out.println("4- Emitir Histórico");
                System.out.println("5- Sair");
                switch (sc.nextInt()){
                    case 1:
                        atual.getInstituicao().getSecretaria().Abrir_Turmas(atual);//OK
                        break;
                    case 2:
                        atual.getInstituicao().getSecretaria().Cadastrar_Aluno(atual);//OK
                        break;
                    case 3:
                        atual.getInstituicao().getSecretaria().Matricular_Aluno(atual);//OK
                        break;
                    case 4:
                        atual.getInstituicao().getSecretaria().Emitir_Historico(atual);//OK
                        break;
                    case 5:
                        initSistema(atual);
                        break;
                }
            } catch (Exception e) {
                System.out.println("Opção inválida");
                sc = new Scanner(System.in);
            }
        }
    }
}
