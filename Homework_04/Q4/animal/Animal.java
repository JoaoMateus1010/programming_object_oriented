/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author joaom
 */
public class Animal {
    private String Nome;
    private int Idade;

    public Animal(String Nome, int Idade) {
        this.Nome = Nome;
        this.Idade = Idade;
    }

    public Animal() {
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    @Override
    public String toString() {
        return "Animal{" + "Nome=" + Nome + ", Idade=" + Idade + '}';
    }
    
    public void Emitir_Som(){
        System.out.println("Emitindo som chamado pela classe Animal...");
    }
}
