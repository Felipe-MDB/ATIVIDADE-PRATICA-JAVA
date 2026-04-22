package lacoCondicional;

import java.util.Scanner;

public class ExemploIfElse {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
		// Variaveis
		String nome;
		int idade;
		boolean primeiraDoacao;

		// Entrada de dados
		System.out.print("Digite o Nome do doador: ");
		nome = leia.nextLine();
		
		System.out.print("Digite a Idade do doador: ");
		idade = leia.nextInt();
		
		System.out.print("Primeira doação de sangue? (true/false): ");
		primeiraDoacao = leia.nextBoolean();

		// Processamento com as regras de idade e primeira doação
		boolean apto = false;

		if (idade >= 18 && idade <= 69) {
			if (idade >= 60 && idade <= 69) {
				// Entre 60 e 69, só pode se NÃO for a primeira
				if (primeiraDoacao) {
					apto = true;
				}
			} else {
				// Entre 18 e 59 anos está sempre apto
				apto = true;
			}
		}

		// Saída de dados
		if (apto) {
			System.out.println("\n" + nome + " está apto(a) para doar sangue!");
		} else {
			System.out.println("\n" + nome + " não está apto(a) para doar sangue!");
		}
	}

}
