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
public class Turma {
    private int ID;
    private static int Referencia = 0;
    private Disciplina disciplina;

    public Turma(Disciplina disciplina) {
        this.disciplina = disciplina;
        Referencia +=1;
        this.ID = Referencia;
    }

    public Turma() {
        Referencia +=1;
        this.ID = Referencia;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public int getID() {
        return ID;
    }

    public static int getReferencia() {
        return Referencia;
    }
    
}
