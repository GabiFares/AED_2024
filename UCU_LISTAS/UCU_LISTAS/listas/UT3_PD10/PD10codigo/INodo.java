

public interface INodo {

    /**
     * Retorna la clave contenida en el nodo.
     *
     * @return Clave contenida en el nodo.
     */
    public Comparable getEtiqueta();

    /**
     * Asigna el siguiente nodo al nodo actual.
     *
     * @param nodo Nodo a asignar como siguiente.
     */
   public void setSiguiente(INodo nodo);

    /**
     * Retorna el siguiente nodo al nodo actual.
     *
     * @return Siguiente nodo del actual
     */
    public INodo getSiguiente();

    /**
     * Imprime el nodo
     *
     * @return un String con los valores del nodo
     */
    public void imprimirEtiqueta();

    /**
     *
     * @param unNodo
     * @return si son iguales, por la clave
     */
    public boolean equals(INodo unNodo);

    /**
     *
     * @param unNodo
     * @return devueve -1 si this tiene una clave menor, 0 si son iguales, 1 si
     * es mayor
     */
    public int compareTo(INodo unNodo);

    /**
     * Imprime los datos del nodo
     */
    public String imprimir();
}
