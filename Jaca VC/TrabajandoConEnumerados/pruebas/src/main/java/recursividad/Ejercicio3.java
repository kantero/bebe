package recursividad;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        captura(numeros);

    }

    public static void captura(ArrayList<Integer> numeros){
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("introduce un numero para el array");
        numero = input.nextInt();
        if(numero != -1){
        numeros.add(numero);
            captura(numeros);
        }
        else{
            System.out.println(numeros);
        }
    }

}
