
import java.util.LinkedList;

public class TNodoTrie implements INodoTrie {

    private static final int CANT_CHR_ABECEDARIO = 26;
    private TNodoTrie[] hijos;
    private boolean esPalabra;

    public TNodoTrie() {
        hijos = new TNodoTrie[CANT_CHR_ABECEDARIO];
        esPalabra = false;
    }

    @Override
    public void insertar(String unaPalabra) {
        TNodoTrie nodo = this;
        for (int c = 0; c < unaPalabra.length(); c++) {
            int indice = unaPalabra.charAt(c) - 'a';
            if (nodo.hijos[indice] == null) {
                nodo.hijos[indice] = new TNodoTrie();
            }
            nodo = nodo.hijos[indice];
        }
        nodo.esPalabra = true;
    }

    private void imprimir(String s, TNodoTrie nodo) {
        if (nodo != null) {
            if (nodo.esPalabra) {
                System.out.println(s);

            }
            for (int c = 0; c < CANT_CHR_ABECEDARIO; c++) {
                if (nodo.hijos[c] != null) {
                    imprimir(s + (char) (c + 'a'), nodo.hijos[c]);
                }
            }
        }
    }

    @Override
    public void imprimir() {

        imprimir("", this);
    }

    private TNodoTrie buscarNodoTrie(String s) {
        TNodoTrie nodo = this;
        for (int c = 0; c < s.length(); c++) {
            int indice = s.charAt(c) - 'a';
            if (nodo.hijos[indice] == null) {
                return null;
            }
            nodo = nodo.hijos[indice];
        }
        return nodo;
    }

    private void predecir2(String s, LinkedList<String> palabras, TNodoTrie nodo) {

        String prefijoAux;

        char ch = 'a';
        for (int c = 0; c < 26; c++) {
            if (nodo.hijos[c] != null) {
                s = s + (char) (ch + c);
                predecir2(s, palabras, nodo.hijos[c]);
            }
        }
        if (nodo.esPalabra) {
            palabras.add(s);
        }
        // implementar

    }

    @Override
    public void predecir(String prefijo, LinkedList<String> palabras) {

        TNodoTrie nodo = this;
        for (int c = 0; c < prefijo.length(); c++) {
            int indice = prefijo.charAt(c) - 'a';

            if (nodo.hijos[indice] == null) {
                palabras = null;
            }
            nodo = nodo.hijos[indice];

        }
        predecir2(prefijo, palabras, nodo); //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int buscar(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
