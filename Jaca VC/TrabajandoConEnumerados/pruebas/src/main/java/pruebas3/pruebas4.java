package pruebas3;

import java.util.Scanner;

public class pruebas4 {
    public static void binario(int num){
        if(num>=2)
        {binario(num/2);
            System.out.print(num%2);
            }
        else{
            System.out.print(num);
        }
        
    }
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num;
    int cont = 0;int cont1 = 1;
    String resultado = "0,1";
    int caracteres = 2;
    boolean flag = true;
    System.out.println("dime el numero");
    num = input.nextInt();
    binario(num);
}


}






    //fibonacci(num,cont,cont1,resultado,caracteres,flag);

/*for (int i =valor.length() ; i > 0  ; i--) {  
    invertida += invertir(valor,i);      
}

System.out.println(invertida);

}
public static char invertir(String valor,int i){    
    return valor.charAt(i-1);
}
 
public static void contador(int num){
    int cont = 0;
    while(num > 0)
    {   
        cont++;
        num = num/10;
    }


    System.out.println(cont);
}
public static int contador1(int num){
if(num <= 0)
 return 0;


    return (1 + contador1(num/10)) ;
}

public static void fibonacci(int num,int cont,int cont1,String resultado,int caracteres,boolean flag){
    
 if(num == 0){
    resultado = "no se devuleve ningun valor";
    System.out.println(cont);
 }
else if (num == 1){
    resultado = "0";
    System.out.println(resultado);
}
else if (num == 2){
    resultado = "0,1";
    System.out.println(resultado);
}
else {
    while(num > caracteres){
    caracteres++;
    cont1 = cont1+cont;
    cont = cont1-cont;
    resultado+=(","+cont1);
    fibonacci(num,cont,cont1,resultado,caracteres,flag);
    flag = false;}
}
if(num <= caracteres && flag){
    
   System.out.println(resultado);}

}

public static*/
