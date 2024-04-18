package pruebas3;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int cont;
     cont = input.nextInt();
     
    System.out.println(natural1(cont));
    }
    public static int natural(int cont){
        
        int num = 0;
        if (cont != 0){
            num = cont+natural(--cont);

        }

        return num;


    }
    public static int natural1(int cont){
        int contador = cont;
        int num = 0;
        boolean flag = true;
        if(flag){contador = 0;}
        
        if (contador != (cont)){
            num = contador+natural(cont);
            
        }
        contador++;

        return num;


    }
}
