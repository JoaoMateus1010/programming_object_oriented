package pessoa;

public class Gerente extends Pessoa{
    private String cod_gerente;

    public Gerente(String cod_gerente, String Nome, int idade, String CPF, String Endereco) {
        super(Nome, idade, CPF, Endereco);
        this.cod_gerente = cod_gerente;
    }

    public Gerente(String cod_gerente) {
        this.cod_gerente = cod_gerente;
    }

    public String getCod_gerente() {
        return cod_gerente;
    }

    public void setCod_gerente(String cod_gerente) {
        this.cod_gerente = cod_gerente;
    }

    @Override
    public String toString() {
        return "Gerente{" + "cod_gerente=" + cod_gerente + '}';
    }
}
