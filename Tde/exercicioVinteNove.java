package Tde;

import java.util.Scanner;

public class exercicioVinteNove {
	
	public static void main(String[] args) {
		
		double valorHora = 10.25;
		int horasTrabalhadas;
		double calculo;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite quantas horas você trabalhou: ");
		horasTrabalhadas = leitor.nextInt();
		
		calculo = valorHora * horasTrabalhadas;
		System.out.println("Você receberá R$"+calculo);
	}

}
