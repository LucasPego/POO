package tde.poo;

public class exercicioVinteUm {
    public static void main(String[] args) {
        double valor = 6;

        if (valor < 1.99 || valor > 5.99){
            System.out.println("O valor não está no intervalo 1.99 a 5.99");
        }
        else {
            System.out.println("O valor está no intervalo 1.99 a 5.99");
        }

        System.out.println("Valor verificado: " + valor);
    }
}
