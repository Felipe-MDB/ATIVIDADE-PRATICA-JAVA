package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeArrayList {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);
	        
	        // Criamos o ArrayList de Inteiros (Wrapper Integer)
	        ArrayList<Integer> numeros = new ArrayList<Integer>();
	        
	        // Adicionando 10 números na lista (conforme o exemplo)
	        numeros.add(2);
	        numeros.add(5);
	        numeros.add(1);
	        numeros.add(3);
	        numeros.add(4);
	        numeros.add(9);
	        numeros.add(7);
	        numeros.add(8);
	        numeros.add(10);
	        numeros.add(6);
	        
	        // Pede para o usuário digitar o número
	        System.out.println("Digite o número que você deseja encontrar: ");
	        int numeroProcurado = leia.nextInt();
	        
	        // Variável para nos avisar se o número foi achado ou não
	        int posicao = -1; 
	        
	        // Laço de repetição para percorrer a lista
	        // .size() retorna o tamanho da lista (neste caso, 10)
	        for (int i = 0; i < numeros.size(); i++) {
	            
	            // Se o número na posição "i" for igual ao que o usuário digitou
	            if (numeros.get(i) == numeroProcurado) {
	                posicao = i; // Guardamos a posição (índice)
	            }
	        }
	        
	        // Laço condicional para exibir o resultado final
	        if (posicao >= 0) {
	            System.out.println("O número " + numeroProcurado + " está localizado na posição: " + posicao);
	        } else {
	            System.out.println("O número " + numeroProcurado + " não foi encontrado!");
	        }

	        leia.close(); 

	}

}
