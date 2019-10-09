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
public class FuncionarioMedio extends Funcionario{
    private String nomeEscolaMedio;

    public FuncionarioMedio(String nomeEscolaMedio, String Nome, String cod_funcionario) {
        super(Nome, cod_funcionario);
        this.nomeEscolaMedio = nomeEscolaMedio;
        this.setRendaBasica(this.getRendaBasica()+(0.5*this.getRendaBasica()));
    }
    
    
}
