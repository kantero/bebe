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

Respuesta ejercicio 9: Al haber creado un tipo privado en CuentaJoven no podemos crear la clase CuentaSuperJoven ya que al crear la clase con su constructor nos da error al ser de tipo privado 
                       y el programa no poder acceder a ello.
                       Se soluciona el error poniendolo en publico para poder realizar el ejercicio 10.

*/
 class CuentaSuperJoven extends CuentaJoven {
     
     //se crea el constructor con los atributos de la clase padre.
    
    public CuentaSuperJoven(int numeroCuenta,double saldo){
    
    super(numeroCuenta,saldo);
    }
    
}
