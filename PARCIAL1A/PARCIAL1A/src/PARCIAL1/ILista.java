package PARCIAL1;

public interface ILista<E> {

    /**
     * Mtodo encargado de agregar un nodo al final de la lista.
     *
     * @param nodo - Nodo a agregar
     */
    public void insertar(INodo<E> nodo);
    
    /**
     Metodo encargado de agregar un nodo en forma ordenada.
     *
     * @param nodo - Nodo a agregar
     */
    public void insertarOrdenado(INodo<E> nodo);

    /**
     * Metodo encargado de buscar un nodo cuya clave es la indicada.
     *
     * @param clave - Clave del nodo a buscar.
     * @return El nodo encontrado. En caso de no encontrarlo, retornar null.
     */
    public INodo buscar(Comparable clave);

        /**
     * Metodo encargado de imprimir en consola las claves de los nodos
     * contenidos en la lista.
     */
    public String imprimir();

    
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
    public INodo<E> getPrimero();
    
    public boolean enlazaEnEquipos(Lista<Equipo> listaEquipos);    
    

}
