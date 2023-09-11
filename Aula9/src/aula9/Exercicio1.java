package aula9;

import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int idade;
	int idades []=new int[5];
	
	/*idade[0]=18
	 * idade[1]=20
	 * idade[2]=24
	 * idade[3]=22
	 */
	for(int i=0;i<5;i++) {
		System.out.println("Informe a idade");
		idade=entrada.nextInt();
		idades[i]=idade;
	}
	
	System.out.println(idades[0]);
}
}
