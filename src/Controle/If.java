package Controle;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a media: ");
        double media = entrada.nextDouble();

        if (media >= 7) {
            System.out.println("Aprovado");
        }
        if (media < 7 && media >= 4.5) {
            System.out.println("recuperação");
        }
        if (media < 4.5) {
            System.out.println("Reprovado");
        }

        entrada.close();
    }
}
