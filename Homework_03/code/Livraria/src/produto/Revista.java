package produto;

public class Revista extends Produto{
    private String Jornal;
    private String Data_Lançamento;
    private String Redator;    

    public Revista(String Jornal, String Data_Lançamento, String Redator, String Nome, String COD, String Marca, boolean Disponivel) {
        super(Nome, COD, Marca, Disponivel);
        this.Jornal = Jornal;
        this.Data_Lançamento = Data_Lançamento;
        this.Redator = Redator;
    }

    public Revista(String Jornal, String Data_Lançamento, String Redator) {
        this.Jornal = Jornal;
        this.Data_Lançamento = Data_Lançamento;
        this.Redator = Redator;
    }

    

    public String getJornal() {
        return Jornal;
    }

    public void setJornal(String Jornal) {
        this.Jornal = Jornal;
    }

    public String getData_Lançamento() {
        return Data_Lançamento;
    }

    public void setData_Lançamento(String Data_Lançamento) {
        this.Data_Lançamento = Data_Lançamento;
    }

    public String getRedator() {
        return Redator;
    }

    public void setRedator(String Redator) {
        this.Redator = Redator;
    }

    @Override
    public String toString() {
        return "Revista{" + "Jornal=" + Jornal + ", Data_Lan\u00e7amento=" + Data_Lançamento + ", Redator=" + Redator + '}';
    }
    
    
}