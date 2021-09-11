package Tde;

public class exercicioVinteSeis {
	public static void main(String[] args) {
		int i;
		for (i = 2; i <= 123; i++) { //números primos começam por 2//
			if(nmrPrimo(i))			 //aplica o for da variável abaixo no for desta//
				System.out.println(i);
			
		}
	}
	public static boolean nmrPrimo(int nmr) {
		for (int j = 2; j < nmr; j++) { //números primos vão ser maiores que 2//
			if (nmr % j ==0)			//se resto da divisão do nmr for 0 ele não é primo//
				return false;
		}return true;
	}
}
