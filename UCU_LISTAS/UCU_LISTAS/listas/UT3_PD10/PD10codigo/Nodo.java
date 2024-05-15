public class Nodo implements INodo{

	private Comparable etiqueta;
	private INodo siguiente = null;
        
        
	public Nodo(Comparable clave) {
		this.etiqueta = clave;
	}

	public Comparable getEtiqueta() {
		return this.etiqueta;
	}

	public void setEtiqueta(Comparable unaClave) {
		this.etiqueta = unaClave;

	}

	public void setSiguiente(INodo nodo) {
		this.siguiente = nodo;

	}

	public INodo getSiguiente() {
		return this.siguiente;
	}
	public void imprimirEtiqueta(){
		System.out.println(etiqueta.toString());
	}
	
	public Nodo clonar(){
		return new Nodo(this.etiqueta);
	}
	

	@Override
	public boolean equals(INodo unNodo){
		return this.etiqueta.equals(unNodo.getEtiqueta());
	}
	
	@Override
	public int compareTo(INodo unNodo){
		return this.etiqueta.compareTo(unNodo.getEtiqueta());
	}

    @Override
    public String imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

