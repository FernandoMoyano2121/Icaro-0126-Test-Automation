package Practica_19;

public class Ventilador implements Encendible{
    private String ubicacion;
    private boolean encendido;


    public Ventilador(String ubicacion){
        this.ubicacion=ubicacion;
        this.encendido=false;
    }

    @Override
    public void encender(){
        encendido=true;
        System.out.println("🌀 Ventilador de " + ubicacion + " encendido - Girando aspas...");

    }

    @Override
    public void apagar(){
        encendido=false;
        System.out.println("🌀 Ventilador de " + ubicacion + " apagado");
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public boolean isEncendido() {
        return encendido;
    }
}
