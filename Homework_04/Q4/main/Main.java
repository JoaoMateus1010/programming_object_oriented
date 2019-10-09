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
import zoologico.Zoologico;
import animal.*;
public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Cachorro_01", 5);        
        Animal cavalo = new Cavalo("Cavalo_01", 10);
        Animal preguica = new Preguica("Preguica_01", 3);                    
        Zoologico.putAnimalOnJaula(cavalo);     
        Zoologico.putAnimalOnJaula(cachorro);     
        Zoologico.putAnimalOnJaula(preguica);     
        Zoologico.putAnimalOnJaula(preguica);     
        Zoologico.putAnimalOnJaula(cachorro);     
        Zoologico.putAnimalOnJaula(cachorro);     
        Zoologico.putAnimalOnJaula(cachorro);     
        Zoologico.putAnimalOnJaula(cavalo);     
        Zoologico.putAnimalOnJaula(cavalo);     
        Zoologico.putAnimalOnJaula(preguica);             
        Zoologico.showJaula();
    }
}
