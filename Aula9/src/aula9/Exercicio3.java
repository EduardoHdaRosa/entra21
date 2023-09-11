package aula9;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	float aux=0;
	float notas[]=new float[3];
	for (int i=0;i<notas.length;i++) {
		System.out.println("Insira a nota do aluno");
		notas[i]=entrada.nextFloat();
		aux=notas[i]+aux;
		
	}
	for(int i=0;i<notas.length;i++) {
		System.out.println("Nota "+(i+1)+"="+notas[i]);
	}
	System.out.println("A média do aluno: "+(aux/3));
	
	
}
}
