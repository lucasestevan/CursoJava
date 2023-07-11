package Controle;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        String n1 = entrada.nextLine();
        int numero = Integer.parseInt(n1);

        if(numero % 2 == 0){
            System.out.println("O numero é par");
        } else {
            System.out.println("Numero impar");
        }




        entrada.close();
    }
}
