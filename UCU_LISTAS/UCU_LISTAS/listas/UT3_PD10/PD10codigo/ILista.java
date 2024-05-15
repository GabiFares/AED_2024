

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ernesto
 */
public interface ILista<T extends INodo>{

    /**
     * Método encargado de agregar un nodo al final de la lista.
     *
     * @param nodo - Nodo a agregar
     */
    public void insertar(T nodo);
   
    /**
     * Quita el primer elemento de la lista
     * @param unNodo el nodo que se quiere quitar de la lista
     * @return elNodo eliminado
     */
    public T quitarPrimero();
  
   
    /**
     * Método encargado de imprimir en consola las claves de los nodos
     * contenidos en la lista.
     */
    public String imprimir();
   
    /**
     * Retorna un String con las claves separadas por el separador pasado por
     * par�metro.
     *
     * @param separador Separa las claves
     * @return
     */
    public String imprimir(String separador);
   
    /**
     * Indica si la lista contiene o no elementos.
     *
     * @return Si tiene elementos o no.
     */
    public boolean esVacia();

    /**
     * Retorna el primer nodo de la lista.
     *
     * @return Primer nodo de la lista.
     */
    public T getPrimero();
   
    public T getUltimo();
}
