package practico4.ejercicio1;

import java.util.HashSet;


public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias;
    
    // CONTRUCTOR //
    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = new HashSet<>();
    }
    // CONTRUCTOR //

    // GET - SET //
    public int getLegajo() {
        return legajo;
    }
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // GET - SET //

    // METODOS RELACION CON MATERIAS
    public void agregarMateria(Materia m) {
        materias.add(m);
    }
    public void eliminarMateria(Materia m) {
        materias.remove(m);
    }
    public HashSet<Materia> getMaterias() {
        return materias;
    }
    // METODOS RELACION CON MATERIAS

    public String getCantidadMaterias() {
        String resultado = nombre + " está inscripto en " + materias.size() + " materias:\n";

        for (Materia m : materias) {
            resultado += "-" + m.getNombre() + " (Año " + m.getAnio() + ")\n";
        }

        return resultado;
    }
    
    @Override
    public String toString() {
        return nombre + " " + apellido + " (Legajo: " + legajo + ")";
    }


         
         /* 
             /\_/\           ___
            = o_o =_______    \ \ 
             __^      __(  \.__) )
         (@)<_____>__(_____)____/
         */

}
