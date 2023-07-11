package Controle;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = entrada.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota invalida");
        } else if (nota >= 7.1) {
            System.out.println("Conceito A");
        } else {
            if (nota >= 6.1) {
                System.out.println("conceito B");
            } else {
                if (nota >= 4.1) {
                    System.out.println("conceito C");
                } else {
                    System.out.println("conceito D");
                }
            }
        }
    }
}
