package revisao;

import java.util.Iterator;
import java.util.Random;

public class exercicio4 {
	public static void main(String[] args) {
		// crie um array de 5 elementos e descubra o maior,menor e a média dos elementos
		float menorVal = Integer.MAX_VALUE;//maior valor de inteiro para inicializar um valor para comparação
		float maiorVal = Integer.MIN_VALUE;//menor valor de inteiro para inicializar um valor para comparação
		float sum = 0;//somador
		int vetor[] = new int[5];
		Random generator = new Random();
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = generator.nextInt(100);//Random para gerar um número aleatorio
			sum=vetor[i]+sum;
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]+" ");
			if (vetor[i] < menorVal) {
				menorVal = vetor[i];
			}
			if (vetor[i] > maiorVal) {
				maiorVal = vetor[i];
			}
		}
		System.out.println("O menor valor do vetor: "+menorVal);
		System.out.println("O maior valor do vetor: "+maiorVal);
		System.out.println("a media dos valores do vetor: "+(sum/vetor.length));

	}
}
