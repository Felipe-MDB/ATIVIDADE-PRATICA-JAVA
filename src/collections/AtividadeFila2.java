package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeFila2 {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		
		Scanner leia = new Scanner(System.in);
		int opcao = -1;

		System.out.println("========== SISTEMA DE GERENCIAMENTO DE FILA ==========");

		while (opcao != 0) {
			System.out.println("\n*************************************************");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("*************************************************");
			System.out.print("Entre com a opção desejada: ");

			opcao = leia.nextInt();
			leia.nextLine(); 

			// [1] Adicionar Cliente
			while (opcao == 1) {
				System.out.print("Digite o nome: ");
				String nome = leia.nextLine();
				fila.add(nome);
				System.out.println("\nFila atual: " + fila);
				System.out.println("Cliente Adicionado!");
				opcao = -1; 
			}

			// [2] Listar Clientes (Usando Iterator conforme o exemplo)
			while (opcao == 2) {
				System.out.println("\nLista de Clientes na Fila (iterando):");
				Iterator<String> it = fila.iterator();
				while (it.hasNext()) {
				System.out.println("→ Cliente: " + it.next());
				}
				opcao = -1;
			}

			// [3] Retirar Cliente
			while (opcao == 3) {
				System.out.println("\nChamando e removendo o próximo cliente : " + fila.poll());
				System.out.println("Fila atual: " + fila);
				System.out.println("O Cliente foi Chamado!");
				System.out.println("\nA Fila está vazia!");
				opcao = -1;
			}
		}
			// Saida de dados
				System.out.println("\n A fila está vazia! ");
				System.out.println("\n==================================================");
				System.out.println("Sistema finalizado.");
		
		leia.close();
		
	}

}
