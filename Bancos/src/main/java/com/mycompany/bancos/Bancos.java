/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bancos;

/**
 *
 * @author Damian Robert Francikowski 
 */
class Bancos {

    public static void main(String[] args) {
        System.out.println("Bienvenido a su banco de confianza.");
        
        Cuenta cuenta = new Cuenta(123456,1500);
        CuentaCorriente cuentacorriente = new CuentaCorriente(654321,958);
        CuentaSuperCorriente csp = new CuentaSuperCorriente(1234,666);
        CuentaJoven cuentajoven = new CuentaJoven(4321,5433.20);
        CuentaSuperJoven csj = new CuentaSuperJoven(33341,1000);
        Cuenta lista[] = {cuenta,cuentacorriente,csp,cuentajoven,csj};
        
        for (int i = 0; i < lista.length; i++) {
            mostrarCuentasConSaldo(lista[i]);
            
        }
        
        
        
    }
    
    public static void mostrarCuentasConSaldo(Cuenta c){
    
    if(c.saldo > 1000)
            System.out.println(c.toString());
    
    
    }
    
}
