package Practica_17;

public class NoDocente extends Persona {
    private String area;

    public NoDocente(String nombre, String apellido, String area) {
        super(nombre, apellido);
        this.area = area;
    }

    @Override
    public void saludar() {
        System.out.println("Buen dia! ");
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

}
