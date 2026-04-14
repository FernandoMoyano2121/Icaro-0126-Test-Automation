package Practica_22;

public class ErrorVsExcepcion {
    public static void ejemploExcepcion() {
        try {
            int[] numeros = new int[3];
            numeros[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepción manejada: " + e.getMessage());
            System.out.println("El programa puede continuar");
        }
    }

    public static void ejemploError(){
        // Este mtodo causa StackOverflowError
        // (NO lo manejes, déjalo fallar)
        ejemploError(); // Recursión infinita
    }

    static void main(){
        ejemploExcepcion();
        //ejemploError();
    }
}
