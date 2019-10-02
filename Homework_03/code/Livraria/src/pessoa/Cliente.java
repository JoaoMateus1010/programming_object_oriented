package pessoa;

import java.util.ArrayList;
import produto.Produto;
public class Cliente extends Pessoa{
    private int cod_cliente;

    public Cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public Cliente() {
    }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cod_cliente=" + cod_cliente + '}';
    }
    
    public boolean Realizar_Compra(Produto produto,Funcionario_CAIXA funcionario_CAIXA){
        boolean ret = false;
        try {
            funcionario_CAIXA.Vender_Produto(produto);
            ret= true;
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erro ao realizar compra!");
        }
        return ret;
    }
    
    public ArrayList<Produto> Buscar_Produto(String buscProd,Funcionario_CAIXA funcionario_CAIXA){
        return funcionario_CAIXA.Buscar_Produto(buscProd);
    }
}
