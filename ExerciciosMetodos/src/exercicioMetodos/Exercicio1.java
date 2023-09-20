package exercicioMetodos;

import java.util.Scanner;

public class Exercicio1 {
	/*Faça um programa em que o usuário entre com um número de 1 a 4
	Com o número 1 sendo verão, 2 sendo outono...
	Dependendo de o que o usuário informa, printe:

	É verão
	E o tempo está quente

	Ou

	É inverno
	E está frio
	*/
	public static void selecionarEstac(int estacao) {
		switch (estacao) {
		case 1:
			System.out.println("É verão, está muito quente");
			break;
		case 2:
			System.out.println("É outono, está muito agrável");
			break;
		case 3:
			System.out.println("É primavera, as flores estão muito lindas");
			break;
		case 4:
			System.out.println("É inverno, está muito frio");
			break;
		default:
			System.out.println("Valor não reconhecido");
			break;
		}
	}
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int estacao;
		System.out.println("1-verão 2-outono 3-primavera 4- inverno");
		estacao=entrada.nextInt();
		selecionarEstac(estacao);
	}
}

