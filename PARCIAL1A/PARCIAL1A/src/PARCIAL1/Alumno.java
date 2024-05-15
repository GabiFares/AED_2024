package PARCIAL1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ernesto
 */
public class Alumno implements IAlumno {
    private final String Nombre;
    private final String Equipo;

    public Alumno(String Nombre, String Equipo) {
        
        this.Nombre = Nombre;
        this.Equipo = Equipo;
    }

    
    @Override
    public String getNombre() {
        return this.Nombre;
    }

    @Override
    public String getEquipo() {
        return this.Equipo;
    }

    @Override
    public String imprimir() {
        return (Nombre + " Equipo: "+ getEquipo());
    }
    
   

}
