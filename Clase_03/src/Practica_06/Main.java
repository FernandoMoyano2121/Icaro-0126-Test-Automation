package Practica_06;

import java.util.ArrayList;

public class Main {
    public static void main(){
        //Array
        //int[] temperaturas={10,35,23};
        int[] temperaturas=new int[]{10,35,23};

        //ArrayList(tamaño dinamico)

        ArrayList<Integer> notas=new ArrayList<>();
        notas.add(7);
        notas.add(10);
        notas.add(16);

        System.out.println("Primer temperatura: "+ temperaturas[0]);
        System.out.println("Notas : " + notas);
    }
}
