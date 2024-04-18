/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancos;
import java.lang.Exception;
/**
 *
 * @author Damian Robert Francikowski
 */


/*
Respuesta pregunta ejercicio 5: Al derivar de una clase con un metodo abstracto,si no implementamos dicho metodo y lo sobreescribimos en las clases hijas
                                El programa nos dara error y no nos dejara compilar el programa ya que es necesario sobreescribir todos los metodos abstractos.


*/
public class CuentaCorriente extends Cuenta {
    
    //Constructor: se crea un constructor al cual hemos de pasarle como minimo los parametros del constructor de la clase padre.
    
    public CuentaCorriente(int numeroCuenta,double saldo){
        
        super(numeroCuenta,saldo);
        
    }
    
    // Se implementa el siguiente metodo para poder evitar que el programa no de error de compilacion y poder realizar el ultimo ejercicio propuesto(ejercicio 10)
      
    public void pagarIntereses(){}
    

    
    
    
    
    
    
    
}
