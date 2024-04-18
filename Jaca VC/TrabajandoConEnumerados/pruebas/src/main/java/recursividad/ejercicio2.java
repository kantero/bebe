package recursividad;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Bienvenido,dime que tabla de multiplicar quieres ver");
        Scanner imput = new Scanner(System.in);
        int tabla;
        tabla = imput.nextInt();
        multiplicar(tabla, 1);
    }

    public static void multiplicar(int tabla, int multiplicador) {
        if (tabla * multiplicador < 12) {
            System.out.println(tabla + " x " + multiplicador + " = " + (tabla * multiplicador));
            multiplicar(tabla, multiplicador + 1);
        }

    }

}
