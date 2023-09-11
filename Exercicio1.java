package aula10;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int aux = 0;
		int aux2;
		int maiorVal = Integer.MIN_VALUE;
		int menorVal = Integer.MAX_VALUE;
		int vetor[] = new int[5];

		// float vetor[]=new float[5];
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Informe um valor");
			vetor[i] = entrada.nextInt();
			aux = vetor[i] + aux;
			//solução mais fácil
			if(vetor[i]<menorVal) {
				menorVal=vetor[i];
			}
			if(vetor[i]>maiorVal) {
				maiorVal=vetor[i];
			}

		}
		System.out.println("Feito");
		for(int i=0; i < vetor.length; i++) {
			aux2=vetor[i];
			if(aux2>maiorVal) {
				maiorVal=aux;
			}
			if(aux2<menorVal) {
				menorVal=aux;
			}
			
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(aux);
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					if (vetor[i] > maiorVal) {
						maiorVal = vetor[i];
					}
				} else {
					if (vetor[i] < menorVal) {
						menorVal = vetor[i];
					}

				}
			}
		}
		aux = aux / vetor.length;
		System.out.println("Maior valor" + maiorVal);
		System.out.println("Menor Valor" + menorVal);
		System.out.println("A média dos elementos é:" + aux);
	}
}
