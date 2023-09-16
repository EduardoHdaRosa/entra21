package revisao;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		// Descreva um algoritmo que leia vá lendo números inteiros até o usuário entrar
		// com o número 0
		Scanner entrada = new Scanner(System.in);
		float menorVal = Integer.MAX_VALUE;
		float maiorVal = Integer.MIN_VALUE;
		int cont = 0;
		float sum = 0;
		int opc = 1;
		float aux = 0;
		while (opc != 0) {
			System.out.println("Informe um valor");
			aux = entrada.nextFloat();
			if (aux < menorVal) {
				menorVal = aux;
			}
			if (aux > maiorVal) {
				maiorVal = aux;
			}
			sum = aux + sum;
			cont++;
			System.out.println(
					"Insira 0 se deseja parar de inserir o valor, caso contrario informe qualquer outro número");
			opc = entrada.nextInt();

		}
		System.out.println("O menor valor inserido: " + menorVal);
		System.out.println("O maior valor inserido: " + maiorVal);
		System.out.println("A média de valores inseridos: " + (sum / cont));
	}
}
