package produto.dvd;

public class Filme extends DVD{
    private String Ator_Principal;
    private String Produtora;

    public Filme(String Ator_Principal, String Produtora, boolean Estado_Fisico, boolean Indicacao_Idade, String Genero, String Nome, String COD, String Marca, boolean Disponivel) {
        super(Estado_Fisico, Indicacao_Idade, Genero, Nome, COD, Marca, Disponivel);
        this.Ator_Principal = Ator_Principal;
        this.Produtora = Produtora;
    }

    public Filme(String Ator_Principal, String Produtora, boolean Estado_Fisico, boolean Indicacao_Idade, String Genero) {
        super(Estado_Fisico, Indicacao_Idade, Genero);
        this.Ator_Principal = Ator_Principal;
        this.Produtora = Produtora;
    }

    public String getAtor_Principal() {
        return Ator_Principal;
    }

    public void setAtor_Principal(String Ator_Principal) {
        this.Ator_Principal = Ator_Principal;
    }

    public String getProdutora() {
        return Produtora;
    }

    public void setProdutora(String Produtora) {
        this.Produtora = Produtora;
    }

    @Override
    public String toString() {
        return "Filme{" + "Ator_Principal=" + Ator_Principal + ", Produtora=" + Produtora + '}';
    }
    
    
}
