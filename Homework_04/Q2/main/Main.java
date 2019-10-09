/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
/**
 *
 * @author joaom
 */
import animal.*;
public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Cachorro_01", 5);        
        Animal cavalo = new Cavalo("Cavalo_01", 10);
        Animal preguica = new Preguica("Preguica_01", 3);        
        Animal animal = new Animal("Animal01", 5);
        cachorro.Emitir_Som();
        cavalo.Emitir_Som();
        preguica.Emitir_Som();
        animal.Emitir_Som();        
    }
}
