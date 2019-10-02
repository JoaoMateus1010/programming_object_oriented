package produto;

public class Produto {
    private String Nome;
    private String COD;
    private String Marca;
    private boolean Disponivel;    

    public Produto(String Nome, String COD, String Marca, boolean Disponivel) {
        this.Nome = Nome;
        this.COD = COD;
        this.Marca = Marca;
        this.Disponivel = Disponivel;
    }

    public Produto() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCOD() {
        return COD;
    }

    public void setCOD(String COD) {
        this.COD = COD;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public boolean isDisponivel() {
        return Disponivel;
    }

    public void setDisponivel(boolean Disponivel) {
        this.Disponivel = Disponivel;
    }

    @Override
    public String toString() {
        return "Produto{" + "Nome=" + Nome + ", COD=" + COD + ", Marca=" + Marca + ", Disponivel=" + Disponivel + '}';
    }
    
    
}
