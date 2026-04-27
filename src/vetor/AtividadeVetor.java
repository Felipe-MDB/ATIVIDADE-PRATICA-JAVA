package vetor;

import java.util.Scanner;

public class AtividadeVetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
				// Variaveis
				int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6,};
				int numeroProcurado, posicao = -1;
				
					System.out.print("Digite o número que você deseja encontrar: ");
				numeroProcurado = leia.nextInt();
			
				// Laço de repetição / o if deve ficar dentro das chaves do for
				for(int i = 0; i < 10; i++) {
					
					// Laço condicional para verificar se o número atual é o que buscamos
		            if (vetor[i] == numeroProcurado) {		            	
		                posicao = i; // Guarda o índice (posição)	
					
				}
					
			}
		
		            // Saída de dados 
		            if (posicao != -1) {
		                System.out.println("O número " + numeroProcurado + " está localizado na posição: " + posicao);
		            } else {
		                System.out.println("O número " + numeroProcurado + " não foi encontrado!");
		            }	
		        
		        leia.close();    
		            
	}

}
