package UT03.TA2;

public class Nodo implements INodo {

    private final Comparable etiqueta;
    private Object dato;
    private INodo siguiente = null;

    public Nodo(Object dato, Comparable etiqueta) {
        this.dato = dato;
        this.etiqueta = etiqueta;
    }

    public Object getDato() {
        return this.dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;

    }

    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    public void setSiguiente(INodo nodo) {
        this.siguiente = nodo;

    }

    public INodo getSiguiente() {
        return this.siguiente;
    }

    public void imprimir() {
        System.out.println(dato.toString());
    }

//    @Override
    public void imprimirEtiqueta() {
        System.out.println(this.etiqueta);
    }

    public INodo clonar() {
        return new Nodo(this.dato, this.etiqueta);
    }

//    @Override
    public boolean equals(INodo unNodo) {
        return this.dato.equals(unNodo.getDato());
    }

//    @Override
    public int compareTo(Comparable etiqueta) {
        return this.etiqueta.compareTo(etiqueta);
    }
}
