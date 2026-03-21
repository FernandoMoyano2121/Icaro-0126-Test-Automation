package Practica_16;

public class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }


    @Override
    public String comunicarse() {
        return "Maullando!";
    }
}
