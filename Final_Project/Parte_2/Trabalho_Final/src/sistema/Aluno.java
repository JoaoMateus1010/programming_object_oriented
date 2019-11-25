/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

/**
 *
 * @author joaom
 */
public class Aluno extends Pessoa{
    private Curso curso;
    private boolean status;

    public Aluno( String nome, String email, int senha) {
        super(nome, email, senha);
        this.curso = null;
        this.status = false;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void Emitir_Historico_de_Medias(Sistema atual){
        for(Curso curso:atual.getInstituicao().getList_cursos()){            
            for(Turma turma:curso.getTurmas()){
                Disciplina disciplina = turma.getDisciplina();
                for(Avaliacao avaliacao:disciplina.getAvaliacoes()){
                    if((avaliacao.getAluno().getEmail().equals(this.getEmail()))&&(avaliacao.getAluno().getSenha()==this.getSenha())){
                        System.out.println("Curso : "+curso.getNome());
                        System.out.println("Turma : "+turma.getID());
                        System.out.println("Disciplina : "+disciplina.getNome());
                        System.out.println("Nota final: "+avaliacao.getNota());
                    }
                }
            }
        }
    }
    
    public void Emitir_Frequencia(Sistema atual){
                for(Curso curso:atual.getInstituicao().getList_cursos()){            
            for(Turma turma:curso.getTurmas()){
                Disciplina disciplina = turma.getDisciplina();
                for(Avaliacao avaliacao:disciplina.getAvaliacoes()){
                    if((avaliacao.getAluno().getEmail().equals(this.getEmail()))&&(avaliacao.getAluno().getSenha()==this.getSenha())){
                        System.out.println("Curso : "+curso.getNome());
                        System.out.println("Turma : "+turma.getID());
                        System.out.println("Disciplina : "+disciplina.getNome());
                        System.out.println("Frequência final: "+avaliacao.getFrequencia());
                    }
                }
            }
        }
    }
}
