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
public class Cavalo extends Animal{

    public Cavalo(String Nome, int Idade) {
        super(Nome, Idade);
    }

    public Cavalo() {
    }
    
    public void correr(){
        System.out.println("Correndo Classe Cavalo...");
    }
    @Override
    public void Emitir_Som(){
        System.out.println("Emitindo som pela classe cavalo...");
    }
}
