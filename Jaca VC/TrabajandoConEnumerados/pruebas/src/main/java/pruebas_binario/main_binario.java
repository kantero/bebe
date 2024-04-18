package pruebas_binario;

import java.io.FileOutputStream;
import java.io.IOException;

public class main_binario {


    public static void main(String[] args) {
        
    byte LF = 10;
    byte CR = 13;


        try {
            
    FileOutputStream fos = new FileOutputStream("C:\\Users\\Nocturno\\ficherosBinario\\PruebaDamian.bin");
            fos.write((byte)'a');
            fos.write((byte)'e');
            fos.write((byte)'i');

            fos.write(LF);
            fos.write(CR);

            
            fos.write((byte)'o');
            fos.write((byte)'u');

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

    }

}
