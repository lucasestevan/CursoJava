package fundamentos;

import java.util.Scanner;

public class DesafioCalculos {

    public static void main(String[] args) {
        java.util.Scanner entrada = new java.util.Scanner(System.in);


        System.out.print("Digite o primeiro valor: ");
        double n1 = entrada.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double n2 = entrada.nextDouble();

        System.out.print("Digite o operador [+] [-] [*] [/] ");
        String operador = entrada.next();

        double resultado = "+".equals(operador) ? n1 + n2 : 0;
        resultado = "-".equals(operador) ? n1 - n2 : resultado;
        resultado = "*".equals(operador) ? n1 * n2 : resultado;
        resultado = "/".equals(operador) ? n1 / n2 : resultado;


        System.out.printf("o resultado é: %.2f", resultado);

        entrada.close();


    }
}
