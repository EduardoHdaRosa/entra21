package aula10;

import java.util.Scanner;

public class Exercicio6 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	float aux = 0;
	float vetor[] = new float[12];

	// float vetor[]=new float[5];
	for (int i = 0; i < vetor.length; i++) {
		System.out.println("Informe um valor");
		vetor[i] = entrada.nextInt();
		aux = vetor[i] + aux;
	}
	aux=aux/vetor.length;
	for (int i = 0; i < vetor.length; i++) {
		if(vetor[i]>aux) {
			System.out.println("este valor é maior que a média"+vetor[i]);
		}
	}
}
}
