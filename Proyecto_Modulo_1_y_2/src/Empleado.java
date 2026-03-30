public abstract class Empleado implements Trabajador {
    private String nombre;
    private int legajo;
    private double salarioBase;



    //Constantes para validacion de salario
    private static final double SALARIO_MINIMO=0;
    private static final double SALARIO_MAXIMO=1000000;

    /**
     *
     * @param nombre
     * @param legajo
     * @param salarioBase
     */
    public Empleado(String nombre, int legajo, double salarioBase) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.salarioBase = salarioBase;
    }

    // ==================== GETTERS =======================

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return
     */
    public int getLegajo() {
        return legajo;
    }

    /**
     *
     * @return
     */
    public double getSalarioBase() {
        return salarioBase;
    }


    // ========================= SETTERS====================
    // ...
    //==========================METODOS=====================

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
    }

    /**
     * Metodo abstracto para calcular salario segun empleado
     * @return salario calculado segun el tipo de empleado
     */
    public abstract double calcularSalario();
}
