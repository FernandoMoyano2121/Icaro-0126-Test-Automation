package Practica_23;

public class Main {
    static void main(){

        //Caso 1 Exito=Crear una persona con edad valida
        System.out.println("=========== EDAD VALIDA =============");
        try{
            Persona juan=new Persona("Juan",25);
            System.out.println("Persona creada: " + juan);
        }catch(EdadInvalidaException e){
            System.out.println("Error: " + e.getMessage());
        }

        //Caso 2 Edad negativa
        System.out.println("============== EDAD NEGATIVA ===============");
        try{
            Persona maria=new Persona("Maria", -5);
            System.out.println("Persona creada: " + maria);
        }catch(EdadInvalidaException e){
            System.out.println("Error: " + e.getMessage());
        }

        //Caso 3 Edad muy alta
        System.out.println("============== EDAD MUY ALTA ===============");
        try{
            Persona pedro=new Persona("Pedro", 101);
            System.out.println("Persona creada: " + pedro);
        }catch(EdadInvalidaException e){
            System.out.println("Error: " + e.getMessage());
        }

        //Caso Modificar edad
        System.out.println("===========Modificar edad de persona existente=========");
        try{
            Persona juan=new Persona("Juan", 25);
            System.out.println("Persona creada: " + juan.toString());

            juan.setEdad(-10);
            System.out.println("Edad modificada: " + juan.getEdad());

        }catch(EdadInvalidaException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
