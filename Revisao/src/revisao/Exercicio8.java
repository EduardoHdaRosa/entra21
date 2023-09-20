package revisao;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float chico=1.50f;
		float ze=1.10f;
		int count=0;
		while(chico>ze) {
			chico=chico+0.02f;
			ze=ze+0.03f;
			count++;
		}
		System.out.println("Levara um total de "+count);

	}

}
