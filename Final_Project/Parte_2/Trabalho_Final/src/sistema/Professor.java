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
public class Professor extends Pessoa{
    private int total_creditos;

    public Professor(int total_creditos, String nome, String email, int senha) {
        super(nome, email, senha);
        this.total_creditos = total_creditos;
    }

    public Professor(int total_creditos) {
        this.total_creditos = total_creditos;
    }

    public int getTotal_creditos() {
        return total_creditos;
    }

    public void setTotal_creditos(int total_creditos) {
        this.total_creditos = total_creditos;
    }
    
    public boolean Lancar_Medias_Finais_e_Frquencia(Sistema atual){
        Scanner sc_str = new Scanner(System.in);
        Scanner sc_int = new Scanner(System.in);
        try {
            for(Curso curso:atual.getInstituicao().getList_cursos()){
                for(Turma turma:curso.getTurmas()){
                    if((turma.getDisciplina().getProfessor().getEmail().equals(this.getEmail()))&&(turma.getDisciplina().getProfessor().getSenha()==this.getSenha())){
                        System.out.println("Curso: "+curso.getNome());
                        System.out.println("Turma:"+turma.getID());
                        System.out.println("Disciplina: "+turma.getDisciplina().getNome());
                        for(Aluno aluno:turma.getDisciplina().getList_alunos_matriculados()){
                            Avaliacao avN = new Avaliacao();
                            avN.setAluno(aluno);
                            System.out.println("Digite a nota do aluno "+ aluno.getNome());
                            avN.setNota(sc_int.nextDouble());
                            System.out.println("Digite a porcentagem de frequência do aluno "+ aluno.getNome());
                            avN.setFrequencia(sc_int.nextDouble());
                            turma.getDisciplina().getAvaliacoes().add(avN);                            
                        }                        
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erro ao lançar as médias finais");
            return false;
        }
        return true;
    }
}
