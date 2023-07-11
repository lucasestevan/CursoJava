package fundamentos;

public class AreaCircunferencia {

    public static void main(String[] args) {
        double raio = 3;
        double pi = 4;
        final double area = pi * raio * raio; //o 'final' nao deixa mudar o valor da variavel

        System.out.println("Area = "+ area);
    }
}
