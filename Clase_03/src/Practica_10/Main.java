package Practica_10;

import java.util.Scanner;

public class Main {
    public static void main(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre=sc.next();

        System.out.println("Ingresa tu edad: ");
        int edad=sc.nextInt();

        System.out.println("Ingresa tu altura: ");
        double altura=sc.nextDouble();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);

        sc.close();
    }
}
