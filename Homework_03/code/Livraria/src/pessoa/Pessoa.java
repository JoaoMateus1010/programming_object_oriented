package pessoa;

public class Pessoa {
    private String Nome;
    private int idade;
    private String CPF;
    private String Endereco;

    public Pessoa(String Nome, int idade, String CPF, String Endereco) {
        this.Nome = Nome;
        this.idade = idade;
        this.CPF = CPF;
        this.Endereco = Endereco;
    }

    public Pessoa() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "Nome=" + Nome + ", idade=" + idade + ", CPF=" + CPF + ", Endereco=" + Endereco + '}';
    }
    
    
}
