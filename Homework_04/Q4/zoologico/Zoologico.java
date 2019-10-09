/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

import animal.Animal;
import animal.Cachorro;
import animal.Cavalo;
import animal.Preguica;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaom
 */
public class Zoologico {
    public static List<Animal> jaulas = new ArrayList<Animal>();
    public static int max=10;
    public static int current=0;
    
    public static void putAnimalOnJaula(Animal animal){
        if(current<max){
            jaulas.add(animal);        
            current+=1;
        }
    }
    public static void showJaula(){        
        for(Animal an: jaulas){
            an.Emitir_Som();
            if(an.getClass().getName().equals("animal.Preguica")){
                Preguica preguica = (Preguica)an;
                preguica.subir_Arvores();
            }else if(an.getClass().getName().equals("animal.Cachorro")){
                Cachorro cachorro = (Cachorro) an;
                cachorro.correr();
            }else{
                Cavalo cavalo = (Cavalo) an;
                cavalo.correr();
            }
        }
    }
}
