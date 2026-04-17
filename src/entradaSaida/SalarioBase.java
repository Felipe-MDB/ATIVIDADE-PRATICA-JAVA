package entradaSaida;

import java.util.Locale;
import java.util.Scanner;

public class SalarioBase {

	public static void main(String[] args) {
		
		// Comando leia
		Scanner leia = new Scanner(System.in);
		
		// Adicione esta linha para aceitar o ponto na digitação
	    leia.useLocale(Locale.US); 
		
		// Variaveis
		float salario, abono, novoSalario;
		
		// Entrada de Dados
		System.out.println("Digite o valor do salario");
		salario = leia.nextFloat();
		
		System.out.println("Digite o valor do abono");
		abono = leia.nextFloat();
		
		// Processamento
		novoSalario = salario + abono;
		
		// Saida de Dados
		System.out.println("\nRESULTADO");
		System.out.printf("Salario Base: %.2f\n", salario);
		System.out.printf("Abono Recebido: %.2f\n", abono);
		System.out.printf("Novo Salario Atualizado: %.2f\n", novoSalario);
		
		// Adicione Locale.US aqui tambem para RESULTADO sair com ponto
		System.out.printf(Locale.US, "\nFIM");
				
		leia.close();
				
	}

}
