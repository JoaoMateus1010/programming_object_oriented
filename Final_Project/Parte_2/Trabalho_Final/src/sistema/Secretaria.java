/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.util.Scanner;

/**
 *
 * @author joaom
 */
public class Secretaria {  
    private String login;
    private int senha;

    public Secretaria(String login, int senha) {
        this.login = login;
        this.senha = senha;
    }

    public Secretaria() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
            
    
    public void Abrir_Turmas(Sistema atual) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o curso que deseja adicionar uma turma: ");
        atual.getInstituicao().showCursos();
        String nome = sc.nextLine();
        Curso cursoEscolhido = atual.getInstituicao().getCursoToNome(nome);
        if (cursoEscolhido != null) {
            System.out.println("Curso selecionado");
            Turma turma = new Turma();
            cursoEscolhido.getTurmas().add(turma);
            System.out.println("Turma " + turma.getID() + " foi adicionada ao curso " + nome);
            System.out.println("Criado uma turma para o curso " + nome);
            System.out.println("!Apenas coordenadores e reitores pondem adicionar a disciplina na turma criada, entre em contato com eles!");
        } else {
            System.out.println("Curso não encontrado com o nome digitado!");
        }
    }   
    public void Cadastrar_Aluno(Sistema atual) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o nome do Aluno: ");
            String aluno_nome = sc.nextLine();
            System.out.print("Digite o email do aluno: ");
            String aluno_email = sc.nextLine();
            System.out.print("Digite a senha do aluno: ");
            int aluno_senha = sc.nextInt();
            Aluno aluno = new Aluno(aluno_nome, aluno_email, aluno_senha);
            if (!atual.getInstituicao().VerificaDuplicidadeAluno(aluno)) {
                atual.getInstituicao().getList_alunos().add(aluno);
                System.out.println("Aluno cadastrado com sucesso");
            } else {
                System.out.println("Aluno já cadastrado");
            }
        } catch (Exception e) {
            System.out.println("Dados inválidos");
        }
    } 
    public void Matricular_Aluno(Sistema atual) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o curso que deseja matricular o aluno: ");
        atual.getInstituicao().showCursos();
        String nome_matricula = sc.nextLine();
        Curso cursoEscolhidoMatricular = atual.getInstituicao().getCursoToNome(nome_matricula);
        if (cursoEscolhidoMatricular != null) {
            System.out.println("Curso selecionado");
            System.out.println("Selecione o aluno que irá matricular no curso " + nome_matricula);
            atual.getInstituicao().showAlunos();
            System.out.print("Digite: ");
            String nome_aluno_matricula = sc.nextLine();
            Aluno escolhidoAluno = atual.getInstituicao().getAlunoToNome(nome_aluno_matricula);
            if (escolhidoAluno != null) {
                System.out.println("Aluno " + escolhidoAluno.getNome() + " selecionado");
                escolhidoAluno.setCurso(cursoEscolhidoMatricular);
                System.out.println("Escolha a turma que deseja matricular o aluno "+escolhidoAluno.getNome());
                cursoEscolhidoMatricular.showTurmas();
                sc = new Scanner(System.in);
                Turma matriculadoTurma = cursoEscolhidoMatricular.getTurmaByID(sc.nextInt());
                if(matriculadoTurma!=null){
                    matriculadoTurma.getDisciplina().getList_alunos_matriculados().add(escolhidoAluno);
                }else{
                    System.out.println("Turma não encontrada");
                }
            } else {
                System.out.println("Aluno não encontrado!");
            }
        } else {
            System.out.println("Curso não encontrado com o nome digitado!");
        }
    }
    public void Emitir_Historico(Sistema atual) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione o aluno que deseja emitir o histórico ");
        atual.getInstituicao().showAlunos();
        System.out.print("Digite: ");
        String nome_alunoHist = sc.nextLine();
        Aluno alunoHist = atual.getInstituicao().getAlunoToNome(nome_alunoHist);
        if (alunoHist != null) {
            //Colocar função aluno->EmitirHistorico quando tiver feita para aluno
        } else {
            System.out.println("Aluno não encontrado");
        }
    }   
}
