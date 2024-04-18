package com.example;

 abstract class Personaje {
    int ataque;
    int defensa;
    int vida;
    String nombre;

    public Personaje(int ataque,int defensa,int vida,String nombre){

        this.ataque = ataque;
        this.defensa = defensa;
        this.vida = vida;
        this.nombre = nombre;

    }
    
    public abstract int defender();
public String getNombre() {
    return nombre;
}
    public String toString(){


        return (
                "Personaje: " + this.nombre + "\n"
         +      "Vida:      " + this.vida + "\n"
         +      "Defensa:   " + this.defensa + "\n"
         +      "Ataque:    " + this.ataque)
         +      "\n";
    }
    public String getBando(){

        return "b";
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
