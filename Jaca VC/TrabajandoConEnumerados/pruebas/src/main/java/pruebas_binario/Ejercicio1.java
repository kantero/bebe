package pruebas_binario;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    System.out.println("por favor,introduce el nombre del fichero que deseas crear");
    String nombre = imput.nextLine();
    String consola = "";
    ArrayList<String> libros = new <String>ArrayList(); 
    ArrayList<String> autor = new <String>ArrayList();
    ArrayList<String> año = new <String>ArrayList();
    

    

        try {
            
    FileOutputStream fos = new FileOutputStream("C:\\Users\\Nocturno\\ficherosBinario\\"+ nombre +".bin");
     PrintStream ps = new PrintStream(fos);
     captura(libros,autor,año);
     
     ps.println("<Libros>");
            for (int i = 0; i < libros.size(); i++) {
                ps.println("<libro>"+ libros.get(i) +"</libro>");
                ps.println("       <autor>"+ autor.get(i) +"</autor>");
                ps.println("               <año>"+ año.get(i) +"</año>");
            }
        
     ps.printf("</Libros>");
     ps.close();
     fos.close();

     //ademas tambien quiero escribir en consola
     ps = new PrintStream(System.out);

     
     ps.println(consola);
     
        

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }


}
public static void captura(ArrayList<String> libros,ArrayList<String> autor,ArrayList<String> año){
    Scanner iput = new Scanner(System.in);
    String palabra;
    System.out.println("introduce  el titulo de un libro,si no quieres introducir mas introduce un salir");
    palabra = iput.nextLine();
    if(!palabra.equalsIgnoreCase("salir")){
    libros.add(palabra);
    Scanner input = new Scanner(System.in);
    System.out.println("introduce  el autor");
    palabra = input.nextLine();
    autor.add(palabra);
    Scanner imput = new Scanner(System.in);
    System.out.println("introduce  el año");
    palabra = imput.nextLine();
    año.add(palabra);
    captura(libros,autor,año);}

}
}