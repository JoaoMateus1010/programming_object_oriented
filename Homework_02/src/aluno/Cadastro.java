package aluno;

import java.util.ArrayList;
import java.util.Iterator;
public class Cadastro {
    //Definir Variaveis da Classe;

    private ArrayList<Contato> dados;
    private int currentContatos;
    private int maxContatos;

    public Cadastro(int maxContatos) {
        this.dados = new ArrayList<Contato>();
        this.currentContatos = 0;
        this.maxContatos = maxContatos;
    }

    //Metodo para Resetar a Agenda
    public boolean resetAgenda(int maxContatos) {
        this.dados = new ArrayList<Contato>();
        this.currentContatos = 0;
        this.maxContatos = maxContatos;        
        return true;
    }

    public boolean adicionarContato(String telefone, String nome) {
        if(this.currentContatos < this.maxContatos){
            Contato ct = new Contato(telefone, nome);
            this.dados.add(ct);
            this.currentContatos = this.currentContatos+1;            
            return true;
        }else{
            return false;
        }     
    }

    //Pegar Contato pelo Telefone
    public Contato getContatoByTel(String telefone) {
        Contato ct = null ;
        for(Contato ctB: this.dados){
            if(ctB.getTelefone().equals(telefone)){
                ct = ctB;
                break;
            }
        }
        
        return ct;
    }

    //Dado um telefone, atualizar o nome do contato que possui esse telefone
    public boolean atualizarContato(String telefone, String nome) {
        Contato ctNew = this.getContatoByTel(telefone);
        if(ctNew != null){
            ctNew.setNome(nome);
            return true;
        }else{
            return false;
        }
    }

    public boolean removerContato(String telefone) {
        Contato ctNew = this.getContatoByTel(telefone);
        if(ctNew != null){
            this.dados.remove(ctNew);
            return true;
        }else{
            return false;
        }    
    }

    public ArrayList<Contato> getContatos() {
        return this.dados;
    }

    public ArrayList<String> getTelefones(String nome_contato) {
        ArrayList<String> st_ret = new ArrayList<>();
        for(Contato ctB: this.dados){
            if(ctB.getNome().equals(nome_contato)){
                st_ret.add(ctB.getTelefone());
            }
        }
        return st_ret;
    }

    @Override
    public String toString() {
        return "Cadastro{" + "dados=" + dados + ", currentContatos=" + currentContatos + ", maxContatos=" + maxContatos + '}';
    }

}
