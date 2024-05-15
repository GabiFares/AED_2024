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
public class Almacen implements IAlmacen {

    
     String Direccion;

    

    String Telefono;

   

     String Nombre;

     Lista ListaProductos;
     
     
    @Override
    public String getDireccion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setDireccion(String direccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getTelefono() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setTelefono(String telefono) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Lista getListaProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public Almacen() { 
    
    ListaProductos=new Lista();}
    
    
    @Override
    public void insertarProducto(Producto unProducto) {
        INodo nodo1=new Nodo(unProducto,unProducto.getEtiqueta());
        
        ListaProductos.insertar(nodo1);
//nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(Comparable clave) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String imprimirProductos() {
       return  ListaProductos.imprimir(",");}

    @Override
    public String imprimirSeparador(String separador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean agregarStock(Comparable clave, Integer cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer restarStock(Comparable clave, Integer cantidad) {
        
        INodo n1;
        Producto p1;
        int diferencia;
            n1=ListaProductos.buscar(clave);
            p1=(Producto) n1.getDato();
            diferencia=p1.getStock()-cantidad;
            p1.setStock(diferencia);
            n1.setDato(p1);
        return(diferencia);
          
    }

    @Override
    public IProducto buscarPorCodigo(Comparable clave) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void listarOrdenadoPorNombre() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    Lista ListaAux =new Lista();
    Producto p1;
    

     if (this.ListaProductos.esVacia()) {
            System.out.println(""); 
        } else {
            INodo aux = this.ListaProductos.getPrimero();
            while (aux != null) {
                p1=(Producto) aux.getDato();
                INodo nodo1=new Nodo(p1,p1.getNombre());
                ListaAux.insertarOrdenado(nodo1);
                aux=aux.getSiguiente();
                }
          
          System.out.println(ListaAux.imprimir());
                
            }


        }
       
    
    
    
    

    @Override
    public Producto buscarPorDescripcion(String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int cantidadProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
