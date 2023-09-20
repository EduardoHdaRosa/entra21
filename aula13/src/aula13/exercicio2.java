package aula13;

import java.util.Random;
import java.util.Scanner;

public class exercicio2 {
public static void main(String[] args) {
	String[][] matriz = new String[3][3];
	Random generator = new Random();//metodo para gerar valores aleatorios para preencher a matriz
	Scanner entrada = new Scanner(System.in);
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[i].length; j++) {
			System.out.println("Informe uma letra");
			matriz[i][j]=entrada.next();
			//matriz[i][j]=generator.nextInt(10);//insere numero aleatorios de 0 a 10
		}
	}
    for (int i = 0; i < matriz.length ; i++) {//i menor que o valor total de linhas
        for (int j = 0; j < matriz[i].length ; j++) {//j menor que o valor total de colunas
        	System.out.print(matriz[i][j] + " ");//espaçar as linhas
        }
        System.out.println();
    }
}
}
