package Practica_16;

public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro("Max", 3);
        Animal gato = new Gato("Michi", 2);

        System.out.println(perro.getNombre() + " dice: " + perro.comunicarse());
        System.out.println(gato.getNombre() + " dice: " + gato.comunicarse());
    }
}
