package fundamentos;

public class Scanner {
    public static void main(String[] args) {

        java.util.Scanner entrada = new java.util.Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Boa noite, " + nome + "Sua idade é " + idade + " anos");


        entrada.close(); //fechar o Scanner pq fica usando recurso da maquina
    }
}
