package prova;

import java.util.Scanner;

public class Eduardo_2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// TODO Auto-generated method stub
		/*Escreva um programa onde o usuário informa os dados dos lados de um triangulo depois 
		verifique e retorne se ele é isóscele, escaleno ou equilátero.
		*/
		int ladoA;
		int ladoB;
		int ladoC;
		System.out.println("informe o lado A do triangulo");
		ladoA=entrada.nextInt();
		System.out.println("informe o lado B do triangulo");
		ladoB=entrada.nextInt();
		System.out.println("informe o lado c do triangulo");
		ladoC=entrada.nextInt();
		
		if(ladoA==ladoC & ladoA==ladoB) {
			System.out.println("triangulo equilátero");
		}
		else if(ladoA==ladoB || ladoB==ladoC || ladoA==ladoC) {
			System.out.println("triangulo isóscele");

		}
		else {
			System.out.println("triangulo escaleno");

		}

	}

}
