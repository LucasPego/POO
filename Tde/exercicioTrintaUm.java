package Tde;

import java.util.Scanner;

public class exercicioTrintaUm {
	public static void main(String[] args) {
		double libra, kg, calculo;
		String caractere;  //kg p/ libra or libra p/ kg//
		//java q == kg p/ libra//
		//java l == libra p/ kg//
 		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o comando: ");
		caractere = leitor.next();
		if (caractere == "java q") {
			System.out.println("Digite quantos kg quer converter: ");
			kg = leitor.nextDouble();
			calculo = kg * 0.453592;
		}
	}
}
