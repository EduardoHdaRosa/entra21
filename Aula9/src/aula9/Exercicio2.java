package aula9;

import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int numP;
	int grupoId[]=new int[5];
	int sum=0;
	String nomes[]=new String[20];
	String nome;
	/*
	for(int i=0;i<grupoId.length;i++) {
		System.out.println("Informe a idade da pesssoa");
		numP=entrada.nextInt();
		grupoId[i]=numP;
	}
	for(int j=0;j<grupoId.length;j++) {
		sum=grupoId[j]+sum;
	}
	System.out.println("Total da idade das pessoas é "+sum);
	System.out.println("A média das idades é "+(sum/5));
	for(int x:grupoId) {
		System.out.println("Informe a idade da pesssoa");
		numP=entrada.nextInt();
		grupoId[x]=numP;
		
	}
	*/
	for(int l=0;l<nomes.length;l++) {
		System.out.println("insira o nome");
		nomes[l]=entrada.next();
	}
	for(int n=0;n<nomes.length;n++) {
		System.out.println(nomes[n]);
	}
	
	
}


}
/*
 * 
 */
	/*numP
}
/*pessoa esquerda 28
pessoa parede 40
eu 22
pessoa mesa atras meio 16
pessoa mesa parede 17
 * 
 * int idadeGp[]=new int;
 * int sum=0;
 * idadeGp[0]=28
 * idadeGp[1]=40
 * idadeGp[2]=22
 * idadeGp[3]=16
 * idadeGp[4]=17
 *System.out.println("pessoa esquerda 28"+idadeGp[0]);
 *System.out.println("pessoa mesa parede 17"+idadeGp[4]);
 *sum=idadeGp[0]+idadeGp[1]+idadeGp[2]+idadeGp[3]+idadeGp[4]
 *sum=sum/5;
 *sum=idadeGp[0]+sum;
 *sum=idadeGp[1]+sum;
 *sum=idadeGp[2]+sum;
 *sum=idadeGp[3]+sum;
 *sum=idadeGp[4]+sum;
 */
