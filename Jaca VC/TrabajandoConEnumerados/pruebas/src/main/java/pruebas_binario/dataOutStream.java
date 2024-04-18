package pruebas_binario;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class dataOutStream {

    public static void main(String[] args) {
        
        byte LF = 10;
        byte CR = 13;

        try {
            
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Nocturno\\ficherosBinario\\PruebaDamian2.bin");
             DataOutputStream dos = new DataOutputStream(fos);
            
                String texto = "Sois los cracks del María MOliner";
                dos.writeUTF(texto);
                int numero = 7;
                dos.writeInt(numero);
        
                } catch (IOException ioe) {
                    System.out.println(ioe.getMessage());
                }


    }

}
