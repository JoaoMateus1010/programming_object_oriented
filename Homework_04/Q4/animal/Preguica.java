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
public class Preguica extends Animal{

    public Preguica(String Nome, int Idade) {
        super(Nome, Idade);
    }

    public Preguica() {
    }
    
    public void subir_Arvores(){
        System.out.println("Subindo em arvores classe preguica...");
    }
    @Override
    public void Emitir_Som(){
        System.out.println("Emitindo som pela classe preguica...");
    }
}
