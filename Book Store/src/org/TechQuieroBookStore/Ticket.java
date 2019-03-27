package org.TechQuieroBookStore;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ticket extends Carrito{

	public static void main(String ars[]){
        try {
            String ruta = "C:\\Users\\HP\\Desktop\\TechQuiero\\Book Store\\.txt";
            String contenido = total;
            File file = new File(ruta);
            
            
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
