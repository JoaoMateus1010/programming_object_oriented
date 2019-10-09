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
        this.setRendaBasica(this.getRendaBasica()+(0.1*this.getRendaBasica()));
    }
    
    
}
