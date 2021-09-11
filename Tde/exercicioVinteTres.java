package Tde;

import java.util.Scanner;

public class exercicioVinteTres {
	
	public static void main(String[] args) {
		
		var valorInt = 5;
		double valorDouble;
		double resultado;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu valor double!");
		valorDouble = leitor.nextDouble();
		
		resultado = valorInt * valorDouble;
		System.out.println("Resultado = "+resultado);
		
	}

}



