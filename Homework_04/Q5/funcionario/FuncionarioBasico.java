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
public class FuncionarioBasico extends Funcionario{
    private String nomeEscolaBasica;

    public FuncionarioBasico(String nomeEscolaBasica, String Nome, String cod_funcionario) {
        super(Nome, cod_funcionario);
        this.nomeEscolaBasica = nomeEscolaBasica;
    }

    public FuncionarioBasico(String nomeEscolaBasica) {
        this.nomeEscolaBasica = nomeEscolaBasica;
    }

    public FuncionarioBasico() {
    }

    public String getNomeEscolaBasica() {
        return nomeEscolaBasica;
    }

    public void setNomeEscolaBasica(String nomeEscolaBasica) {
        this.nomeEscolaBasica = nomeEscolaBasica;
    }

    @Override
    public String toString() {
        return "FuncionarioBasico{" + "nomeEscolaBasica=" + nomeEscolaBasica + '}';
    }
    
}
