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
    private int tipoFunc; // 0- Gerente,1-Supervidor,2-Vendedor
    
    public Funcionario(String Nome, String cod_funcionario,int TipoFunc) {
        this.Nome = Nome;
        this.cod_funcionario = cod_funcionario; 
        this.RendaBasica = 1000.00;        
        this.tipoFunc = TipoFunc;        
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

    public int getTipoFunc() {
        return tipoFunc;
    }

    public void setTipoFunc(int tipoFunc) {
        this.tipoFunc = tipoFunc;
    }
    
    
    protected void addComissao(){
        switch (this.getTipoFunc()) {
            case 0:
                this.setRendaBasica(this.getRendaBasica()+1500);
                break;
            case 1:
                this.setRendaBasica(this.getRendaBasica()+600);
                break;
            default:
                this.setRendaBasica(this.getRendaBasica()+200);
                break;
        }
    }
}
