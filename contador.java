package Atividade;

public class Contador {
	
	public static void main(String[] args) {
		System.out.println("Contador");
		int numero = 0;
		contador(numero, true);
	}
	
	public static int contador(int numero, boolean isASC) {
		if (numero < 0) {
			return numero;
		}
		else if (numero > 10) {
			return contador(numero = numero - 1, false);
		}
		System.out.println(numero);
		if (isASC) {
			return contador(numero = numero + 1, true);
		}
		else {
			return contador(numero = numero - 1, false);
		}
	}

}
