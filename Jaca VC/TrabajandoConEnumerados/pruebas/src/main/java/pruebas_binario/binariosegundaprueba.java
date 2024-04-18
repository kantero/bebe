package pruebas_binario;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class binariosegundaprueba {

    public static void main(String[] args) {
        
    
    
    byte LF = 10;
    byte CR = 13;

        try {
            
    FileOutputStream fos = new FileOutputStream("C:\\Users\\Nocturno\\ficherosBinario\\PruebaDamian2.bin");
     BufferedOutputStream bos = new BufferedOutputStream(fos)  ;
    
        bos.write((byte)'a');
            bos.write((byte)'e');
            bos.write((byte)'i');

            bos.write(LF);
            bos.write(CR);

            
            bos.write((byte)'o');
            bos.write((byte)'u');

            bos.close();
            fos.close();

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

    
}

}