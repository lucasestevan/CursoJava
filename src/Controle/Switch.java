package Controle;

import java.util.Locale;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String conceito = "";
        System.out.print("Informe a nota: ");
        int nota = entrada.nextInt();

        switch (nota) {
            case 10:
            case 9:
                conceito = "A";
                System.out.print("conceito A");
                break;

            case 8:
            case 7:
                conceito = "B";
                System.out.print("conceito B");
                break;
            case 6:
            case 5:
                conceito = "C";
                System.out.print("conceito C");
                break;
            case 4:
            case 3:
                conceito = "D";
                System.out.print("conceito D");
                break;
            case 2:
            case 1:
            case 0:
                conceito = "E";
                System.out.print("conceito E");
                break;
            default:
                conceito = "Nao encontrado";


        }


        String cor = "";
        System.out.print("Informe a cor: ");
        cor = entrada.next().toLowerCase();

        switch (cor) {
            case "azul":
                System.out.println("A cor digitada é " + cor);
                break;
            case "rosa":
                System.out.println("A cor digitada é " + cor);
                break;
            default:
                cor = "cor nao encontrada";
        }
        entrada.close();
    }
}
