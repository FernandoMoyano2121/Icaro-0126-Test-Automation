package Practica_17;

import java.util.ArrayList;

public class Alumno extends Persona {
    private String matricula;
    private Integer nota;
    private ArrayList<String> materias;

    public Alumno(String nombre, String apellido, String matricula) {
        super(nombre, apellido);
        this.matricula = matricula;
        this.nota = 0;
        this.materias=new ArrayList<>();
    }

    @Override
    public void saludar() {
        System.out.println("Que onda!");
    }

    public String getMatricula() {
        return matricula;
    }

    public Integer getNota() {
        return nota;
    }

    public ArrayList<String> getMaterias() {
        return materias;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public void setMaterias(ArrayList<String> materias) {
        this.materias = materias;
    }

    public void agregarMateria(String materia) {
        this.materias.add(materia);
    }

    @Override
    public String toString() {
        return getNombre() + " " + getApellido() + "(Matricula: " + matricula + "Nota: " + nota + ")";
    }
}
