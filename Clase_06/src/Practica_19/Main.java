package Practica_19;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(){
        Luz luzSala=new Luz("Sala");
        Luz luzCocina=new Luz("Cocina");
        Ventilador ventiladorHabitacion=new Ventilador("Habitacion");


        List<Encendible> dispositivos=new ArrayList<>();
        dispositivos.add(luzSala);
        dispositivos.add(luzCocina);
        dispositivos.add(ventiladorHabitacion);


        System.out.println("ENCENDIENDO TODOS LOS DISPOSITIVOS");
        for(Encendible dispositivo : dispositivos){
            dispositivo.encender();
        }

        System.out.println();

        System.out.println("APAGANDO TODOS LOS DISPOSITIVOS");
        for(Encendible dispositivo : dispositivos){
            dispositivo.apagar();
        }
    }
}
