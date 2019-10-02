package produto;

public class Livro extends Produto{
    private String Autor;
    private String Data_Lancamento;
    private String Editora;   

    public Livro(String Autor, String Data_Lancamento, String Editora, String Nome, String COD, String Marca, boolean Disponivel) {
        super(Nome, COD, Marca, Disponivel);
        this.Autor = Autor;
        this.Data_Lancamento = Data_Lancamento;
        this.Editora = Editora;
    }

    public Livro(String Autor, String Data_Lancamento, String Editora) {
        this.Autor = Autor;
        this.Data_Lancamento = Data_Lancamento;
        this.Editora = Editora;
    }

    

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getData_Lancamento() {
        return Data_Lancamento;
    }

    public void setData_Lancamento(String Data_Lancamento) {
        this.Data_Lancamento = Data_Lancamento;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String Editora) {
        this.Editora = Editora;
    }

    @Override
    public String toString() {
        return "Livro{" + "Autor=" + Autor + ", Data_Lancamento=" + Data_Lancamento + ", Editora=" + Editora + '}';
    }
    
    
}
