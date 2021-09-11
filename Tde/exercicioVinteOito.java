package Tde;

import java.util.Scanner;

public class exercicioVinteOito {
	
	public static void main(String[] args) {
		
		int idade;			//variável que pega a idade//
		int contador = 1;	//Soma de 1 em 1 até que chegue em 10//
		int contMasc = 0;	//Quantidade de homens//
		int contFem = 0;	//Quantidade de mulheres//
		int sexo;			//1 p/ masc; 2 p/ fem;//
		
		Scanner leitor = new Scanner(System.in);
		while (contador <= 10) {
			System.out.println("Informe sua idade: ");
			idade = leitor.nextInt();
			System.out.println("Informe seu sexo(1 p/ masc; 2 p/ fem;)");
			sexo = leitor.nextInt();
			if ((sexo == 1) && (idade >= 18));{
				contFem++;
			}
			if ((sexo == 2) && (idade >= 18)) {
				contMasc++;
			}
			contador++;
		}System.out.println("Quantidade de mulheres maiores de idade é "+contFem);
		System.out.println("Quantidade de homens maiores de idade é "+contMasc);
	}	
}
