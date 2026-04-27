package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class AtividadeSet {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// Collection Set de Inteiros
		// Usei o HashSet porque ele é a implementação mais comum de Set
		Set<Integer> setNumeros = new HashSet<Integer>();
		
		// Laço de repetição (for) para pedir 10 números
		System.out.println("Digite 10 números inteiros (não repetidos):");
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			
			int numero = leia.nextInt();
			
			// Adiciona o número digitado na Collection Set
			setNumeros.add(numero);
		}
		
		// Agora vamos listar os dados usando a Classe Iterator, como pedido
		System.out.println("\nListar dados do Set:");
		
		// Objeto "it" da Classe Iterator para "percorrer" o Set
		Iterator<Integer> it = setNumeros.iterator();
		
		// O laço while verifica se ainda existe um "próximo" elemento no Set
		while (it.hasNext()) {
			// Exibe o próximo elemento da lista
			System.out.println(it.next());
		}
		
		leia.close();

	}

}
