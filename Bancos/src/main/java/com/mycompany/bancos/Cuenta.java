/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancos;

/**
 *
 * @author Damian Robert Francikowski
 */

/*
Respuesta ejercicio 2: Los metodos get y set no son estrictamente necesarios,ya que aportan una funcionalidad al sistema la cual es opcional.
Cambios para ejercicio 10: Al ser una clase abstracta no es posible instanciar un objeto de esta clase por lo cual no se podria realizar el ejercicio 10, para poder realizarlo se
                           cambia la clase para que no sea abstracta y asi poder instanciar el objeto de esta.
                           Tambien añadimos el metodo toString para poder imprimir por pantalla los detalles de las cuentas en el ejercicio 10.
    

*/
public class Cuenta {
    //Atributos
    int numeroCuenta;
    double saldo;
    
    //constructores,en los cuales creamos uno vacio y otro al cual le pasamos dos variables por parametros
    
    public Cuenta(){}
    
    public Cuenta(int numeroCuenta,double saldo){
    
    this.numeroCuenta = numeroCuenta;
    this.saldo = saldo;
    
    }
    
    //creamos el metodo pagar intereses segun el enunciado del ejercicio.
    public void pagarIntereses(){};

    @Override
    public String toString() {
        return "La Cuenta con numero: " + numeroCuenta + "\n tiene un saldo de: " + saldo;
    }
    
    
}
