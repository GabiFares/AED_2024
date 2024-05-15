/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacenes;

/**
 *
 * @author Marcelo
 */
public class Producto implements IProducto{
 
    private int Stock;
    private String Nombre;
    private Comparable Etiqueta;
    private int Precio;
    
    //    @Override
    
    public Producto (Comparable Etiqueta1){
        Etiqueta=Etiqueta1;
        
    }
          
 
    
    public void setNombre(String nombre){
        
        Nombre=nombre;
    }
     //    @Override
    public Integer getStock(){
        
        return Stock;
    }
    
    //    @Override
    public void setStock(Integer stock){
        Stock=stock;
        
    }
    /**
     * Retorna la descripcion/nombre del Producto.
     *
     * @return descripci�n del Producto.
     */
     //    @Override
    public String getNombre(){
        return Nombre;
        
    }
    
    public Comparable getEtiqueta()
            {
        return Etiqueta;
        
    }

    /**
     * Retorna el precio unitario del Producto.
     *
     * @return precio del Producto.
     */
    public Integer getPrecio(){
        return Precio;
        
    }

    public void setPrecio(Integer precio)
            {
        Precio=precio;
        
    }
}
