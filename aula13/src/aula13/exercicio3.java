package aula13;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		int cont = 1;
		int sumC = 0;
		int prodL = 1;
		int sumtot = 0;
		int prodDiag = 1;
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = cont;
				cont++;
			}

		}
		for (int i = 0; i < matriz.length; i++) {// i menor que o valor total de linhas
			for (int j = 0; j < matriz[i].length; j++) {// j menor que o valor total de colunas
				System.out.print(matriz[i][j] + " ");// espaçar as linhas
			}
			System.out.println();
		}
		prodL = matriz[0][0];
		prodDiag = matriz[0][0];
		for (int i = 0; i < matriz.length; i++) {// i menor que o valor total de linhas
			for (int j = 0; j < matriz[i].length; j++) {// j menor que o valor total de colunas
				if (j == 0) {
					sumC = matriz[i][j] + sumC;
				}
				if (i == 0) {
					prodL = matriz[i][j] * prodL;
				}
				if (i == j) {
					prodDiag = matriz[i][j] * prodDiag;
				}
				sumtot = matriz[i][j] + sumtot;

			}
		}
		System.out.println("A soma da primeira coluna " + sumC);
		System.out.println("O produto da primeira linha " + prodL);
		System.out.println("A soma total " + sumtot);
		System.out.println("O produto da diagonal " + prodDiag);
	}
}
