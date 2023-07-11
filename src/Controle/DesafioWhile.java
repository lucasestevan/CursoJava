package Controle;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota = 0;
        double totalNota = 0;
        int notaInvalida = 0;
        double quantidadeNota = 0;
        double media = 0;
        String sair = "";

        System.out.println("------------------");
        System.out.println("------------------");

        while (!sair.equalsIgnoreCase("n")) {

            System.out.print("Digite o valor da nota: ");
            nota = entrada.nextDouble();

            if (nota >= 0 && nota <= 10) {
                totalNota = totalNota + nota;
                quantidadeNota++;

                media = totalNota / quantidadeNota;

            }else {
                System.out.println("Nota invalida");
                notaInvalida++;
            }

            System.out.println("Deseja continuar? [S/N] ");
            sair = entrada.next();

        }

        System.out.println("O Valor das notas somadas é de: " + totalNota);
        System.out.println("O total de notas invalidas é de: " + notaInvalida);
        System.out.println("A media das notas é de: "+ media);

        entrada.close();

    }
}
