package pruebas_binario;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class pruebasinput {

    public static void main(String[] args) {
        try{
        FileWriter fw = new FileWriter("C:\\Users\\Nocturno\\ficherosBinario\\PruebasDamianEjercicio.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            FileReader fr = new FileReader("C:\\Users\\Nocturno\\ficherosBinario\\PruebasDamianEjercicio.txt");
            PrintWriter pw = new PrintWriter("C:\\Users\\Nocturno\\ficherosBinario\\PruebasDamianEjercicio.txt");

            fw.write("En un lugar de la mancha de cuyo nombre no me quiero acordar,viviar el Georgi alla por cantalejo");
            
            int i;
            while((i = fr.read())!= -1){
                if ((char)i == ' '){

                }
                else
                
                System.out.print((char)i);
                pw.println((char)i);
            }

            
        
            bw.close();
            fw.close();
            pw.close();
            fr.close();
    }catch(IOException ioe) {
        System.out.println(ioe.getMessage());
    }

    

}

}
