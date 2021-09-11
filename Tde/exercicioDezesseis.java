package tde.poo;

import java.util.Scanner;

public class exercicioDezesseis {
        public static void main(String[] args) {
            String frase1;
            String frase2 = " – Exemplo String";

            Scanner teclado = new Scanner(System.in);

            System.out.println("Digite a algo: ");
            frase1 = teclado.nextLine();

            System.out.println("Texto digitado: " + frase1 + frase2);
        }
}
