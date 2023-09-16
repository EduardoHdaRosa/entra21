package revisao;

import java.text.DecimalFormat;
import java.util.Random;

public class exercicio6 {
public static void main(String[] args) {
	DecimalFormat d=new DecimalFormat();
	 d.applyPattern("0.00");
	Random generator = new Random();
	float vetor[]=new float[12];
	float aum=0.03f;
	
    
	for (int i = 0; i < vetor.length; i++) {
		vetor[i]=generator.nextInt(12)+aum;
		System.out.println(vetor[i]);
		aum=0.01f+aum;
		if(vetor[i]%2!=0) {
			vetor[i]=vetor[i]+(vetor[i]*0.05f);
		}
		else {
			vetor[i]=vetor[i]+(vetor[i]*0.02f);
		}
	}
	for (int i = 0; i < vetor.length; i++) {
		System.out.println("Novo vetor");
		System.out.println(d.format(vetor[i]));
	}
}
}
