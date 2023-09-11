package prova;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Scanner;

public class Eduardo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escreva um programa onde o usuário leia altura de 10 pessoas diferentes e depois calcule a 
média.*/
		Scanner entrada = new Scanner(System.in);
		DecimalFormat d= new DecimalFormat("0.00");
		float alt;
		float aux=0;
		for (int i=0;i<10;i++) {
			System.out.println("informe a altura");
			alt=entrada.nextFloat();
			aux=alt+aux;
		}
		System.out.println("A media das alturas foi "+(aux/10));
		
	}

}
