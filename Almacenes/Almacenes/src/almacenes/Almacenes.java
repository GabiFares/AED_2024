/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacenes;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Marcelo
 */
public class Almacenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       
        IAlmacen almacenAux=new Almacen();
       
    
        String[] archivo=ManejadorArchivosGenerico.leerArchivo("c:\\altas.txt");
        String[] archivoVentas=ManejadorArchivosGenerico.leerArchivo("c:\\ventas.txt");
       
        
        for (int i=0;i<archivo.length;i++){
            
            
            String[] parts = archivo[i].split(",");
            
            Producto productoAux=new Producto(parts[0].trim());
            productoAux.setNombre(parts[1].trim());
            productoAux.setPrecio(Integer.valueOf(parts[2].trim()));
            productoAux.setStock(Integer.valueOf(parts[3].trim()));
            
            almacenAux.insertarProducto(productoAux);
            
        }
       
        System.out.println(almacenAux.imprimirProductos());
        
        int diferencia;
        for (int i=0;i<archivoVentas.length;i++){    
            
            
            String[] partsVenta = archivoVentas[i].split(",");
            
            
            diferencia=almacenAux.restarStock(partsVenta[0].trim(), Integer.valueOf(partsVenta[1].trim()));
            System.out.println(diferencia);
        }
        
        almacenAux.listarOrdenadoPorNombre();
     //   System.out.println(almacenAux.imprimirProductos());
       
       
       
       
       
        
        
        
        
        
        
    }
    
}
