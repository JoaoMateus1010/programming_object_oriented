/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.util.ArrayList;

/**
 *
 * @author joaom
 */
public class Instituicao {

    private String nome;
    private Reitor reitor;
    private Secretaria secretaria;

    private ArrayList<Aluno> List_alunos;
    private ArrayList<Coordenador> List_coordenadores;
    private ArrayList<Professor> List_professores;
    private ArrayList<Curso> List_cursos;

    public Instituicao(String nome, Reitor reitor, Secretaria secretaria) {
        this.nome = nome;
        this.reitor = reitor;
        this.secretaria = secretaria;
        this.List_alunos = new ArrayList<>();
        this.List_coordenadores = new ArrayList<>();
        this.List_professores = new ArrayList<>();
        this.List_cursos = new ArrayList<>();
    }

    public Instituicao() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Reitor getReitor() {
        return reitor;
    }

    public void setReitor(Reitor reitor) {
        this.reitor = reitor;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }

    public ArrayList<Aluno> getList_alunos() {
        return List_alunos;
    }

    public void setList_alunos(ArrayList<Aluno> List_alunos) {
        this.List_alunos = List_alunos;
    }

    public ArrayList<Coordenador> getList_coordenadores() {
        return List_coordenadores;
    }

    public void setList_coordenadores(ArrayList<Coordenador> List_coordenadores) {
        this.List_coordenadores = List_coordenadores;
    }

    public ArrayList<Professor> getList_professores() {
        return List_professores;
    }

    public void setList_professores(ArrayList<Professor> List_professores) {
        this.List_professores = List_professores;
    }

    public ArrayList<Curso> getList_cursos() {
        return List_cursos;
    }

    public void setList_cursos(ArrayList<Curso> List_cursos) {
        this.List_cursos = List_cursos;
    }

    public boolean VerificaDuplicidadeAluno(Aluno aluno) {
        boolean ret = false;
        try {
            for (Aluno atual : List_alunos) {
                if ((atual.getEmail().equals(aluno.getEmail())) && (atual.getSenha() == aluno.getSenha())) {
                    ret = true;
                }
            }
        } catch (Exception e) {

        }
        return ret;
    }

    public boolean VerificaDuplicidadeCoordenador(Coordenador coordenador) {
        boolean ret = false;
        try {
            for (Coordenador atual : List_coordenadores) {
                if ((atual.getEmail().equals(coordenador.getEmail())) && (atual.getSenha() == coordenador.getSenha())) {
                    ret = true;
                }
            }
        } catch (Exception e) {

        }
        return ret;
    }

    public boolean VerificaDuplicidadeProfessor(Professor professor) {
        boolean ret = false;
        try {
            for (Professor atual : List_professores) {
                if ((atual.getEmail().equals(professor.getEmail())) && (atual.getSenha() == professor.getSenha())) {
                    ret = true;
                }
            }
        } catch (Exception e) {

        }
        return ret;
    }
    
    public void CadastrarProfessor(Professor professor){
        try {
            this.getList_professores().add(professor);
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar professor!");
        }
    }
    
    public void CadastrarCurso(Curso curso){
        try {
            this.getList_cursos().add(curso);
        } catch (Exception e) {
            System.out.println("Erro ao adicionar o curso!");
        }
    }
    
    public void showAlunos(){
        try {
            for (Aluno aluno: this.getList_alunos()) {
                System.out.println("* "+aluno.getNome());
            }
        } catch (Exception e) {
            
        }
    }
    public void showCoordenadores(){
        try {
            for (Coordenador coordenador: this.getList_coordenadores()) {
                System.out.println("* "+coordenador.getNome());
            }
        } catch (Exception e) {
            
        }
    }

    public void showProfessores() {
        try {
            for (Professor professor : this.getList_professores()) {
                System.out.println("* " + professor.getNome());
            }
        } catch (Exception e) {

        }
    }
     public void showCursos() {
        try {
            for (Curso curso : this.getList_cursos()) {
                System.out.println("* " + curso.getNome());
            }
        } catch (Exception e) {

        }
    }
    
    public Curso getCursoToNome(String nome) {
        Curso curso = null;
        for (Curso atual : this.getList_cursos()) {
            if (atual.getNome().equals(nome)) {
                curso = atual;
                break;
            }
        }
        return curso;
    }
    public Aluno getAlunoToNome(String nome) {
        Aluno aluno = null;
        for (Aluno atual : this.getList_alunos()) {
            if (atual.getNome().equals(nome)) {
                aluno = atual;
                break;
            }
        }
        return aluno;
    }
    
    public Professor getProfessorToLogin(String nome){
        Professor professor = null;
        for (Professor atual:this.getList_professores()){
            if(atual.getNome().equals(nome)){
                professor = atual;
                break;                
            }
        }
        return professor;
    }
    
    public Professor getProfessorByLoginAndPassword(String login,int senha){
        Professor professor = null;
        for (Professor atual : this.getList_professores()) {
            if((atual.getEmail().equals(login))&&(atual.getSenha()==senha)){
                professor = atual;
            }
        }
        return professor;
    }
    public Aluno getAlunoByLoginAndPassword(String login,int senha){
        Aluno aluno = null;
        for (Aluno atual : this.getList_alunos()) {
            if((atual.getEmail().equals(login))&&(atual.getSenha()==senha)){
                aluno = atual;
            }
        }
        return aluno;
    }    
}
