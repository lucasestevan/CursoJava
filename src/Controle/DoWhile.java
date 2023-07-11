package Controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String texto = "";

        //o DO serve pra executar pelo menos uma vez o codigo,
        // o while sozinho nao executa caso a variavel ja esteja na condicao certa

        do {
            System.out.println("Bom dia, deseja continuar? [S/N]");
            texto = entrada.next();
        } while (!texto.equalsIgnoreCase("S"));

        entrada.close();
    }
}
