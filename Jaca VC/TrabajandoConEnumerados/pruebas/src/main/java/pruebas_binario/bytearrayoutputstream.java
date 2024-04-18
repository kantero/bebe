package pruebas_binario;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bytearrayoutputstream {

public static void main(String[] args) {
    
    

        try {
            
    FileOutputStream fos = new FileOutputStream("C:\\Users\\Nocturno\\ficherosBinario\\PruebaDamian3.bin");
     ByteArrayOutputStream baos = new ByteArrayOutputStream();

     baos.write(74);
     baos.write((byte)'A');
     baos.write(86);
     baos.write(65);
     baos.writeTo(fos);
     baos.flush();

     baos.close();
     
        

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }


}

}
