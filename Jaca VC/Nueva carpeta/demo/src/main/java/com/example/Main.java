package com.example;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    
Scanner imput = new Scanner(System.in);
    System.out.println("por favor introduce un dia de la semana");
String temp =imput.nextLine().toLowerCase();



switch (temp) {
    case "lunes": System.out.println("El  " + temp + " es el dia de la semana numero: " + diasDeLaSemana.Lunes.getNum());
        break;
        case "martes": System.out.println("El " + temp + " es el dia de la semana numero: " + diasDeLaSemana.Lunes.getNum());
        break;
        case "miercoles": System.out.println("El " + temp + " es el dia de la semana numero: " + diasDeLaSemana.Lunes.getNum());
        break;
        case "jueves": System.out.println("El " + temp + " es el dia de la semana numero: " + diasDeLaSemana.Lunes.getNum());
        break;
        case "viernes": System.out.println("El " + temp + " es el dia de la semana numero: " + diasDeLaSemana.Lunes.getNum());
        break;
        case "sabado": System.out.println("El " + temp + " es el dia de la semana numero: " + diasDeLaSemana.Lunes.getNum());
        break;
        case "domingo": System.out.println("El " + temp + " es el dia de la semana numero: " + diasDeLaSemana.Lunes.getNum());
        break;    
        default: System.out.println("hoy es viernes con V de Victoria");;
        break;
}


for(diasDeLaSemana d : diasDeLaSemana.values()){
    System.out.println(d);
}

}

}
    
    
    
    

