package Controle;

public class DesafioFor {
    public static void main(String[] args) {
        /* fazer aparecer # no terminal sem usar numero
                          ##
                          ###
                          ####
                          #####

         */
        for ( String valor = "#"; !valor.equals("#######"); valor += "#") {
            System.out.println(valor);
        
        }
    }
}
