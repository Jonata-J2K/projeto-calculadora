package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero: ");
		double numero1 = sc.nextDouble();
		System.out.print("Informe a opera��o (+,-,/,*): ");
		String operacao = sc.next();
		System.out.print("Informe outro numero: ");
		double numero2 = sc.nextDouble();
		System.out.println();
		
		if (operacao.equals("+")) {
			System.out.println("A soma dos numeros �: " + (numero1 + numero2));
		} else if(operacao.equals("-")) {
			System.out.println("A subtra��o dos numeros �: " + (numero1 - numero2));
		} else if(operacao.equals("/")) {
			System.out.println("A divisao dos numeros �: " + (numero1 / numero2));
		} else if(operacao.equals("*")) {
			System.out.println("A multiplica��o" + (numero1 * numero2));
		}
			
		
		sc.close();
	}

}
