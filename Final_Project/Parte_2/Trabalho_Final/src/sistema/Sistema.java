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
public class Sistema {
    private String nome;
    private int login;
    private int senha;
    
    private Instituicao instituicao;

    public Sistema(String nome, int login, int senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.instituicao = null;
    }

    public Sistema() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    
    public static Sistema verifica_duplicidade(ArrayList<Sistema> Arraysistemas,Sistema sistema){
        Sistema ret = null;
        try {
            for(Sistema atualSistema:Arraysistemas){
                if((atualSistema.login==sistema.login)&&(atualSistema.senha==sistema.senha)){
                    ret = atualSistema;
                }
            }
        } catch (NullPointerException ne) {
            System.out.println("Primeiro Sistema");
        }
        return ret;
    }
    
}
