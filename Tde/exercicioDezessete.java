package tde.poo;

import java.util.Scanner;

public class exercicioDezessete {
    public static void main(String[] args) {
        String frase;
        int caracter;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a algo: ");
        frase = teclado.nextLine();

        String result = frase.replaceAll("\\s+","");

        int caracteres = result.length();

        System.out.println("Texto digitado: " + frase);

        System.out.println("Total de caracteres: " + caracteres);
    }
}
