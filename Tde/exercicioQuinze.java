package tde.poo;

import java.util.Scanner;

public class exercicioQuinze {
    public static void main(String[] args) {
        String frase;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a algo: ");
        frase = teclado.nextLine();

        System.out.println("Texto digitado: " + frase);
    }

}
