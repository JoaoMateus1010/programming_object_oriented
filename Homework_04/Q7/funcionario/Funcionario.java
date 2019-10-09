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
public class Funcionario {
    private String Nome;
    private String cod_funcionario;
    private double RendaBasica;

    public Funcionario(String Nome, String cod_funcionario) {
        this.Nome = Nome;
        this.cod_funcionario = cod_funcionario; 
        this.RendaBasica = 1000.00;
    }    

    public Funcionario() {
    }

    
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCod_funcionario() {
        return cod_funcionario;
    }

    public void setCod_funcionario(String cod_funcionario) {
        this.cod_funcionario = cod_funcionario;
    }

    public double getRendaBasica() {
        return RendaBasica;
    }

    public void setRendaBasica(double RendaBasica) {
        this.RendaBasica = RendaBasica;
    }
        
}
