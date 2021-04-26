package entidades;

public class Calculadora {

	private Double numero1;
	private Double numero2;
	private String operacao;
	private Double resuldato;
	
	public Calculadora(Double numero1, Double numero2, String operacao) {
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.operacao = operacao;
	}
	
	public void resultado() {
		
		if (operacao.equals("+")) {
			System.out.println("A soma dos numeros é: " + (numero1 + numero2));
		} else if(operacao.equals("-")) {
			System.out.println("A subtração dos numeros é: " + (numero1 - numero2));
		} else if(operacao.equals("/")) {
			System.out.println("A divisao dos numeros é: " + (numero1 / numero2));
		} else if(operacao.equals("*")) {
			System.out.println("A multiplicação" + (numero1 * numero2));
		}
		
	}
	
}
