package com.example;

public class Carta {

    public enum palo {
        OROS, BASTOS, ESPADAS, COPAS
    }

    public palo carta;
    int numCarta;

    public Carta(palo _carta, int _numCarta) {
        carta = _carta;
        numCarta = _numCarta;
    }
 public palo getCarta() {
    
     return carta;
 }
}
