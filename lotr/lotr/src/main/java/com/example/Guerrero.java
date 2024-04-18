package com.example;

import java.util.Random;

public class Guerrero extends Personaje {
    Random random = new Random();
    public Guerrero(int ataque,int defensa,int vida,String nombre){

        super(ataque,defensa,vida,nombre);

    }

    public int atacar(){
        
        int dmg;       dmg = random.nextInt(0 , ataque+1)*critico();
        return dmg;
    }
    public int defender(){

        return defensa;
    }
    
    public int critico(){
        int alea = random.nextInt(0,101);
        if (alea < 15){
            return 2;
        }
        else 
        return 1;
    }

}
