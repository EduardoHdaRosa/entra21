package aula13;

import java.util.Random;

public class exercicio5 {
	public static void main(String[] args) {
		int[][] matriz = new int[3][5];
		int sumZero = 0;
		int sumImp = 0;
		int sumPar = 0;
		Random generator = new Random();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = generator.nextInt(10);
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();

		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == 0) {
					sumZero++;
					System.out.println(sumZero);
				} else {
					if (matriz[i][j] % 2 == 0) {
						sumPar++;
					} else {
						sumImp++;
					}
				}
			}
		}

		System.out.println("O total de valores 0 " + sumZero);
		System.out.println("O total de valores pares " + sumPar);
		System.out.println("O total de valores impares " + sumImp);
	}
}
