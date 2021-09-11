package tde.poo;
import java.util.Scanner;

public class exercicioTrintaDois {
    public static void main(String[] args) {

        float h, b, B;
        //h == altura//
        //b == base menor//
        //B == base maior//
        float area;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor da altura = ");
        h = leitor.nextInt();

        System.out.println("Digite o valor da base menor = ");
        b = leitor.nextInt();

        System.out.println("Digite o valor da base maior = ");
        B = leitor.nextInt();

        area = (h*(b + B))/2;
        System.out.println("O valor da área do seu trapézio é de "+area+" m^2");
    }

}