package Practica_13;

import Practica_12.Estudiante;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(1001, "María Gonzalez", 8.0f);

        //Mostrar caracteristicas del Estudiante
        System.out.println("DATOS DEL ESTUDIANTE");
        System.out.println("ID: " + estudiante.getId());
        System.out.println("Nombre: " + estudiante.getNombreCompleto());
        System.out.println("Promedio: " + estudiante.getPromedio());
    }
}
