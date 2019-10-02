package produto.dvd;

public class DVD extends produto.Produto{
    private boolean Estado_Fisico;
    private boolean Indicacao_Idade;
    private String Genero;    

    public DVD(boolean Estado_Fisico, boolean Indicacao_Idade, String Genero, String Nome, String COD, String Marca, boolean Disponivel) {
        super(Nome, COD, Marca, Disponivel);
        this.Estado_Fisico = Estado_Fisico;
        this.Indicacao_Idade = Indicacao_Idade;
        this.Genero = Genero;
    }

    public DVD(boolean Estado_Fisico, boolean Indicacao_Idade, String Genero) {
        this.Estado_Fisico = Estado_Fisico;
        this.Indicacao_Idade = Indicacao_Idade;
        this.Genero = Genero;
    }

    public boolean isEstado_Fisico() {
        return Estado_Fisico;
    }

    public void setEstado_Fisico(boolean Estado_Fisico) {
        this.Estado_Fisico = Estado_Fisico;
    }

    public boolean isIndicacao_Idade() {
        return Indicacao_Idade;
    }

    public void setIndicacao_Idade(boolean Indicacao_Idade) {
        this.Indicacao_Idade = Indicacao_Idade;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    @Override
    public String toString() {
        return "DVD{" + "Estado_Fisico=" + Estado_Fisico + ", Indicacao_Idade=" + Indicacao_Idade + ", Genero=" + Genero + '}';
    }
    
}
