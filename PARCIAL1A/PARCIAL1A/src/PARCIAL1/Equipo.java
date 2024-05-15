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
public class Equipo implements IEquipo {
    private final String NombreEquipo;
    private final Lista<Alumno> Alumnos  ;

    public Equipo(String unNombre) {
        this.Alumnos = new Lista<>();
        this.NombreEquipo  = unNombre;
       
    }
@Override
      public String getNombreEquipo() {
        return NombreEquipo;
    }

    @Override
    public Lista<Alumno> getListaAlumnos() {
       return Alumnos;
    }

    @Override
    public String imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    

    
}
