public interface Trabajador {

    /**
     * Describe la actividad realizada por el trabajador
     * @return String con la descripcion de la actividad del trabajador
     */
    String trabajar();

    /**
     * Calcula el salario del trabajador segun su tipo
     * @return double con el salario calculado
     */
    double calcularSalario();
}
