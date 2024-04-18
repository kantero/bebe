package com.example;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
System.out.println("bienvenido");
        Stack<Character> pila = new Stack<Character>();
        Scanner input = new Scanner(System.in);
        System.out.println("dime la palabra a invertir");
        String palabra = input.nextLine();
        Queue <Character> cola = new LinkedList<>();
        
        System.out.println(quitarVocal(palabra,pila));
       // System.out.println(voltear1(palabra,cola));


    }
    public static String quitarVocal(String palabra,Stack<Character> pila){
        String p = "";
        
        for (int i = 0; i < palabra.length() ; i++) {
          switch(palabra.toLowerCase().charAt(i)){
            case 'a': break;
            case 'e': break;
            case 'i': break;
            case 'o': break;
            case 'u': break;
            default:pila.add(palabra.charAt(i))  ;
          }
            
        }

        while(!pila.isEmpty())
        p =  pila.pop()+p;
        return p;
    }




















    
    public static String voltear1(String palabra,Queue<Character> cola){
        String p = "";
        for (int i = 0; i < palabra.length() ; i++) {
          
            cola.add(palabra.charAt(i))  ;
        }
        while(!cola.isEmpty()){
            p = cola.poll()+p;
        }

return p;
}
}
/*
        Queue <String> cola = new LinkedList<>();
        cola.add("manzana");
        cola.add("platano");
        cola.add("tomate");

        System.out.println("cola: " + cola);
        
        String front = cola.remove();
        System.out.println(front);

        System.out.println("cola: " + cola);

        String peeked = cola.peek();
        System.out.println(peeked);

        
        String cadenaNo = "(Cadena no equilibrada de parentesis()()())))))";
        String cadenaSi = "(Cadena equilibrar con parentesis()())";
        System.out.println("verificacion equilibrado con parentesis para cadena NO");
        System.out.println(verificaParentesis(cadenaNo));

        System.out.println("verificacion equilibrado con parentesis para cadena Si");
        System.out.println(verificaParentesis(cadenaSi));

    }
 
    public static String verificaParentesis(String cadena){

       

        Stack<String> pila = new Stack<String>();
        for (int i = 0; i < cadena.length() ; i++) {

            if(cadena.charAt(i)=='('){
                pila.push("(");
            }
            else if(cadena.charAt(i)==')'){
                if (!pila.empty()) {
                    if(pila.peek() =="("){
                        pila.pop() ;
                } else {
                    pila.push(")");
                }
            }
            else{
                pila.push(")");
            }
            
        }
            
        }
        if (pila.empty()){
            return "la pila esta vacia,es decir esta equilibrado de parentesis";
        }
        else
        return "la pila no esta vacia,es decir no esta equilibrado de parentesis";
    }*/
