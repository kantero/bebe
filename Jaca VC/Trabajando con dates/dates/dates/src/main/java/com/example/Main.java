package com.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
    
        Stack<Integer> pila = new Stack<Integer>();
        pila.push(3);
        pila.push(6);
        pila.push(9);
        pila.push(12);
       
        System.out.println(pila.peek());
        System.out.println(pila.pop());
        System.out.println(pila.peek());
    }
}