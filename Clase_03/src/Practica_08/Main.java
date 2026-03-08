package Practica_08;

public class Main {
    public static void main(){
        int hora=15;

        if(hora < 12){
            System.out.println("Buenos dias !");
        }else if(hora < 19){
            System.out.println("Buenas tardes! ");
        }else{
            System.out.println("Buenas noches! ");
        }


        int opcion=1;

        switch (opcion){
            case 1:
                System.out.println("Elegiste Pizza");break;
            case 2:
                System.out.println("Elegiste empanadas");break;
            default:
                System.out.println("Opcion no valida!");break;
        }
    }
}
