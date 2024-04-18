package pruebas_binario;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class printStream {

    public static void main(String[] args) {
    
    

        try {
            
    FileOutputStream fos = new FileOutputStream("C:\\Users\\Nocturno\\ficherosBinario\\PruebaDamian3.bin");
     PrintStream ps = new PrintStream(fos);

     ps.println("escribiendo en el fichero....");   
     ps.printf("escribiendo en el fichero por %dª vez", 2);
     ps.close();
     fos.close();

     //ademas tambien quiero escribir en consola
     ps = new PrintStream(System.out);
     ps.println("Escribiendo en consola...");
     ps.printf("escribiendo en consola por %dª vez", 3);
        

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }


}

}
