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
public class Curso {
    private String nome;
    private String descricao;
    private int duracao_semestre;
    private ArrayList<Turma> turmas;

    public Curso(String nome, String descricao, int duracao_semestre) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao_semestre = duracao_semestre;
        this.turmas = new ArrayList<>();
    }

    public Curso() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao_semestre() {
        return duracao_semestre;
    }

    public void setDuracao_semestre(int duracao_semestre) {
        this.duracao_semestre = duracao_semestre;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
    
    public Turma getTurmaByID(int requestID){
        Turma turma= null;
        for (Turma atual : this.getTurmas()) {
            if(atual.getID()==requestID){
                turma = atual;
            }
        }
        return turma;
    }   
    public void showTurmas(){
        try {
            for (Turma atual : this.getTurmas()) {
                System.out.println("* "+atual.getID());
            }
        } catch (Exception e) {
            
        }
    }
    
    public Turma getTurmabyID(int requestID){
        Turma t = null;
        for(Turma atual:this.getTurmas()){
            if(atual.getID()==requestID){
                t=atual;
            }
        }
        return t;
    }
}
