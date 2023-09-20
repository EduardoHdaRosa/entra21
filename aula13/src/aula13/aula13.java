package aula13;

import java.util.Random;
import java.util.Scanner;

public class aula13 {
public static void main(String[] args) {
	/*Crie um programa onde o usuário define quantas linhas e colunas deve ter uma matriz, e
	posteriormente imprima o total de elementos(posições)que está matriz tem*/
	
		
	Scanner entrada = new Scanner(System.in);
	int linhas=0;
	int colunas=0;
	int matriz[][]=new int[linhas][colunas];
	System.out.println("insira quantas linhas sua matriz vai ter");
	linhas=entrada.nextInt();
	System.out.println("insira quantas colunas sua matriz vai ter");
	colunas=entrada.nextInt();
	System.out.println("o total de posições que a matriz tem é "+(linhas*colunas));
}
}
