/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PARCIAL1;

public class Parcial1 {

    public static void main(String[] args) {
        Lista<Alumno> AED1 = new Lista<>();

        /**
         * Crear los alumnos y  Cargar en AED1 a partir del archivo "alumnos.csv”
         * Cada línea tiene el nombre del alumno y el equipo al que pertenece. 
         *          *
         */
                       
        Lista<Equipo> ListaEquipos = new Lista<>();
        
        ListaEquipos.insertar(new Nodo(new Equipo("Equipo1"), "Equipo1"));        
        ListaEquipos.insertar(new Nodo(new Equipo("Equipo2"), "Equipo2"));        
        
       ListaEquipos.insertar(new Nodo(new Equipo("Equipo3"), "Equipo3"));        
       ListaEquipos.insertar(new Nodo(new Equipo("Equipo4"), "Equipo4"));        
       
        if (!AED1.enlazaEnEquipos(ListaEquipos)){
            // indicar el error 
        } 
        else{
            // salvar los equipos y sus alumnos al archivo "salida.txt"
        }
     
  
    }
}
