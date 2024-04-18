/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partidos_de_futbol;

/**
 *
 * @author Damian Robert Francikowski
 */
public class Partido {
    
    //Atributos
    String equipoLocal,esquipoVisitante;
    double probabilidadVictoriaLocal,probabilidadVictoriaVisitante,probabilidadGolLocal,probabilidadGolVisitante;
    int golesLocal,golesVisitante;
    boolean partidoJugado;
    
    //constructores
    
    public Partido(String equipoLocal,String equipoVisitante,double probabilidadVictoriaLocal,double probabilidadVictoriaVisitante){
    
    this.equipoLocal = equipoLocal;
    this.esquipoVisitante = equipoVisitante;
    this.probabilidadVictoriaLocal = probabilidadVictoriaLocal;
    this.probabilidadVictoriaVisitante = probabilidadVictoriaVisitante;
    this.probabilidadGolLocal = 0;
    this.probabilidadGolVisitante = 0;
    this.golesLocal = 0;
    this.golesVisitante = 0;
    this.partidoJugado = false;
    }
    
    public Partido(String equipoLocal,String equipoVisitante,double probabilidadVictoriaLocal,double probabilidadVictoriaVisitante,double probabilidadGolLocal,double probabilidadGolVisitante){
    
    this.equipoLocal = equipoLocal;
    this.esquipoVisitante = equipoVisitante;
    this.probabilidadVictoriaLocal = probabilidadVictoriaLocal;
    this.probabilidadVictoriaVisitante = probabilidadVictoriaVisitante;
    this.probabilidadGolLocal = probabilidadGolLocal;
    this.probabilidadGolVisitante = probabilidadGolVisitante;
    this.golesLocal = 0;
    this.golesVisitante = 0;
    this.partidoJugado = false;
    }
    
    
    
    //implementamos los metodos getter y setter para cada uno de los atributos

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEsquipoVisitante() {
        return esquipoVisitante;
    }

    public void setEsquipoVisitante(String esquipoVisitante) {
        this.esquipoVisitante = esquipoVisitante;
    }

    public double getProbabilidadVictoriaLocal() {
        return probabilidadVictoriaLocal;
    }

    public void setProbabilidadVictoriaLocal(double probabilidadVictoriaLocal) {
        this.probabilidadVictoriaLocal = probabilidadVictoriaLocal;
    }

    public double getProbabilidadVictoriaVisitante() {
        return probabilidadVictoriaVisitante;
    }

    public void setProbabilidadVictoriaVisitante(double probabilidadVictoriaVisitante) {
        this.probabilidadVictoriaVisitante = probabilidadVictoriaVisitante;
    }

    public double getProbabilidadGolLocal() {
        return probabilidadGolLocal;
    }

    public void setProbabilidadGolLocal(double probabilidadGolLocal) {
        this.probabilidadGolLocal = probabilidadGolLocal;
    }

    public double getProbabilidadGolVisitante() {
        return probabilidadGolVisitante;
    }

    public void setProbabilidadGolVisitante(double probabilidadGolVisitante) {
        this.probabilidadGolVisitante = probabilidadGolVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public boolean isPartidoJugado() {
        return partidoJugado;
    }

    public void setPartidoJugado(boolean partidoJugado) {
        this.partidoJugado = partidoJugado;
    }

    @Override
    public String toString() {
        return "Caracteristicas del partido: " +
                "\n equipoLocal: " + equipoLocal + 
                "\n esquipoVisitante: " + esquipoVisitante + 
                "\n probabilidadVictoriaLocal: " + probabilidadVictoriaLocal + 
                "\n probabilidadVictoriaVisitante: " + probabilidadVictoriaVisitante + 
                "\n probabilidadGolLocal: " + probabilidadGolLocal + 
                "\n probabilidadGolVisitante: " + probabilidadGolVisitante + 
                "\n golesLocal: " + golesLocal + 
                "\n golesVisitante: " + golesVisitante + 
                "\n partidoJugado: " + partidoJugado;
    }
    
    
    
}
