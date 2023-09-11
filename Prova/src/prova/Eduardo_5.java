package prova;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Eduardo_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Uma grande loja de departamentos paga aos vendedores um salário base com base nas vendas 
		efetuadas durante o mês, que é igual a 30% de comissão sobre o preço de cada produto vendido. Cada 
		vendedor, em um determinado mês, vende n produtos, onde para cada produto tem-se o preço unitário 
		e a quantidade vendida. 
		 O departamento de pessoal deseja obter um relatório com: nome, total de vendas (em R$ e 
		somente duas casas decimais após a vírgula) e salário de cada vendedor. Descreva um algoritmo que 
		gere o relatório desejado. 
		 Para prosseguir com a entrada de dados o algoritmo deve apresentar a seguinte mensagem: 
		“deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)”. */
		Scanner entrada = new Scanner(System.in);
		DecimalFormat d = new DecimalFormat("0.00");
		String vendedor;
		float toVendas;
		char opc='s';
		while(opc=='s') {
			System.out.println("informe o nome do vendedor: ");
			vendedor=entrada.nextLine();
			System.out.println("informe o total de vendas do vendedor: ");
			toVendas=entrada.nextFloat();
			System.out.println("O vendedor: "+vendedor+" vendeu um total R$"+(d.format(toVendas)+" e o seu sálario é R$"+d.format((toVendas*0.30))));
			System.out.println("Deseja inserir os dados de mais um vendedor? S para sim e N para não");
			opc = entrada.next().charAt(0);
		}
		System.out.println("Encerrado");
	}

}
