package com.example.PIEDRAS;

public class Piedras {

    public enum Piedras {
        CALIZA(1200), MARMOL(1423.55f), PIZARRA(1325), CUARZITA(1466.22f);
        private final float pesoPiedra;
        Piedras(float pesoPiedra) {
        this.pesoPiedra = pesoPiedra;
        }
        public double getPesoPiedra() {
        return pesoPiedra;
        }
        }

}
