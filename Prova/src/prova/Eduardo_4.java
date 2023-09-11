package prova;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Eduardo_4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat d= new DecimalFormat("0.00");
		// TODO Auto-generated method stub
		/*Um aluno se vê com necessidade de ajuda na aula e logo tem a ideia de um algoritmo, 
		pensando nisso, ele descreve como deve funcionar: o usuário seleciona a opção onde 
		1) Solicita 3 notas e calcula a média, 
		2) Retorna os dados do aluno em questão (informe seu nome e e-mail), 
		3) Solicita 5 valores, verifica e retorna qual é o maior e o menor. 
		 A opção 0 encerra o programa e qualquer outra é declarada como inválida, além disso, informe 
		quantas vezes o usuário escolheu opções válidas antes de encerrar o programa e quantas inválidas. 
		*/
		//variáveis aux para ser utilizada em qualquer opção que o usúario escolher
		float auxValor=0;
		float maiorVal = Integer.MIN_VALUE;
		float menorVal=	Integer.MAX_VALUE;
		float auxNota=0;
		String nome;
		String email;
		int opc=1;
		while(opc !=0) {
			System.out.println("Informe a opção desejada \n 1-calcula média, 2-retorna os dados do aluno, 3-defini o maior e menor valor");
			opc=entrada.nextInt();
			if(opc==1) {
				for(int i=0;i<3;i++) {
					System.out.println("Informe a nota do aluno");
					auxNota=entrada.nextFloat()+auxNota;
				}
				System.out.println("A média do aluno é "+d.format(auxNota/3));
			}
			else if(opc==2) {
				System.out.println("informe seu nome por favor");
				nome=entrada.next();
				System.out.println("informe seu email por favor");
				email=entrada.next();
				System.out.println("Seu nome é "+nome);
				System.out.println("Seu email é "+email);
			}
			else if(opc==3) {
				for(int i=0;i<5;i++) {
					System.out.println("Informe um valor");
					auxValor=entrada.nextFloat();
					if(auxValor>maiorVal) {
						maiorVal=auxValor;
					}
					if(menorVal>auxValor){
						menorVal=auxValor;
						
					}
				}
				System.out.println("Maior valor "+maiorVal+ " e o menor valor "+menorVal);
			}
		}

	}

}
