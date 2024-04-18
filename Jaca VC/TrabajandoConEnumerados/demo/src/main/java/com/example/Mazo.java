package com.example;

import java.util.Random;

import com.example.Carta.palo;

public class Mazo   {

    static Carta c1 = new Carta(Carta.palo.COPAS, 1);
    static Carta c2 = new Carta(Carta.palo.ESPADAS, 6);
    static Carta c3 = new Carta(Carta.palo.OROS, 10);
    static Carta c4 = new Carta(Carta.palo.COPAS, 12);
    static Carta c5 = new Carta(Carta.palo.BASTOS, 3);
    static Carta c6 = new Carta(Carta.palo.ESPADAS, 4);
    static Carta c7 = new Carta(Carta.palo.BASTOS, 7);
    static Carta c8 = new Carta(Carta.palo.OROS, 2);
    
   static Carta[] array = {c1,c2,c3,c4,c5,c6,c7,c8};





    public static void Imprimir(){
    Random rnd = new Random();
    int temp = rnd.nextInt(8);
        if(array[temp].getCarta().name().equals("OROS")){
            
            System.out.println(array[temp].getCarta());
            System.out.println("!Has conseguido 4 puntos¡");
        }
        else if(array[temp].getCarta().name().equals("COPAS")){
            
            System.out.println(array[temp].getCarta());
            System.out.println("¡¡Ha conseguido 3 puntos!!");
        }
        else if(array[temp].getCarta().name().equals("ESPADAS")){
            System.out.println(array[temp].getCarta());
            System.out.println("¡Has conseguido 2 puntos!");
            
        }
        else if(array[temp].getCarta().name().equals("BASTOS")){
            System.out.println(array[temp].getCarta());
            System.out.println("¡Has conseguido 1 punto!");
            
        }
        
        
    }
}
