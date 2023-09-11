package aula10;

import java.util.Scanner;

public class Exercicio8 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	float aux = 0;
	float vetor[] = new float[5];
	for (int i = 0; i < vetor.length; i++) {
		System.out.println("informe um valor");
		vetor[i]=entrada.nextFloat();
		
	}
	for (int i = 0; i < vetor.length; i++) {
		System.out.println(vetor[i]);
	}
	
}
}
