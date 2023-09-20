package aula13;

import java.util.Random;

public class Exercicio4 {
	public static void main(String[] args) {
		int[][] matriz = new int[7][8];
		Random generator = new Random();// metodo para gerar valores aleatorios para preencher a matriz
		for (int i = 0; i < matriz.length; i++) {// i menor que o valor total de linhas
			for (int j = 0; j < matriz[i].length; j++) {// j menor que o valor total de colunas
				matriz[i][j] = generator.nextInt(10);
			}

		}
		for (int i = 0; i < matriz.length; i++) {// i menor que o valor total de linhas
			for (int j = 0; j < matriz[i].length; j++) {// j menor que o valor total de colunas
				System.out.print(matriz[i][j] + " ");// espaçar as linhas
			}
			System.out.println();
		}
	}
}
