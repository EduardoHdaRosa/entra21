package exercicioMetodos;

import java.util.Scanner;

/*Faça um programa que receba 2 números do usuário.
Faça um método que descubra qual dos números é maior
Se os dois números forem iguais, informe: número iguais*/
public class exercicio4 {
	public static void verificarMaiorMenorValor(int a, int b) {
		if(a>b) {
			System.out.println("O valor A é maior "+a);
		}
		else if(a<b) {
			System.out.println("O valor B é maior "+b);
		}
		else {
			System.out.println("São iguais");
		}
	}
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int a;
		int b;
		System.out.println("Informe o valor A");
		a=entrada.nextInt();
		System.out.println("Informe o valor do B");
		b=entrada.nextInt();
		 verificarMaiorMenorValor(a,b);
	}
}
