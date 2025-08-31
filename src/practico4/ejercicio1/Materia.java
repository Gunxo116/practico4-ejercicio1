package practico4.ejercicio1;

public class Materia {

    private int idmateria;
    private String nombre;
    private int anio;

    // CONSTRUCTOR //
    public Materia(int idmateria, String nombre, int anio) {
        this.idmateria = idmateria;
        this.nombre = nombre;
        this.anio = anio;
    }
    // CONSTRUCTOR //

    // GET - SET //
    public int getIdmateria() {
        return idmateria;
    }
    public void setIdmateria(int idmateria) {
        this.idmateria = idmateria;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    // GET - SET //

        /* 
             /\_/\           ___
            = o_o =_______    \ \ 
             __^      __(  \.__) )
         (@)<_____>__(_____)____/
         */

    
    @Override
    public String toString() {
        return nombre + "  " +"Año: "+anio + " (Id_Materia: " + idmateria + ")";
    }

}
