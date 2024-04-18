/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.partidos_de_futbol;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Damian Robert Francikowski 
 */

// ArrayList<Partido>partidos = new <Partido>ArrayList(5);
public class Partidos_de_futbol {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu = 0;
        Partido listaPartidos[] = new Partido[5];
        int partidosCreados = 0;
        
        
        System.out.println("Bienvenido al programa de los futboleros!");
        
        do{
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Crear partido desde consola.");
            System.out.println("2. Mostrar lista de partidos creados.");
            System.out.println("3. simular un partido.");
            System.out.println("4. salir.");
            menu = input.nextInt();

            switch(menu){
                
                case 1: System.out.println("Ha elegido crar un partido desde consola");
                    if(partidosCreados < 5){
                        System.out.println("por favor introduzca los datos necesarios para la creacion del partido: ");
                        System.out.println("¿Quien será el equipo local? ");
                        Scanner imput = new Scanner(System.in);
                        String Local = imput.nextLine();
                        System.out.println("¿Quien será el equipo visitante? ");
                        Scanner iput = new Scanner(System.in);
                        String Visitante = iput.nextLine();
                        System.out.println("¿Que probabilidad de victoria tiene el equipo local?, por favor indicalo con un numero con hasta dos decimales");
                        Scanner teclado = new Scanner(System.in);
                        double probLocal = teclado.nextDouble();
                        System.out.println("¿que probabilidad de victoria tiene el equipo visitante?, por favor indicalo con un numero con hasta dos decimales");
                        Scanner imnput = new Scanner(System.in);
                        double probVisitante = imnput.nextDouble();
                        System.out.println("¿que probabilidad de marcar gol tiene el equipo local?, por favor indicalo con un numero con hasta dos decimales");
                        Scanner immput = new Scanner(System.in);
                        double probGolLocal =immput.nextDouble();
                        System.out.println("¿Que probabilidad de marca gol tiene el quipo visitante?, por favor indicalo con un numero con hasta dos decimales");
                        Scanner innput = new Scanner(System.in);
                        double probGolVisitante = innput.nextDouble();
                        switch(partidosCreados){
                            case 0: Partido p1 = new Partido(Local,Visitante,probLocal,probVisitante,probGolLocal,probGolVisitante);
                                    listaPartidos[partidosCreados] = p1;
                                    break;
                            case 1: Partido p2 = new Partido(Local,Visitante,probLocal,probVisitante,probGolLocal,probGolVisitante);
                                    listaPartidos[partidosCreados] = p2;
                                    break;
                            case 2: Partido p3 = new Partido(Local,Visitante,probLocal,probVisitante,probGolLocal,probGolVisitante);
                                    listaPartidos[partidosCreados] = p3;
                                    break;
                            case 3: Partido p4 = new Partido(Local,Visitante,probLocal,probVisitante,probGolLocal,probGolVisitante);
                                    listaPartidos[partidosCreados] = p4;
                                    break;
                            case 4: Partido p5 = new Partido(Local,Visitante,probLocal,probVisitante,probGolLocal,probGolVisitante);
                                    listaPartidos[partidosCreados] = p5;
                                    break;
                        }
                        
                        partidosCreados++;
                        System.out.println("Partido creado correctamente");
                        break;
                    }
                    else{
                        System.out.println("lo siento,ya has creado el maximo numero de partidos admitidos (5),para crear nuevos partidos debe reiniciar el programa.");
                        break;
                    }
                case 2:  for (int i = 0; i < listaPartidos.length; i++) {
                    if(listaPartidos[i] == null){}
                    else{
                        System.out.println(listaPartidos[i].toString());}
                        
                    }
                     break;
                case 3: System.out.println("¿Que partido desea simular?");
                        int eleccion = input.nextInt();
                        if (listaPartidos[eleccion+1].isPartidoJugado()==true)
                        {
                            System.out.println("no puede seleccionar un partido ya simulado");
                            break;
                        }
                        else if (listaPartidos[eleccion+1].getEquipoLocal() == null){
                            System.out.println("por favor selecciona un partido existente. ");
                        }
                        else{
                        simularGoles(listaPartidos[eleccion]);
                        }
                        if(listaPartidos[eleccion].getGolesLocal() > listaPartidos[eleccion].getGolesVisitante()){
                            System.out.println("Gana local");
                        }
                            else if (listaPartidos[eleccion].getGolesLocal() < listaPartidos[eleccion].getGolesVisitante()){
                                    System.out.println("Gana Visitante");
                                    }
                            else{
                                System.out.println("Empate");
                            }
                        listaPartidos[eleccion].setPartidoJugado(true);
                        break;
                case 4:
                        System.out.println("Gracias por haber usado nuestro programa.");
                        break;
            }
            
        }
        while( menu != 4);
        
        
        
        
        
    }
    
    public static void simularGoles(Partido p){
    
        int golesL = 0,golesV = 0;
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
           if((p.getProbabilidadGolLocal() + p.getProbabilidadVictoriaLocal())/100*0.8 > random.nextDouble()){
               golesL++;}
           else if((p.getProbabilidadGolVisitante() + p.getProbabilidadVictoriaVisitante())/100*0.8 > random.nextDouble()){
               golesV++;
           }           
           
            
        }
        p.setGolesLocal(golesL);
        p.setGolesVisitante(golesV);
        
    }
}
