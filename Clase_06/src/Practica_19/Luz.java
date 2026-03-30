package Practica_19;

public class Luz implements Encendible{
    private String ubicacion;
    private boolean encendida;

    public Luz(String ubicacion){
        this.ubicacion=ubicacion;
        this.encendida=false;
    }

    @Override
    public void encender(){
        encendida=true;
        System.out.println("💡 Luz de " + ubicacion + " encendida - Iluminando...");
    }

    @Override
    public void apagar(){
        encendida=false;
        System.out.println("💡 Luz de " + ubicacion + " apagada");
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public boolean isEncendida() {
        return encendida;
    }
}
