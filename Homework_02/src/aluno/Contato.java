package aluno;

public class Contato {
	// Declare as variaveis da Classe;
	private String nome;
        private String telefone;
	
	//Criar Metodo Construtor //TODO
	public Contato(String telefone, String nome){
            this.nome = nome;
            this.telefone = telefone;
	}
	
	// Metodo para retornar Nome do Contato;
	public String getNome() {
            return nome;
	}

	// Metodo para Escevrer nome no contato
	public void setNome(String nome) {
            this.nome = nome;
	}

	// Metodo para retornar telefone do Contato;
	public String getTelefone() {
            return telefone;
	}

	// Metodo para escrever telefone do Contato 
	public void setTelefone(String telefone) {
            this.telefone = telefone;
	}

	// Criar metodo para concatenar Nome e telefones
	// Ex.:  Fulano - 32232323  

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", telefone=" + telefone + '}';
    }	
	
}
