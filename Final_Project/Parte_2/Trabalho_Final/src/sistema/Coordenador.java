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
public class Coordenador extends Professor{
    private int senha_especial_coordenador;

    public Coordenador(int senha_especial_coordenador, int total_creditos, String nome, String email, int senha) {
        super(total_creditos, nome, email, senha);
        this.senha_especial_coordenador = senha_especial_coordenador;
    }

    public Coordenador(int senha_especial_coordenador, int total_creditos) {
        super(total_creditos);
        this.senha_especial_coordenador = senha_especial_coordenador;
    }

    public int getSenha_especial_coordenador() {
        return senha_especial_coordenador;
    }

    public void setSenha_especial_coordenador(int senha_especial_coordenador) {
        this.senha_especial_coordenador = senha_especial_coordenador;
    }
    
    public void Adicionar_Disciplina(Disciplina disciplina){
        
    }
}
