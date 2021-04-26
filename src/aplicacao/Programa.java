package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Calculadora;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero: ");
		double numero1 = sc.nextDouble();
		System.out.print("Informe a operação (+,-,/,*): ");
		String operacao = sc.next();
		System.out.print("Informe outro numero: ");
		double numero2 = sc.nextDouble();
		System.out.println();
		
		Calculadora cal = new Calculadora(numero1, numero2, operacao);
		
		cal.resultado();
		
		sc.close();
	}

}
