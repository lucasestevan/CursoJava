package Controle;

import java.util.Scanner;

public class ExerciciosEstruturaControle {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //----------------Exercicio 1--------------------------------------

    /*    int n1 = 0;
        int resto = 0;




        System.out.print("Digite um numero: ");
        n1 = entrada.nextInt();

        resto = n1 % 2;
        switch (resto) {
            case 0:
                System.out.print("O numero " + n1 + " é par");
                break;
            case 1:
                System.out.print("O numero " + n1 + " é impar");
                break;
            default:
        }
//----------------Exercicio 2--------------------------------------
        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Sua media é " + media);
            System.out.println("Aprovado");
        } else if (media < 7 && media > 4) {
            System.out.println("Sua media é " + media);
            System.out.println("Recuperação");
        } else {
            System.out.println("Sua media é " + media);
            System.out.println("Reprovado");
        }

        //----------------Exercicio 3--------------------------------------


        int n1 = 0;
        int sair = 1;
        int totalNumero = 0;

        while (sair > 0) {

            System.out.print("Digite o valor: ");
            n1 = entrada.nextInt();
            sair = n1;
            if (n1 > 0) {
                totalNumero = totalNumero + n1;
                System.out.println(totalNumero);
            }
        }
*/

        //----------------Exercicio 3--------------------------------------


        int n1 = 0;
        int maiorValor = 0;

        for (int contador = 1; contador <= 3; contador++) {
            System.out.print("Digite o " + contador + " valor: ");
            n1 = entrada.nextInt();

            if (n1 > maiorValor){
                maiorValor = n1;
            }
        }

        System.out.println("O maior valor digitado foi o "+ maiorValor);

        entrada.close();


    }
}
