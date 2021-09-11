package Tde;

public class exercicioVinteCinco {
	public static void main(String[] args) {
		
		int par = 0;
		int impar = 0;
		int i;
		
		for(i = 0; i <= 30; i ++) {  //i++ mesma coisa que i = i + 1//
			if(i % 2 ==0) {		//numero par//
				if(i>2) {		//se numero par for maior que 2//
					par = par * i;		
				}else {			//se numero par for menor que 2//
					par = i;
				}
			}else {				//se não for numero par//
				impar = impar + i;
			}
		}
		System.out.println("Soma dos ímpares = "+impar);
		System.out.println("Multiplicação dos pares = "+par);
	}
}
