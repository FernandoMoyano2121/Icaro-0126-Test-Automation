package Practica_15;

import java.util.ArrayList;

public class Profesor extends Persona{
    private ArrayList<Alumno> alumnos;

    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
        this.alumnos=new ArrayList<>();
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void agregarAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }
}
