package uy.edu.ucu.aed;

import org.junit.Before;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class TArbolTrieTest_JUnit4 {

    private TArbolTrie trie;

    @Before
    public void inicializar() {
        trie = new TArbolTrie();
    }

    // Casos de prueba para el método insertar
    @Test
    public void dadoTrieVacio_cuandoInsertarPalabra_entoncesPalabraEsAgregada() {
        // Dado
        final String palabra = "test";
        
        // Cuando
        trie.insertar(palabra);

        // Entonces
        int comparaciones = trie.buscar(palabra);
        assertTrue("La palabra debe estar presente en el trie.", comparaciones > 0);
    }

    @Test
    public void dadoTrieConPalabras_cuandoInsertarPalabraExistente_entoncesLaPalabraNoSeDuplica() {
        // Dado
        final String palabra = "test";
        trie.insertar(palabra);
        
        // Cuando
        trie.insertar(palabra);

        // Entonces
        List<String> palabrasPredichas = trie.predecir(palabra.substring(0, 1));
        long conteoPalabras = palabrasPredichas.stream().filter(p -> p.equals(palabra)).count();
        assertEquals("La palabra no debe duplicarse en el trie.", 1, conteoPalabras);
    }

    // Casos de prueba para el método buscar
    @Test
    public void dadoTrieConPalabras_cuandoBuscarPalabraExistente_entoncesDevuelveComparacionesPositivas() {
        // Dado
        final String palabra = "test";
        trie.insertar(palabra);

        // Cuando
        int comparaciones = trie.buscar(palabra);

        // Entonces
        assertTrue("Debe devolver un número de comparaciones mayor a cero para una palabra existente.", comparaciones > 0);
    }

    @Test
    public void dadoTrieConPalabras_cuandoBuscarPalabraNoExistente_entoncesDevueleUno() {
        // Dado
        final String palabraExistente = "test";
        final String palabraNoExistente = "noexiste";
        trie.insertar(palabraExistente);

        // Cuando
        int comparaciones = trie.buscar(palabraNoExistente);

        // Entonces
        assertEquals("Debe devolver cero comparaciones para una palabra no existente.", 1, comparaciones);
    }

    // Casos de prueba para el método predecir
    @Test
    public void dadoTrieConPalabras_cuandoPredecirConPrefijoExistente_entoncesDevuelvePalabrasConEsePrefijo() {
        // Dado
        final String[] palabras = {"test", "temp", "trie", "ejemplo"};
        for (String palabra : palabras) {
            trie.insertar(palabra);
        }
        final String prefijo = "te";

        // Cuando
        List<String> palabrasConPrefijo = trie.predecir(prefijo);

        // Entonces
        assertTrue("Debe incluir palabras con el prefijo dado.", palabrasConPrefijo.contains("test"));
        assertTrue("Debe incluir palabras con el prefijo dado.", palabrasConPrefijo.contains("temp"));
        assertFalse("No debe incluir palabras sin el prefijo dado.", palabrasConPrefijo.contains("trie"));
    }

    @Test
    public void dadoTrieVacio_cuandoPredecirConCualquierPrefijo_entoncesDevuelveListaVacia() {
        // Dado
        final String prefijo = "cualquier";

        // Cuando
        List<String> palabrasConPrefijo = trie.predecir(prefijo);

        // Entonces
        assertTrue("Debe devolver una lista vacía si el trie está vacío.", palabrasConPrefijo.isEmpty());
    }
}