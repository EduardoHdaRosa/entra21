package prova;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Eduardo_1 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	DecimalFormat d= new DecimalFormat("0.00");
	/*Escreva um programa onde o usuário informa um valor e a opção desejada do que deve ser 
	feito com o valor, sendo as opções 1-converter de dólar para real e c, 
	qualquer outra opção é considerada entrada inválida. 
	Dólar aproximado
	*/
	float valor;
	int opc;
	float dolar=4.98f;
	System.out.println("Informe um valor para ser convertido ");
	valor=entrada.nextFloat();
	System.out.println("Informe 1-converter de Dólar para Real ou 2-converter de Real para Dólar ");
	opc=entrada.nextInt();
	switch(opc) {
	case 1:
		System.out.println("O valor "+valor+" convertido para real "+d.format(valor*dolar));
		break;
	
	case 2:
		System.out.println("O valor "+valor+" convertido para dolar "+d.format(valor/dolar));
		break;
	default:
		System.out.println("Entrada inválida");
   		break;
		
	}

}
}
