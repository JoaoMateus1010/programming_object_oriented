package produto.dvd;

public class Jogo extends DVD{
    private String Plataforma;

    public Jogo(String Plataforma, boolean Estado_Fisico, boolean Indicacao_Idade, String Genero, String Nome, String COD, String Marca, boolean Disponivel) {
        super(Estado_Fisico, Indicacao_Idade, Genero, Nome, COD, Marca, Disponivel);
        this.Plataforma = Plataforma;
    }

    public Jogo(String Plataforma, boolean Estado_Fisico, boolean Indicacao_Idade, String Genero) {
        super(Estado_Fisico, Indicacao_Idade, Genero);
        this.Plataforma = Plataforma;
    }

    public String getPlataforma() {
        return Plataforma;
    }

    public void setPlataforma(String Plataforma) {
        this.Plataforma = Plataforma;
    }

    @Override
    public String toString() {
        return "Jogo{" + "Plataforma=" + Plataforma + '}';
    }
    
}
