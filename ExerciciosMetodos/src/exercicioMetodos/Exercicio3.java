package exercicioMetodos;

import java.util.Scanner;

public class Exercicio3 {
	/*
	 * Faça um método para cada um dos seus seus colegas O método deve printar: O
	 * nome dele(a) é [nome] Ele(a) tem [idade] anos Ele(a) é estudante do Entra 21
	 * (Em prints separados)
	 * 
	 * Os dados devem ser passados como parametros, e o metodo pode ser chamado mais
	 * de uma vez
	 */
	public static void printarDados(String nome, int idade) {
		System.out.println("Nome :" + nome);
		System.out.println("Idade :" + idade);
		System.out.println("Ele é aluno do Entra 21");
	}

	public static void main(String[] args) {
		boolean verif = true;
		String nome;
		int idade;
		int aux;
		Scanner entrada = new Scanner(System.in);
		while (verif) {
			System.out.println("informe o nome do Aluno");
			nome = entrada.next();
			System.out.println("informe a idade do Aluno");
			idade = entrada.nextInt();
			printarDados(nome, idade);
			System.out.println("Deseja inserir outro aluno 1-Sim ou 0-não");
			aux = entrada.nextInt();
		}
	}
}
