package Controle;

public class For {
    public static void main(String[] args) {


        for (int i = 1; i < 10; i++) {
            System.out.println("bom dia " + i);
        }
        System.out.println("-------------------");
        System.out.println("-------------------");

        int cont = 10;
        int ateQuanto = 0;
        int salto = 2;

        for ( cont = 10 ; cont >= ateQuanto; cont -= salto) {
            System.out.println("bom dia " + cont);
        }

    }
}
