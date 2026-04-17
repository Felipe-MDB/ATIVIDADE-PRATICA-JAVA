package entradaSaida;

import java.util.Locale;
import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		
		        // Comando leia
				Scanner leia = new Scanner(System.in);
				
				// Adicione esta linha para aceitar o ponto na digitação
			    leia.useLocale(Locale.US); 
				
				// Variaveis
				float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
				
				// Entrada de Dados
				System.out.println("Digite o valor do salario bruto");
				salarioBruto = leia.nextFloat();
				
				System.out.println("Digite o valor do adicional noturno");
				adicionalNoturno = leia.nextFloat();
				
				System.out.println("Digite o valor da horas extras");
				horasExtras = leia.nextFloat();
				
				System.out.println("Digite o valor do descontos");
				descontos = leia.nextFloat();
				
				// processamento
				salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
				
				// Saída de Dados
				System.out.printf(Locale.US, "\nSalário Liquido: %.2f\n", salarioLiquido);
				
				leia.close();

	}

}
