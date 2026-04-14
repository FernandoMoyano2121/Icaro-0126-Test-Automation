package Practica_21;

public class EjemploJerarquia {

    static void capturaTodasLasExcepciones() {
        try{
            int resultado = 10 / 0;
            System.out.println(resultado);
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
    }


    public static void multiplesCatches(){
        try{
            String texto =null;
            System.out.println(texto.length());
        }catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }catch(Exception excepcion ){
            System.out.println(excepcion.getMessage());
            System.out.println(excepcion.getClass());
        }
    }

    static void main() {

        capturaTodasLasExcepciones();
        multiplesCatches();
    }
}
