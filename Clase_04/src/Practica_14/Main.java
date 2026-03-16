package Practica_14;


import Practica_12.Estudiante;

public class Main {
    public static void main(String[] args) {
        // Instanciar un objeto Estudiante con el constructor completo
        Estudiante estudiante = new Estudiante(1001, "María González", 8.5f);

        //java: id has private access in Practica_12.Estudiante
        //System.out.println(estudiante.id);

        //java: getId() has private access in Practica_12.Estudiante
        System.out.println("ID: " + estudiante.getId());
    }
}
