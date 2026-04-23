package lacoRepeticao;

import java.util.Scanner;

public class AtividadeDoWhile {

	public static void main(String[] args) {
		
        Scanner leia = new Scanner(System.in);
        
        // Variaveis
        int numero, somaPositivos = 0;
        
        do {
        
        System.out.println("\nDigite um número: ");
        numero = leia.nextInt();
        
        // Laço que verifica se o número é positivo
        // O zero não entra na soma pois é neutro
        if (numero > 0) {
        	somaPositivos += numero;  	// Operador atribuição soma
        }
        
        } while (numero != 0); // repete enquanto o número foi diferente
		
        
        // Saida de dados
        System.out.println("\nA soma dos números positivos  é: " + somaPositivos);
        
        leia.close();
	}

}
