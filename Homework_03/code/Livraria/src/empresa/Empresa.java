package empresa;

public class Empresa {
    private String Nome;
    private String CNPJ;
    private String Endereco;   

    public Empresa(String Nome, String CNPJ, String Endereco) {
        this.Nome = Nome;
        this.CNPJ = CNPJ;
        this.Endereco = Endereco;
    }

    public Empresa() {
    }

    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    @Override
    public String toString() {
        return "Empresa{" + "Nome=" + Nome + ", CNPJ=" + CNPJ + ", Endereco=" + Endereco + '}';
    }
    
    
}
