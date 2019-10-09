/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;

/**
 *
 * @author joaom
 */
public class FuncionarioGraduado extends Funcionario{
    public String nomeUniversidade;

    public FuncionarioGraduado(String nomeUniversidade, String Nome, String cod_funcionario) {
        super(Nome, cod_funcionario);
        this.nomeUniversidade = nomeUniversidade;
    }

    public FuncionarioGraduado(String nomeUniversidade) {
        this.nomeUniversidade = nomeUniversidade;
    }

    public String getNomeUniversidade() {
        return nomeUniversidade;
    }

    public void setNomeUniversidade(String nomeUniversidade) {
        this.nomeUniversidade = nomeUniversidade;
    }

    @Override
    public String toString() {
        return "FuncionarioGraduado{" + "nomeUniversidade=" + nomeUniversidade + '}';
    }
    
    
}
