package Practica_15;

import java.util.ArrayList;

public class Alumno extends Persona {

    private String matricula;
    private Double nota;
    private ArrayList<String> materias;

    public Alumno(String nombre, String apellido, String matricula){
        super(nombre, apellido);
        this.matricula=matricula;
        this.nota=0.0;
        this.materias=new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public Double getNota() {
        return nota;
    }

    public ArrayList<String> getMaterias() {
        return materias;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public void setMaterias(ArrayList<String> materias) {
        this.materias = materias;
    }

    public void agregarMateria(String materia){
        this.materias.add(materia);
    }
}
