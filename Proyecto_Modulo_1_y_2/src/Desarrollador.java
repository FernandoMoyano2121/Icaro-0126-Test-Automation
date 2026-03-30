public class Desarrollador extends Empleado{
    private String lenguajePrincipal;


    //CONSTRUCTOR
    public Desarrollador(String nombre,int legajo,double salarioBase, String lenguajePrincipal ){
        super(nombre, legajo, salarioBase);
        this.lenguajePrincipal=lenguajePrincipal;
    }

    //==================GETTERS Y SETTERS=====================

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }

    //======================= METODOS ===========================
}
