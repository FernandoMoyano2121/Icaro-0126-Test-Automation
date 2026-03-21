package Practica_18;

public class PagoTransferencia extends Pago {
    private String cuentaBancaria;

    public PagoTransferencia(double monto, String fecha, String cuentaBancaria) {
        super(monto, fecha);
        this.cuentaBancaria = cuentaBancaria;
    }

    @Override
    public boolean procesarPago(){
        System.out.println("Procesando transferencia bancaria");
        System.out.println("Monto: $" + getMonto());
        return true;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }
}
