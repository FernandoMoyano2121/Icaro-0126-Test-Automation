package Practica_20;

import java.util.Scanner;

public class CalculadoraSimple {

    static void main(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        int numero1= scanner.nextInt();


        System.out.println("Ingresa el segundo numero: ");
        int numero2 = scanner.nextInt();

        try{
            int resultado=numero1/numero2;
            System.out.println("El resultado de la operación es "+ resultado);
        }catch(ArithmeticException e){
            System.out.println("[ERROR]: No se puede dividir por cero ");
            System.out.println(e.getMessage());
            // System.out.println(e.getCause());
        }

        System.out.println("Gracias por usar la calculadora");
        scanner.close();

    }

}
