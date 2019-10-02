package pessoa;

import empresa.Filial;
import java.util.ArrayList;
import produto.Produto;

public class Funcionario_CAIXA extends Pessoa{
    private String cod_funcionario;
    private Filial filial;    

    public Funcionario_CAIXA(String cod_funcionario, Filial filial, String Nome, int idade, String CPF, String Endereco) {
        super(Nome, idade, CPF, Endereco);
        this.cod_funcionario = cod_funcionario;
        this.filial = filial;
    }

    public Funcionario_CAIXA(String cod_funcionario, Filial filial) {
        this.cod_funcionario = cod_funcionario;
        this.filial = filial;
    }

    public String getCod_funcionario() {
        return cod_funcionario;
    }

    public void setCod_funcionario(String cod_funcionario) {
        this.cod_funcionario = cod_funcionario;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }

    @Override
    public String toString() {
        return "Funcionario_CAIXA{" + "cod_funcionario=" + cod_funcionario + ", filial=" + filial + '}';
    }
    
    
    public boolean Vender_Produto(Produto produto){
        boolean ret = false;
        this.getFilial().Vende_Produto(produto);
        return  ret;
    }
    
    public ArrayList<Produto> Buscar_Produto(String buscProd){
        ArrayList<Produto> arrayList = new ArrayList<>();
        for(Produto prod: this.getFilial().getProdutosArray()){
            if(prod.getNome().equals(buscProd)){
                arrayList.add(prod);
            }
        }
        return arrayList;
    }
}
