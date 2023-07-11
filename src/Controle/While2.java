package Controle;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {

        String sair = "";

        Scanner entrada = new Scanner(System.in);

        while (!sair.equalsIgnoreCase("n")) {

            System.out.println("Bom dia, deseja continuar? [S/N]");
            sair = entrada.next();

        }

        entrada.close();
    }
}
