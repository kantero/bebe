package recursividad;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int numero,cont = 1,cont2 = 0;
        System.out.println("introduce el numero");
        numero = imput.nextInt();
        cuenta(numero,cont,cont2);
        //cuenta1(numero,cont);

    }

    public static int cuenta(int numero,int cont,int cont2){
        boolean flag = true;
        cont2 += cont;
        if(numero > cont2){
            cuenta(numero,++cont,cont2);
            flag = false;
        }
        if (flag)
        {
            System.out.println(cont);
        }
        return cont;
    }



/*public static int cuenta1(int cont,int numero){
    int resultado = 0;
    boolean flag = true;
    for(int p = 0; p <= cont; p++){
        resultado += p;
    }

if(numero > resultado){
            cuenta1(numero,++cont);
            flag = false;
        }
        if (flag)
        {
            System.out.println(cont);
        }
        return cont;
}
*/
 

}