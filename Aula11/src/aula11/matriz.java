package aula11;

import java.util.Scanner;

public class matriz {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
    int[][] matriz = new int[4][4];
    for (int i = 0; i < matriz.length ; i++) {//O primeiro for com Index I percorre as linhas
        for (int j = 0; j < matriz[i].length ; j++) {//aqui nesse for que percorre as colunas J são inseridos ou excluidos novos valores,nestes serão feitos alterações
        	System.out.print("Informe o valor da linha "+i+" coluna "+j);
            matriz[i][j]=entrada.nextInt();
        }
    }
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
            	if(matriz[i][j]>5) {
                System.out.print(matriz[i][j] + " ");//serve para espaçar as linhas
            	}
            	else {
            		 System.out.print("*"+ " ");//serve para espaçar as linhas
            	}
            }
            System.out.println();
        }
}  
}

