package Practica_17;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== PRÁCTICA 5: POLIMORFISMO ==========\n");

        // Crear alumnos
        Alumno alumno1 = new Alumno("Juan", "Pérez", "A-2024-001");
        Alumno alumno2 = new Alumno("María", "González", "A-2024-002");
        Alumno alumno3 = new Alumno("Pedro", "Rodríguez", "A-2024-003");

        // Crear profesor y agregar alumnos

        Profesor profesor1 = new Profesor("Ana", "Martínez");
        profesor1.agregarAlumno(alumno1);
        profesor1.agregarAlumno(alumno2);
        profesor1.agregarAlumno(alumno3);


        // Crear no docente
        NoDocente noDocente1 = new NoDocente("Carlos", "López", "Administración");

        // ===== DEMOSTRACIÓN DE SOBRECARGA =====

        System.out.println("===== DEMOSTRACIÓN DE SOBRECARGA =====");

        profesor1.calificar(alumno1,9);
        profesor1.calificar(7);
        profesor1.mostrarAlumnos();


        // ===== DEMOSTRACIÓN DE POLIMORFISMO =====

        System.out.println("\n===== DEMOSTRACIÓN DE POLIMORFISMO =====");

        ArrayList<Persona>personas=new ArrayList<>();

        personas.add(alumno1);
        personas.add(profesor1);
        personas.add(noDocente1);
        personas.add(alumno2);

        for(Persona persona:personas){
            System.out.print(persona.getNombre() + " " + persona.getApellido() + " dice: ");
            persona.saludar();
        }
    }
}
