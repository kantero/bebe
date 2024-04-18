package com.example;
public enum piedras {CALIZA(1200), MARMOL(1423.55f), PIZARRA(1325), CUARZITA(1466.22f);
   int num;
    piedras (int num){

    this.num = num;
   }
    private final float pesoPiedra;
    Piedras(float pesoPiedra) {
    this.pesoPiedra = pesoPiedra;
    }
    public double getPesoPiedra() {
    return pesoPiedra;
    }
    }
