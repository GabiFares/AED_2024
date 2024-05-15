package PARCIAL1;

public class Nodo<T> implements INodo<T> {

    private final Comparable etiqueta;
    private T dato;
    private INodo<T> siguiente = null;

    public Nodo(T dato, Comparable etiqueta) {
        this.dato = dato;
        this.etiqueta = etiqueta;
    }

    public T getDato() {
        return this.dato;
    }

    public void setDato(T dato) {
        this.dato = dato;

    }

    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    public void setSiguiente(INodo<T> nodo) {
        this.siguiente = nodo;

    }

    public INodo<T> getSiguiente() {
        return this.siguiente;
    }

    public void imprimir() {
        System.out.println(dato.toString());
    }

//    @Override
    public void imprimirEtiqueta() {
        System.out.println(this.etiqueta);
    }

   

//    @Override
    public boolean equals(INodo<T> unNodo) {
        return this.dato.equals(unNodo.getDato());
    }

//    @Override
    public int compareTo(Comparable etiqueta) {
        return this.etiqueta.compareTo(etiqueta);
    }
}
