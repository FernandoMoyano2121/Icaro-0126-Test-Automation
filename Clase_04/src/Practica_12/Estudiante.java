package Practica_12;


/**
 * Representa un Estudiante con un Identificador nombre y promedio
 * <p>Esta clase permite crear instancias de estudiantes, acceder y modificar sus atributos.</p>
 */
public class Estudiante {
    private Integer id;
    private String nombreCompleto;
    private Float promedio;

    //constructor vacio
    public Estudiante(){}

    //constructor
    public Estudiante(Integer id, String nombreCompleto, Float promedio){
        this.id=id;
        this.nombreCompleto=nombreCompleto;
        this.promedio=promedio;
    }

    /**
    * Devuelve el identificador unico para el Estudiante
     * @return El identificador actual del estudiante
    */
    public Integer getId(){
        return id;
    }

    /**
     * Establece el identificador del estudiante.
     * @param id El nuevo identificador a asignar.
     */
    public void setId(Integer nuevoId){
        this.id=nuevoId;
    }

    /**
     * Devuelve el nombre completo del estudiante.
     * @return El nombre completo actual del estudiante.
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * Establece el nombre completo del estudiante.
     * @param nombreCompleto El nuevo nombre completo a asignar.
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * Devuelve el promedio del estudiante.
     * @return El valor actual del promedio.
     */
    public Float getPromedio(){
        return promedio;
    }

    /**
     * Establece el valor del promedio del estudiante.
     * @param promedio El nuevo valor del promedio a asignar.
     */
    public void setPromedio(Float promedio){
        this.promedio=promedio;
    }
}
