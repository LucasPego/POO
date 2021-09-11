package tde.poo;

import java.util.Scanner;
public class exercicioTreze {
    public static void main(String[] args) {
        String nome;
        int idade;
        float altura;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Nome: ");
        nome = teclado.nextLine();

        System.out.println("Idade: ");
        idade = teclado.nextInt();

        System.out.println("Altura: ");
        altura = teclado.nextFloat();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }
}
