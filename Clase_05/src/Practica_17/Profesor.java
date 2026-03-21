package Practica_17;

import java.util.ArrayList;

public class Profesor extends Persona {
    private ArrayList<Alumno> alumnos;

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
        this.alumnos = new ArrayList<>();
    }

    @Override
    public void saludar() {
        System.out.println("Hola a todos Bienvenidos! ");
    }

    public void calificar(Alumno alumno, int nota) {
        alumno.setNota(nota);
        System.out.println("Se asignó la nota " + nota + " a " + alumno.getNombre() + " " + alumno.getApellido());
    }

    public void calificar(int nota) {
        for (Alumno alumno : alumnos) {
            alumno.setNota(nota);
        }

        System.out.println("Se asignó la nota " + nota + " a todos los alumnos");

    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public void mostrarAlumnos() {
        System.out.println("============== ALUMNOS =============");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}
