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

Respuesta pregunta ejercicio 6: El saldo en el momento de programar el punto 6 siguiendo el orden del ejercicio solo se podra incrementar llamando a la funcion pagarIntereses en los objetos de tipo
                                CuentaJoven,en el resto no se puede modificar el saldo de la cuenta ya que no disponemos de metodos geet y set, ni ningun otro metodo especifico para ello.
                                

*/
    class CuentaJoven extends Cuenta{
        
        //se crea el constructor
    
    public CuentaJoven(int numeroCuenta,double saldo){
    
        super(numeroCuenta,saldo);
    
    }
    
    //se implementa el metodo pagarintereses para incrementar un 5% el valor del salgo de dicha cuenta
    
    public void pagarIntereses(){
    
    this.saldo = this.saldo + (this.saldo*0.05);
    }
    
}
