package lacoCondicional;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
		// Variaveis
		int codigo, quantidade;
		double precoUnitario = 0;
		String nomeProduto = "";

		// Entrada de dados
		System.out.print("Código do Produto (1 a 6): ");
		codigo = leia.nextInt();
		
		System.out.print("Quantidade: ");
		quantidade = leia.nextInt();

		// Switch para definir o produto e o preço unitário
		switch (codigo) {
			case 1:
				nomeProduto = "Cachorro Quente";
				precoUnitario = 10.00;
				break;
				
			case 2:
				nomeProduto = "X-Salada";
				precoUnitario = 15.00;
				break;
				
			case 3:
				nomeProduto = "X-Bacon";
				precoUnitario = 18.00;
				break;
				
			case 4:
				nomeProduto = "Bauru";
				precoUnitario = 12.00;
				break;
				
			case 5:
				nomeProduto = "Refrigerante";
				precoUnitario = 8.00;
				break;
				
			case 6:
				nomeProduto = "Suco de laranja";
				precoUnitario = 13.00;
				break;
				
			default:
				System.out.println("Código inválido!");
				leia.close();
				return; // Encerra o programa se o código não existir
		}

		// Cálculo do valor total
		double valorTotal = quantidade * precoUnitario;

		// Saída de dados 
		System.out.println("\nProduto: " + nomeProduto);
		System.out.printf("Valor total: R$ %.2f\n", valorTotal);

	}

}
