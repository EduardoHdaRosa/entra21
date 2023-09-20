package aula11;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
	    float[][] matriz = new float[3][2];
	    float aux=0;
	    
	    for (int i = 0; i < matriz.length ; i++) {//O primeiro for com Index I percorre as linhas
	        for (int j = 0; j < matriz[i].length ; j++) {//aqui nesse for que percorre as colunas J são inseridos ou excluidos novos valores,nestes serão feitos alterações
	        	System.out.print("Informe o número da sorte do colega e a altura ");
	            matriz[i][j]=entrada.nextFloat();
	            
	        }
	        
	    }
	        for (int i = 0; i < matriz.length ; i++) {
	            for (int j = 0; j < matriz[i].length ; j++) {
	            	System.out.print(matriz[i][j] + " ");//serve para espaçar as linhas
	            }
	            System.out.println();
	        }
	        System.out.println("A média das alturas é "+(aux/matriz.length));
	}

}
//22
//159
