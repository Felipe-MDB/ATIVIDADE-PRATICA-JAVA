package lacoCondicional;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);

		// Variaveis
		String nome;
		int codigoCargo;
		float salario, novoSalario, percentual = 0.0f;
		String nomeCargo = "";

		// Entrada de dados
		System.out.print("Nome do colaborador: ");
		nome = leia.nextLine();
		
		System.out.print("Cargo (1 a 6): ");
		codigoCargo = leia.nextInt();
		
		System.out.print("Salário: R$ ");
		salario = leia.nextFloat();

		// Switch para definir o cargo e o percentual de reajuste
		switch (codigoCargo) {
			case 1:
				nomeCargo = "Gerente";
				percentual = 0.10f; // 10%
				break;
				
			case 2:
				nomeCargo = "Vendedor";
				percentual = 0.07f; // 7%
				break;
				
			case 3:
				nomeCargo = "Supervisor";
				percentual = 0.09f; // 9%
				break;
				
			case 4:
				nomeCargo = "Motorista";
				percentual = 0.06f; // 6%
				break;
				
			case 5:
				nomeCargo = "Estoquista";
				percentual = 0.05f; // 5%
				break;
				
			case 6:
				nomeCargo = "Técnico de TI";
				percentual = 0.08f; // 8%
				break;
				
			default:
				System.out.println("Código de cargo inválido!");
				leia.close();
				return;
		}

		// Cálculo do novo salário
		novoSalario = salario + (percentual * salario);

		// Saída de dados
		System.out.println("\nNome do colaborador: " + nome);
		System.out.println("Cargo: " + nomeCargo);
		System.out.printf("Salário: R$ %.2f\n", novoSalario);
		
	}

}
