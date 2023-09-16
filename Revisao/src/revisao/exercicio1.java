package revisao;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// Faça um algoritmo para classificar o Imc e dizer o grau d eobesidade do indivíduo, de acordo com a seguinte tabela
		Scanner entrada = new Scanner(System.in);
		float massa;
		float altura;
		float imc;
		System.out.println("Informe a sua massa corporal: ");
		massa=entrada.nextFloat();
		System.out.println("Informe a sua altura: ");
		altura=entrada.nextFloat();
		imc=massa/(altura*altura);
		System.out.println("IMC "+imc);
		if(imc<18.5) {
			System.out.println("magrelo");
		}
		else if(imc>18.5 && imc<25) {
			System.out.println("Saudável");
		}
		else if(imc>=25 && imc<30) {
			System.out.println("Sobrepeso");
		}
		else if(imc>=30 && imc<35) {
			System.out.println("Obesidade Grau I");
		}
		else if(imc>=35 && imc<40) {
			System.out.println("Obesidade Grau II");
		}
		else {
			System.out.println("Obesidade grau III");
		}
			
		

	}

}
