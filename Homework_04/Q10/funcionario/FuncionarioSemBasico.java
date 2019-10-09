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
public class FuncionarioSemBasico extends Funcionario{

    public FuncionarioSemBasico(String Nome, String cod_funcionario,int tipoFunc) {
        super(Nome, cod_funcionario,tipoFunc);
        this.addComissao();
    }
    
}
