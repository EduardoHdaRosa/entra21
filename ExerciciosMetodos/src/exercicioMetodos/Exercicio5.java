package exercicioMetodos;

import java.util.Scanner;

/*
 * Faça um programa que calcule o perímetro e a área de um retângulo
(Passe a altura e a largura como parâmetros da função)
 */
public class Exercicio5 {
	public static void calcularAreaRetangulo(float a, float l) {
		System.out.println("A área do Retangulo é" + (a * l));
	}
public static void main(String[] args) {
	Scanner entrada= new Scanner(System.in);
	float altura;
	float largura;
	System.out.println("Informe a altura do retângulo");
	altura=entrada.nextFloat();
	System.out.println("Informe a largura do retângulo");
	largura=entrada.nextFloat();
	calcularAreaRetangulo(altura,largura);
}
}
