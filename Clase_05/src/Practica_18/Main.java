package Practica_18;

public class Main {
    public static void main(String[] args){
        PagoTarjeta pagoTarjeta=new PagoTarjeta(
                150.50,
                "2024-22-28",
                "1234-5678-9012",
                "123");

        // Crear un objeto de tipo PagoTransferencia
        PagoTransferencia pagoTransferencia = new PagoTransferencia(
                300.00,
                "2024-11-28",
                "0001234567890"
        );

        System.out.println("=========PROCESANDO PAGOS=========");
        pagoTarjeta.procesarPago();
        System.out.println();
        pagoTransferencia.procesarPago();

    }
}
