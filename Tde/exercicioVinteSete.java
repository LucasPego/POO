package Tde;

import java.util.Scanner;

public class exercicioVinteSete {
	public static void main(String[] args) {
	//Numero primo: divis�vel por 1 e por ele mesmo//
	//Numero de divisores � 2//
		int numero, i;
		int divisoresCont = 0;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um numero = ");
		numero = leitor.nextInt();
		for (i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				divisoresCont++;
			}
		}
		if (divisoresCont == 2) {
			System.out.println("N�mero � primo!");
		}
		if (numero % 2 == 0) {
			System.out.println("O n�mero � par!");
		}else {
			System.out.println("O n�mero � �mpar!");
		}
	}
}
