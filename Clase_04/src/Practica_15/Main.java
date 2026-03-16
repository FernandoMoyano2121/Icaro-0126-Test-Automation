package Practica_15;

public class Main {
    public static void main(String[] args){
       Alumno alumno1=new Alumno("Juan", "Perez", "A-3242-3");
       alumno1.agregarMateria("Matemática");
       alumno1.agregarMateria("Programación");

       Profesor profesor1= new Profesor("Ana", "Martinez");
       profesor1.agregarAlumno(alumno1);

       NoDocente noDocente=new NoDocente("Carlos", "Lopez", "Administración");


        System.out.println("ALUMNO");
        System.out.println("Nombre : " + alumno1.getNombre());
        System.out.println("Matricula : " + alumno1.getMatricula());


        System.out.println("PROFESOR");
        System.out.println("Nombre : " + profesor1.getNombre() + " " + profesor1.getApellido());
        System.out.println("Cantidad de alumnos : " + profesor1.getAlumnos().size());


        System.out.println("NO DOCENTE");
        System.out.println("Nombre :" + noDocente.getNombre() + " " + noDocente.getApellido());
        System.out.println("Area : " + noDocente.getArea());
    }
}
