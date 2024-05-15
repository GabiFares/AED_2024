/**
 *
 * @author ColoVannucci.F
 */
public class Nodo {
    private final Comparable etiquetaNodo;
    private Object valorNodo;//Guarda cualquier tipo de elemento
    private Nodo nodoSiguiente;//Puntero
    /**
     * Constructor de Nodo
     * @param valorDado
     * @param etiquetaDada 
     */
    public Nodo(Object valorDado, Comparable etiquetaDada){
        valorNodo = valorDado;
        etiquetaNodo = etiquetaDada;
        nodoSiguiente = null;//No hay un siguiente nodo(termina)
    }
    /**
     * Apuntamos al siguiente nodo(cambiamos el puntero)
     * @param nuevoNodo 
     */
    public void enlazarSiguiente(Nodo nuevoNodo){
        nodoSiguiente = nuevoNodo;
    }
    /**
     * Devuelve enlaze(puntero) al siguiente
     * @return 
     */
    public Nodo obtenerSiguiente(){
        return nodoSiguiente;
    }
    /**
     * Devuelve el valor del nodo actual
     * @return 
     */
    public Object obtenerValor(){
        return valorNodo;
    }
    /**
     * Modifica el Valor del Nodo
     * @param nuevoValor 
     */
    public void modificarValor(Object nuevoValor){
        valorNodo = nuevoValor;
    }
    /**
     * Devuelve la etiqueta del nodo actual
     * @return 
     */
    public Comparable obtenerEtiqueta(){
        return etiquetaNodo;
    }
}
