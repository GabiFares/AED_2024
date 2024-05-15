/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importardatos;

import java.util.*;
import java.io.*;

/**
 *
 * @author Marcelo
 */
public class ImportarDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String claveKey;
        String claveKeyAnterior="";
        String claveDato;
        String[] archivo=ManejadorArchivosGenerico.leerArchivo("c:\\archivosclaves.txt");
        Map<String, Dato> mapH = new HashMap<String, Dato>();
        
        for (int i=0;i<archivo.length;i++){
            
            String[] parts = archivo[i].split(",");
            claveKey = parts[0].trim(); // 123
            claveDato = parts[1].trim(); // 654321
            claveKeyAnterior=claveKey;
          if   (claveKey !="") {
            Dato d1=new Dato();
            d1.Clave=claveKey;
            d1.Terminos=new ArrayList<String>();
            d1.Terminos.add(claveDato);
            
            if (i<archivo.length-1) {
                
               
                
                parts = archivo[i+1].split(",");
                claveKey = parts[0].trim(); // 123
                claveDato = parts[1].trim(); // 654321
                
                }
            
            while ((i<archivo.length-1) && (claveKey.equals(claveKeyAnterior))) {
            
                d1.Terminos.add(claveDato);
                i=i+1;
                parts = archivo[i+1].split(",");
                claveKey = parts[0]; // 123
                claveDato = parts[1]; // 654321
            
            
            
            }
            
            
            mapH.put(claveKeyAnterior, d1);
            }
        }
       System.out.println("Dato: " + mapH.get("HTA").Terminos.get(0) );
        System.out.println("Dato: " + mapH.get("HTA").Terminos.get(1) );
        System.out.println("Dato: " + mapH.get("HTA").Terminos.get(2) );
        System.out.println("Dato: "  );
    }
    
     
    
}
