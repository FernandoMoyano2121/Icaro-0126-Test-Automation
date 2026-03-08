package Practica_11;

import java.util.Scanner;

public class Main {
    public static void main(){
        Scanner scanner = new Scanner(System.in);

        int numero;
        int cantidad=0;

        do{
            System.out.println("Ingresa un numero [el programa finaliza con un numero mayor a 500] : ");
            numero=scanner.nextInt();
            cantidad ++;
        }while(numero <= 500);

        System.out.println("Ingresaste " + cantidad + " numeros.");

        scanner.close();
    }
}
