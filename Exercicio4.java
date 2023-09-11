package aula10;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int aux = 0;
	int aux2;
	int maiorVal = Integer.MIN_VALUE;
	int menorVal = Integer.MAX_VALUE;
	int vetor[] = {5,4,3,2,1};
	System.out.println("insira uma indice para ser adicionado o valor zero");
	aux=entrada.nextInt();
	for (int i=0;i<vetor.length;i++) {
		vetor[aux]=0;
		
	}
	System.out.println("a indice que o úsuario escolheu "+aux);
	System.out.println(vetor[aux]);
}
}
