package Tde;

public class exercicioVinteSeis {
	public static void main(String[] args) {
		int i;
		for (i = 2; i <= 123; i++) { //n�meros primos come�am por 2//
			if(nmrPrimo(i))			 //aplica o for da vari�vel abaixo no for desta//
				System.out.println(i);
			
		}
	}
	public static boolean nmrPrimo(int nmr) {
		for (int j = 2; j < nmr; j++) { //n�meros primos v�o ser maiores que 2//
			if (nmr % j ==0)			//se resto da divis�o do nmr for 0 ele n�o � primo//
				return false;
		}return true;
	}
}
