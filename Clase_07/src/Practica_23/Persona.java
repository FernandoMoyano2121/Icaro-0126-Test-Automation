package Practica_23;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad)throws EdadInvalidaException{
        this.nombre=nombre;
        setEdad(edad);
    }

    public void setEdad(int edad) throws EdadInvalidaException {
       if(edad < 0){
           throw new EdadInvalidaException("La edad no puede ser negativa " + edad);
       }

       if(edad > 100){
           throw new EdadInvalidaException("La Edad no puede ser mayor a 100 " + "edad: "+ edad);
       }

       this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString(){
        return "nombre= '" + nombre + "', edad= " + edad + "";
    }
}
