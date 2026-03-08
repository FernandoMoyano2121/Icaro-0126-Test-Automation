package Practica_09;

public class Main {
    public static void main() {
        //while
        int i = 1;
        while (i <= 5) {
            System.out.println("[while]" + i);
            i++;
        }
        //do while
        int j = 1;

        do {
            System.out.println("[do while]" + j);
            j++;
        } while (j <= 5);

        //for
        for(int k=1; k <= 5; k++){
            System.out.println("[for]" + k);
        }

    }
}
