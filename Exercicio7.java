package aula10;

import java.util.Scanner;

public class Exercicio7 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int aux = 0;
	int aux2;
	int maiorVal = Integer.MIN_VALUE;
	int menorVal = Integer.MAX_VALUE;
	int vetor[] = {7,3,5,4,3,5,4,3,2,6};
	int vetor2[] = {5,1,9,1,0,4,1,3,4,8};
	int vetor3[] = new int[vetor.length];

	// float vetor[]=new float[5];
	for (int i = 0; i < vetor.length; i++) {
		vetor3[i]=vetor[i]+vetor2[i];
		System.out.println(vetor3[i]);
}
}
}
