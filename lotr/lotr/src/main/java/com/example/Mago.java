package com.example;

import java.util.Random;

public class Mago extends Personaje {
    Random random = new Random();
    public Mago(int ataque,int defensa,int vida,String nombre){
        super(ataque,defensa,vida,nombre);

    }

    public int hechizo(){
        
        int dmg;
        dmg = random.nextInt(0,ataque+1)*crit();
        return dmg;
    }
    public int defender(){

        return defensa;
    }
    
    public int crit(){
        int alea = random.nextInt(0,101);
        if (alea < 15){
            return 2;
        }
        else 
        return 1;
    }

}
