package empresa;
import java.util.ArrayList;
import pessoa.*;
import produto.*;
public class Filial extends Empresa{
    private Livraria superior;
    private Gerente gerente;    
    private ArrayList<Cliente> clientesArray;
    private ArrayList<Produto> produtosArray;

    public Filial(Livraria superior, Gerente gerente,ArrayList<Cliente> clientesArray, ArrayList<Produto> produtosArray, String Nome, String CNPJ, String Endereco) {
        super(Nome, CNPJ, Endereco);
        this.superior = superior;
        this.gerente = gerente;
        this.clientesArray = clientesArray;
        this.produtosArray = produtosArray;
    }

    public Filial(Livraria superior, Gerente gerente, ArrayList<Cliente> clientesArray, ArrayList<Produto> produtosArray) {
        this.superior = superior;
        this.gerente = gerente;
        this.clientesArray = clientesArray;
        this.produtosArray = produtosArray;
    }

    public Livraria getSuperior() {
        return superior;
    }

    public void setSuperior(Livraria superior) {
        this.superior = superior;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }  

    public ArrayList<Cliente> getClientesArray() {
        return clientesArray;
    }

    public void setClientesArray(ArrayList<Cliente> clientesArray) {
        this.clientesArray = clientesArray;
    }

    public ArrayList<Produto> getProdutosArray() {
        return produtosArray;
    }

    public void setProdutosArray(ArrayList<Produto> produtosArray) {
        this.produtosArray = produtosArray;
    }

    @Override
    public String toString() {
        return "Filial{" + "superior=" + superior + ", gerente=" + gerente + ", clientesArray=" + clientesArray + ", produtosArray=" + produtosArray + '}';
    }

    
    
    public boolean Vende_Produto(Produto produto){
        boolean ret = false;
        try {
            //Verifica se o produto está contido no estoque
        if(this.getProdutosArray().contains(produto)){
            this.getProdutosArray().remove(produto);
            ret = true;
        }else{
            System.out.println("Produto não cadastrado no estoque!");
        }
        } catch (Exception e) {
            
            System.out.println("Houve algum erro na venda!");
        }
        return ret;
    }
    
    public boolean Recebe_Produto(Produto produto){
        boolean ret = false;
        try{
            this.getProdutosArray().add(produto);
            ret = true;
        }catch(Exception e){
            System.out.println(e);
            System.out.println("Erro ao adicionar produto!");
        }
        return ret;
    }       
}
