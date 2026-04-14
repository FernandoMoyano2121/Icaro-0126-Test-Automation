package Practica_23;


/**
 * Excepción personalizada para validar edades inválidas.
 * Extiende de Exception (es una excepción verificada).
 */
public class EdadInvalidaException extends RuntimeException {

    /**
     * Constructor que recibe un mensaje de error.
     * @param mensaje Descripción del error de validación
     */
    public EdadInvalidaException(String message) {
        super(message);
    }
}
