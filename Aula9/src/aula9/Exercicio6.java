package aula9;

import java.util.Scanner;

public class Exercicio6 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int vetor[]= new int[5];
	String jogos[]=new String[5];
	for (int i=0;i<vetor.length;i++) {
		System.out.println("Insira um valor inteiro");
		vetor[i]=entrada.nextInt();
		
	}
	for(int i=0;i<vetor.length;i++) {
		System.out.println(vetor[i]);
	}
	for (int i=0;i<jogos.length;i++) {
		System.out.println("Insira um jogo ");
		jogos[i]=entrada.next();
		
	}
	for(int i=0;i<jogos.length;i++) {
		System.out.println(jogos[i]);
	}
	
}
}
