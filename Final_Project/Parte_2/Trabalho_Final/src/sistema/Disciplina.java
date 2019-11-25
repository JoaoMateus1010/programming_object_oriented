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
public class Disciplina {
    private String nome;
    private int nummero_creditos;
    private int Horario;
    /*
    1- Primeiro horário da manhã
    2- Segundo horário da manhã
    3- Primeiro Horário da tarde
    4- Segundo horário da tarde
    5- Primeiro Horário da noite
    6- Segundo horário ad noite            
    */
    private int dia_Semana;
    /*
    1-Segunda
    2-Terça
    3-Quarta
    4-Quinta
    5-Sexta
    */
    private int Semestre;
    private Disciplina prerequisito;
    private Professor professor;
    private ArrayList<Avaliacao> avaliacoes;
    private ArrayList<Aluno> List_alunos_matriculados;

    public Disciplina(String nome, int nummero_creditos, int Horario, int dia_Semana, int Semestre, Professor professor) {
        this.nome = nome;
        this.nummero_creditos = nummero_creditos;
        this.Horario = Horario;
        this.dia_Semana = dia_Semana;
        this.Semestre = Semestre;
        this.professor = professor;
        this.avaliacoes = new ArrayList<>();
        this.List_alunos_matriculados = new ArrayList<>();
    }    
        

    public Disciplina() {
    }

    public int getDia_Semana() {
        return dia_Semana;
    }

    public void setDia_Semana(int dia_Semana) {
        this.dia_Semana = dia_Semana;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNummero_creditos() {
        return nummero_creditos;
    }

    public void setNummero_creditos(int nummero_creditos) {
        this.nummero_creditos = nummero_creditos;
    }

    public int getHorario() {
        return Horario;
    }

    public void setHorario(int Horario) {
        this.Horario = Horario;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    public Disciplina getPrerequisito() {
        return prerequisito;
    }

    public void setPrerequisito(Disciplina prerequisito) {
        this.prerequisito = prerequisito;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public ArrayList<Aluno> getList_alunos_matriculados() {
        return List_alunos_matriculados;
    }

    public void setList_alunos_matriculados(ArrayList<Aluno> List_alunos_matriculados) {
        this.List_alunos_matriculados = List_alunos_matriculados;
    }
        
}
