package aula10;

import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int index;
	String vetor[] = {"zero","um","dois","três","quatro","cinco","seis","sete","oito","nove"};
	System.out.println("Digide uma index de 1 a 10, para retornar o valor da indice desejada");
	index=entrada.nextInt();
	System.out.println(vetor[index]);
}
}
