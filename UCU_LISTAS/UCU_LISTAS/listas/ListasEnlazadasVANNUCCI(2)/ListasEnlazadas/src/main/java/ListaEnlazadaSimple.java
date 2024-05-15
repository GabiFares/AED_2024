/**
 *
 * @author ColoVannucci.F
 */
public class ListaEnlazadaSimple {
    private Nodo cabeza;//Primer elemento de la Lista
    private int tamaño;
    /**
     * Constructor de la Lista Enlazada
     */
    public ListaEnlazadaSimple(){
        cabeza = null;//Sin valor(nodo)inicial
        tamaño = 0;
    }
    /**
     * Imprime todos los valores de la Lista
     */
    public void mostrarListaEnlazada(){
        if(!(estaVacia())){
            System.out.println("Valores de la Lista:");
            //Recorre e imprime todos los nodos de la lista
            for(int i = 0;i < tamaño;i++){
                System.out.println(obtenerNodo(i));
            }
        }
    }
    /**
     * Verificamos que se pueda añadir un elemento al final de la Lista
     * @param nodoDado
     * @return 
     */
    public String añadirUltimo(Nodo nodoDado){
        if(etiquetaRepetida(nodoDado.obtenerEtiqueta())){
            return "La etiqueta del nodo: \"" + nodoDado.obtenerValor() + "\", ya está dentro de la lista";
        }else{
            añadirUltimoNodo(nodoDado);
            return "Se ha añadido correctamente el nodo \"" + nodoDado.obtenerValor() + "\" a la Lista";
        }
    }
    /**
     * Añadimos un elemento al final de la Lista
     * @param nodoDado 
     */
    private void añadirUltimoNodo(Nodo nodoDado){
        if(estaVacia()){
            //Si esta vacia simplemente lo agrega como cabezal
            cabeza = nodoDado;
            tamaño++;
        }else{
            Nodo nodoTemporal = cabeza;
            while(nodoTemporal.obtenerSiguiente() != null){
                nodoTemporal = nodoTemporal.obtenerSiguiente();
            }
            //Referenciamos el Nodo de la Lista al nodo nuevo
            nodoTemporal.enlazarSiguiente(nodoDado);
            tamaño++;
        }
    }
    /**
     * Verificamos que se pueda eliminar el ultimo nodo de la Lista
     * @return 
     */
    public String eliminarUltimo(){
        if(!(estaVacia())){
            eliminarUltimoNodo();
            return "Se ha eliminado correctamente el ultimo nodo de la Lista";
        }else{
            return "La lista está vacía";
        }
    }
    /**
     * Eliminamos el ultimo nodo de la Lista
     */
    private void eliminarUltimoNodo(){
        Nodo nodoTemporal = cabeza;
        while(nodoTemporal.obtenerSiguiente() != null){
            nodoTemporal = nodoTemporal.obtenerSiguiente();
        }
        //Referenciamos el Nodo de la Lista a Ninguno(Olvidando-Perdiendo)
        nodoTemporal.enlazarSiguiente(null);
        tamaño--;
    }
    /**
     * Verificamos que podamos añadir un Nodo en cualquier posicion dentro de la lista
     * @param nodoDado
     * @param indice
     * @return 
     */
    public String añadirDentroLista(Nodo nodoDado, int indice){
        if(!(estaVacia())){
            if(estaDentroLista(indice)){
                if(etiquetaRepetida(nodoDado.obtenerEtiqueta())){
                    return "La etiqueta del nodo: \"" + nodoDado.obtenerValor() + "\", ya está dentro de la lista";
                }else{
                    String nombreNodo = obtenerValorNodo(indice).toString();
                    añadirNodoDentroLista(nodoDado, indice);
                    return "Se ha añadido correctamente el nodo " + nombreNodo; 
                }
            }else{
                return "El indice dado no está dentro de la lista";
            }
        }else{
            return "La lista está vacía";
        }
    }
    /**
     * Añadimos un Nodo en cualquier posicion dentro de la lista
     * @param nodoDado
     * @param indice 
     */
    private void añadirNodoDentroLista(Nodo nodoDado, int indice){
        int contador = 0;
        Nodo nodoAnterior = null;
        Nodo nodoTemporal = cabeza;
        while(contador < indice && nodoTemporal.obtenerSiguiente() != null){
            //Obtenemos el nodo (anterior) que apunta al lugar posicionado en el indice
            if(contador == indice - 2){
                nodoAnterior = nodoTemporal.obtenerSiguiente();
            }
            nodoTemporal = nodoTemporal.obtenerSiguiente();
            contador++;
        }
        //Enlazamos al nodo anterior el que vamos a añadir
        nodoAnterior.enlazarSiguiente(nodoDado);
        //Enlazamos el resto de la lista al nodo nuevo
        nodoDado.enlazarSiguiente(nodoTemporal);
        tamaño++;
    }
    /**
     * Verificamos que podamos eliminar los valores de la lista desde el indice dado hasta el final
     * @param indice
     * @return 
     */
    public String cortarLista(int indice){
        if(!(estaVacia())){
            if(estaDentroLista(indice)){
                cortarNodosLista(indice);
                return "Se han eliminado correctamente todos los nodos desde el lugar " + indice + " de la Lista, hasta el final";
            }else{
                return "El indice dado no está dentro de la lista";
            }
        }else{
            return "La lista está vacía";
        }
    }
    /**
     * Verificamos que podamos eliminar el nodo en cualquier posicion dentro de la lista
     * @param indice
     * @return 
     */
    public String eliminarDentroLista(int indice){
        if(!(estaVacia())){
            if(estaDentroLista(indice)){
                String nombreNodo = obtenerValorNodo(indice).toString();
                eliminarNodoDentroLista(indice);
                return "Se ha eliminado correctamente el nodo " + nombreNodo;
            }else{
                return "El indice dado no está dentro de la lista";
            }
        }else{
            return "La lista está vacía";
        }
    }
    /**
     * Eliminamos la referencia al nodo que queremos quitar de la lista, apuntandolo al siguiente del que queremos quitar
     * @param indice 
     */
    private void eliminarNodoDentroLista(int indice){
        int contador = 0;
        Nodo nodoTemporal = cabeza;
        //Busca el anterior del que queremos eliminar
        while(contador < indice - 1 && nodoTemporal.obtenerSiguiente() != null){
            nodoTemporal = nodoTemporal.obtenerSiguiente();
            contador++;
        }
        //Saltandose el que tenia seguido de él, Enlaza al siguiente del que queremos eliminar
        nodoTemporal.enlazarSiguiente(nodoTemporal.obtenerSiguiente().obtenerSiguiente());
        tamaño--;
    }
    /**
     * Elimina los valores de la lista desde el indice dado hasta el final
     * @param indice 
     */
    private void cortarNodosLista(int indice){
        int contador = 0;
        Nodo nodoTemporal = cabeza;
        //Busca el anterior del que queremos eliminar
        while(contador < indice && nodoTemporal.obtenerSiguiente() != null){
            nodoTemporal = nodoTemporal.obtenerSiguiente();
            contador++;
        }
        /*
        Luego de ese Nodo no lo enlazamos a ningun otro,
        eliminamos todos los otros Nodos que iban seguidos a ese
        */
        nodoTemporal.enlazarSiguiente(null);
        tamaño = indice;
    }
    /**
     * Verificamos que podamos obtener el Nodo en del lugar deseado
     * @param indice
     * @return 
     */
    public String obtenerNodo(int indice){
        if(!(estaVacia())){
            if(estaDentroLista(indice)){
                return obtenerValorNodo(indice).toString();
            }else{
                return "El indice dado no está dentro de la lista";
            }
        }else{
            return "La lista está vacía";
        }
    }
    /**
     * Obtener el Nodo en del lugar deseado
     * @param indice
     * @return 
     */
    private Object obtenerValorNodo(int indice){
        int contador = 0;
        Nodo nodoTemporal = cabeza;
        while(contador < indice && nodoTemporal.obtenerSiguiente() != null){
            //Cambia de un enlaze a otro
            nodoTemporal = nodoTemporal.obtenerSiguiente();
            contador++;
        }
        return nodoTemporal.obtenerValor();
    }
    /**
     * Verifica si la etiqueta está repetida dentro de la Lista
     * @param etiquetaDada
     * @return 
     */
    private boolean etiquetaRepetida(Comparable etiquetaDada){
        if(!(estaVacia())){
            Nodo nodoTemporal = cabeza;
            while(nodoTemporal != null){
                //Cuando el resultado del "CompareTo" es igual a 0 significa que SON IGUALES
                if(nodoTemporal.obtenerEtiqueta().compareTo(etiquetaDada) == 0){
                    return true;
                }
                //Cambia de un enlaze a otro
                nodoTemporal = nodoTemporal.obtenerSiguiente();
            }
        }
        return false;
    }
    /**
     * Devuelve el Tamaño de la Lista
     * @return 
     */
    public int tamañoLista(){
        return tamaño;
    }
    /**
     * Verifica si la Lista está vacia
     * @return 
     */
    public boolean estaVacia(){
        return cabeza == null;
    }
    /**
     * Verifica si el indice deseado es un valor dentro de la lista
     * @param indice
     * @return 
     */
    private boolean estaDentroLista(int indice){
        return (indice < tamaño && indice >= 0);
    }
}
