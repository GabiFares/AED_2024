/**
 *
 * @author ColoVannucci.F
 */
public class MainListasEnlazadas {
    public static void main(String[] args) {
        
        Nodo primero = new Nodo("hola", 1);
        Nodo segundo = new Nodo("como", 2);
        Nodo tercero = new Nodo("estas", 3);
        Nodo cuarto = new Nodo("007", 4);
        Nodo quinto = new Nodo("que", 5);
        Nodo sexto = new Nodo("hiciste", 6);
        
        //primero.enlazarSiguiente(segundo);
        
        //primero.obtenerSiguiente().enlazarSiguiente(tercero);
        
        //System.out.println(primero.obtenerSiguiente().obtenerValor().toString());
        
        ListaEnlazadaSimple listaNodos = new ListaEnlazadaSimple();
        
        System.out.println("Esta vacia?: "+ listaNodos.estaVacia());
        
        System.out.println(listaNodos.añadirUltimo(primero));
        System.out.println(listaNodos.añadirUltimo(segundo));
        System.out.println(listaNodos.añadirUltimo(tercero));
        System.out.println(listaNodos.añadirUltimo(cuarto));
        System.out.println(listaNodos.añadirUltimo(quinto));
        System.out.println(listaNodos.añadirUltimo(sexto));
        
        System.out.println("Tamaño: "+ listaNodos.tamañoLista());
        listaNodos.mostrarListaEnlazada();
        
        System.out.println("Primer Elemento: "+ listaNodos.obtenerNodo(0));
        System.out.println("Ultimo: "+ listaNodos.obtenerNodo(listaNodos.tamañoLista() - 1));
        System.out.println("Nodo Indice 2: "+ listaNodos.obtenerNodo(2));
        
        System.out.println("Esta vacia?: "+ listaNodos.estaVacia());
        System.out.println("Ultimo: "+ listaNodos.obtenerNodo(listaNodos.tamañoLista() - 1));
        System.out.println("Tamaño: "+ listaNodos.tamañoLista());
        
        Nodo septimo = new Nodo("añadido", 5);
        System.out.println(listaNodos.añadirDentroLista(septimo, 2));
        Nodo octavo = new Nodo("octavo", 6);
        System.out.println(listaNodos.añadirUltimo(octavo));
        Nodo noveno = new Nodo("noveno", 4);
        System.out.println(listaNodos.añadirUltimo(noveno));
        Nodo decimo = new Nodo("decimo", 3);
        System.out.println(listaNodos.añadirUltimo(decimo));
        Nodo decimoprimero = new Nodo("decimoprimero", 2);
        System.out.println(listaNodos.añadirUltimo(decimoprimero));
        Nodo decimosegundo = new Nodo("decimosegundo", 1);
        System.out.println(listaNodos.añadirUltimo(decimosegundo));
        
        listaNodos.mostrarListaEnlazada();
        
        //System.out.println(listaNodos.eliminarDentroLista(3));listaNodos.mostrarListaEnlazada();
        //System.out.println(listaNodos.cortarLista(4));listaNodos.mostrarListaEnlazada();
        System.out.println(listaNodos.eliminarUltimo());listaNodos.mostrarListaEnlazada();
        System.out.println("Tamaño: "+ listaNodos.tamañoLista());
    }
    
}
