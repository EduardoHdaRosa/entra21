package revisao;

public class exercicio7 {
	public static void main(String[] args) {
		float sum = 0;
		int index;
		int menorCasa = Integer.MAX_VALUE;
		int maisQuarto = Integer.MIN_VALUE;
		int menosQuarto = Integer.MAX_VALUE;
		int casaMaiorVal=Integer.MIN_VALUE;;
		int maisQuartos=0;
		int indexMenosQuarto = 0;
		int indexMaisQuarto = 0;
		int indexQtdQuartos=0;
		int[][] matriz = { { 2104, 3, 399900 },

				{ 1600, 3, 329900 },

				{ 2400, 3, 369000 },

				{ 1416, 2, 232000 },

				{ 3000, 4, 539900 },

				{ 1985, 4, 299900 },

				{ 1534, 3, 314900 },

				{ 1427, 3, 199000 },

				{ 1380, 3, 212000 },

				{ 1494, 3, 242500 },

				{ 1940, 4, 240000 },

				{ 2000, 3, 347000 },

				{ 1890, 3, 330000 },

				{ 4478, 5, 699900 },

				{ 1268, 3, 259900 }

		};
		for (int i = 0; i < matriz.length; i++) {// i menor que o valor total de linhas
			System.out.print(matriz[i][2] + " ");// serve para espaçar as linhas
			sum = matriz[i][2] + sum;//soma apenas as colunas de total de valor das casas
			System.out.println();
			if (matriz[i][0] < menorCasa) {
				menorCasa = matriz[i][2];
				indexQtdQuartos= matriz[i][1];
				
			}
			if(matriz[i][2]>casaMaiorVal) {
				casaMaiorVal=matriz[i][2];
				maisQuartos=matriz[i][1];//variavel pra salvar o numero de quartos da casa mais cara
				
			}
			if (matriz[i][1] > maisQuarto) {
				maisQuarto = matriz[i][1];
				indexMaisQuarto = i;// salva a linha que matriz com o maior numero de quartos
			}
			if (matriz[i][1] < menosQuarto) {
				menosQuarto = matriz[i][1];
				indexMenosQuarto = i;// salva a linha que matriz com o menor numero de quartos se encontra
			}
			// System.out.println(" ");
		}
		System.out.println("O valor da menor casa é " + menorCasa+"a quantidade de quartos da casa é "+indexQtdQuartos);
		System.out.println("A quantidade de quartos da casa mais cara é "+maisQuartos);
		System.out.println("A media do valor das casas é " + (sum / matriz.length));
		for (int i = 0; i < matriz.length; i++) {
			if (i == indexMaisQuarto) {// verifica quando a indice chega na linha que tem o maior numero de quartos
				System.out.println("A diferença do maior quarto: "
						+ (matriz[i][0] - matriz[indexMenosQuarto][0]));/*
																		 * printa a diferença de tamanho da casa com maior numero
																		 * de quartos com a menor numero de quartos
																		 */
			}
		}

	}
}
