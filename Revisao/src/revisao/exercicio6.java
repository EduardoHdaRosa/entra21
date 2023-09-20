package revisao;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class exercicio6 {
public static void main(String[] args) {
	DecimalFormat d=new DecimalFormat();
	 d.applyPattern("0.00");
	 Scanner entrada=new Scanner(System.in);
	float vetor[]=new float[12];
	
    
	for (int i = 0; i < vetor.length; i++) {
		System.out.println("Informe um valor decimal");
		vetor[i]=entrada.nextFloat();
		System.out.println(vetor[i]);
		if(vetor[i]%2!=0) {//compara se a o valor da posição do indice é impar
			vetor[i]=vetor[i]+(vetor[i]*0.05f);//aumenta 5% 
			//+(vetor[i]*0.05f) pode ser substituido por *1,05(o valor já multiplicado por ele mesmo com o acrescimo da porcentagem)
		}
		else {
			vetor[i]=vetor[i]+(vetor[i]*0.02f);//aumenta 2%
		}
	}
	for (int i = 0; i < vetor.length; i++) {
		System.out.println("Novo vetor");
		System.out.println(d.format(vetor[i]));
	}
}
}
