package practico4.ejercicio1;

//IMPORTS//

public class Colegio {
    public static void main(String[] args) {
        
        Materia m1 = new Materia(1, "Web 2", 2);
        Materia m2 = new Materia(2, "Matemáticas", 1);
        Materia m3 = new Materia(3, "Laboratorio 1", 1);
        
        Alumno a1 = new Alumno(1001, "López", "Martin");
        Alumno a2 = new Alumno(1002, "Martínez", "Brenda");


        a1.agregarMateria(m1);
        a1.agregarMateria(m2);
        a1.agregarMateria(m3);

        a2.agregarMateria(m1);
        a2.agregarMateria(m2);
        a2.agregarMateria(m3);
        a2.agregarMateria(m3);

        System.out.println(a1.getNombre() + " está inscripto en " + a1.getCantidadMaterias());
        System.out.println(a2.getNombre() + " está inscripto en " + a2.getCantidadMaterias());

    }
    
}

/* 
             /\_/\           ___
            = o_o =_______    \ \ 
             __^      __(  \.__) )
         (@)<_____>__(_____)____/
 */
