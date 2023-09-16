package revisao;

public class exercicio7 {
public static void main(String[] args) {
		float sum=0;
		int index;
		int menorCasa=Integer.MAX_VALUE;
		int maisQuarto=Integer.MIN_VALUE;
		int[][] matriz = { { 2104, 3, 399900},

				{1600, 3, 329900},

				{2400, 3, 369000},

				{1416, 2, 232000},

				{3000, 4, 539900},

				{1985, 4, 299900},

				{1534, 3, 314900},

				{1427, 3, 199000},

				{1380, 3, 212000},

				{1494, 3, 242500},

				{1940, 4, 240000},

				{2000, 3, 347000},

				{1890, 3, 330000},

				{4478, 5, 699900},

				{1268, 3, 259900}

				

		};
		for (int i = 0; i < matriz.length; i++) {// i menor que o valor total de linhas
				System.out.print(matriz[i][2] + " ");// serve para espaçar as linhas
				sum=matriz[i][2]+sum;
				System.out.println();
				if(matriz[i][0]<menorCasa) {
				menorCasa=matriz[i][0];
				}
				if(matriz[i][1]>maisQuarto) {
					maisQuarto=matriz[i][1];
				}
			//System.out.println(" ");
		}
		System.out.println("A menor casa é "+menorCasa);
		System.out.println("A casa com mais quartos é "+maisQuarto);
		System.out.println("A media do valor das casas é "+(sum/matriz.length));
		
	}
}


