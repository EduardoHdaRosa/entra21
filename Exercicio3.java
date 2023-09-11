package aula10;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String index;
		boolean verif=true;
		String vetor[] = new String[5];
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Informe um numero por extenso");
			vetor[i] = entrada.next();
		}
		System.out.println("Informe um numero por extenso para verificar se ele está no vetor");
		index = entrada.next();
		for (int j = 0; j < vetor.length; j++) {
			System.out.println(j);
			if (index.equals(vetor[j])) {
				System.out.println("Index " + j);
				verif=true;
			}
		}
		if(verif ==false) {
		System.out.println("Este número não está dentro do vetor");
		}

	}
}