package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeFila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();

		 Scanner leia = new Scanner(System.in);
	        int opcao = -1; // Iniciamos com um valor que não seja 0

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

	                if (opcao == 1) {
	                    System.out.print("Digite o nome: ");
	                    String nome = leia.nextLine();
	                    fila.add(nome);
	                    System.out.println("\nFila: ");
	                    for (String c : fila) System.out.println(c);
	                    System.out.println("\nCliente Adicionado!");

	                } else if (opcao == 2) {
	                    if (fila.isEmpty()) {
	                        System.out.println("\nA Fila está vazia!");
	                    } else {
	                        System.out.println("\nLista de Clientes na Fila: ");
	                        for (String cliente : fila) {
	                            System.out.println(cliente);
	                        }
	                    }

	                } else if (opcao == 3) {
	                    if (fila.isEmpty()) {
	                        System.out.println("\nA Fila está vazia!");
	                    } else {
	                        fila.poll(); 
	                        System.out.println("\nFila: ");
	                        for (String c : fila) System.out.println(c);
	                        System.out.println("\nO Cliente foi Chamado!");
	                    }

	                } else if (opcao == 0) {
	                    System.out.println("\nPrograma Finalizado!");

	                } else {
	                    System.out.println("Opção inválida!");
	                }
	            }

	            leia.close();
	        }
	}

