package collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class AtividadePilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int opcao = -1;

		System.out.println("===== SISTEMA DE GERENCIAMENTO DE PILHA =====");

		while (opcao != 0) {
			System.out.println("\n*************************************************");
			System.out.println("1 - Adicionar Livro na Pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da Pilha");
			System.out.println("0 - Sair");
			System.out.println("*************************************************");
			System.out.print("Entre com a opção desejada: ");

			opcao = leia.nextInt();
			leia.nextLine();

			// [1] Adicionar Livro
			while (opcao == 1) {
				System.out.print("Digite o nome: ");
				String nome = leia.nextLine();
				pilha.push(nome);
				System.out.println("\nPilha: ");
				for (String livro : pilha) {
					System.out.println(livro);
				}
				System.out.println("\nLivro adicionado!");
				opcao = -1;
			}

			// [2] Listar Livros
			while (opcao == 2) {
				// Caso esteja vazia
				while (pilha.isEmpty() && opcao == 2) {
					System.out.println("\nA Pilha está vazia!");
					opcao = -1;
				}
				// Caso tenha livros
				while (!pilha.isEmpty() && opcao == 2) {
					System.out.println("\nLista de Livros na Pilha:");
					Iterator<String> it = pilha.iterator();
					while (it.hasNext()) {
						System.out.println(it.next());
					}
					opcao = -1;
				}
			}

			// [3] Retirar Livro
			while (opcao == 3) {
				// Caso esteja vazia
				while (pilha.isEmpty() && opcao == 3) {
					System.out.println("\nA Pilha está vazia!");
					opcao = -1;
				}
				// Caso tenha livros
				while (!pilha.isEmpty() && opcao == 3) {
					pilha.pop();
					System.out.println("\nPilha: ");
					for (String livro : pilha) {
						System.out.println(livro);
					}
					System.out.println("\nUm Livro foi retirado da pilha!");
					opcao = -1;
				}
			}
		}

		System.out.println("\nPrograma Finalizado!");
		leia.close();

	}

}
