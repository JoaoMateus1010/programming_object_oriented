package empresa;

import java.util.ArrayList;

public class Livraria extends Empresa{
    private int Num_Filiais;
    private ArrayList<Filial> filialsArray;

    public Livraria(int Num_Filiais, ArrayList<Filial> filialsArray, String Nome, String CNPJ, String Endereco) {
        super(Nome, CNPJ, Endereco);
        this.Num_Filiais = Num_Filiais;
        this.filialsArray = filialsArray;
    }

    public Livraria(int Num_Filiais, ArrayList<Filial> filialsArray) {
        this.Num_Filiais = Num_Filiais;
        this.filialsArray = filialsArray;
    }

    

    public int getNum_Filiais() {
        return Num_Filiais;
    }

    public void setNum_Filiais(int Num_Filiais) {
        this.Num_Filiais = Num_Filiais;
    }

    public ArrayList<Filial> getFilialsArray() {
        return filialsArray;
    }

    public void setFilialsArray(ArrayList<Filial> filialsArray) {
        this.filialsArray = filialsArray;
    }

    @Override
    public String toString() {
        return "Livraria{" + "Num_Filiais=" + Num_Filiais + ", filialsArray=" + filialsArray + '}';
    }
    
    public boolean Adiciona_Filial(Filial filial){
        boolean ret = false;
        try {
            this.getFilialsArray().add(filial);
            ret = true;
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erro ao adicionar Filial");
        }
        return ret;
    }
    public boolean Remove_Filial(Filial filial){
        boolean ret = false;
        try {
            if(this.getFilialsArray().remove(filial)){
                ret = true;
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erro ao remover a Filial");
        }
        return ret;
    }
}
