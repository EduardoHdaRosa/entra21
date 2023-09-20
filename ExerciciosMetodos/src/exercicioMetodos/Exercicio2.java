package exercicioMetodos;

import java.util.Scanner;

public class Exercicio2 {
/*Faça um programa que some 4 números.
	Passando esses 4 números como parâmetros para um métod*/
	public static void somarValores(int a, int b, int c, int d) {
		System.out.println("A soma dos 4 valores "+(a+b+c+d));
	}
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int valorUm;
		int valorDois;
		int valorTres;
		int valorQuatro;
		System.out.println("Insira o valor 1");
		valorUm=entrada.nextInt();
		System.out.println("Insira o valor 2");
		valorDois=entrada.nextInt();
		System.out.println("Insira o valor 3");
		valorTres=entrada.nextInt();
		System.out.println("Insira o valor 4");
		valorQuatro=entrada.nextInt();
		somarValores(valorUm,valorDois,valorTres,valorQuatro);
	}
}
