package lacoRepeticao;

import java.util.Scanner;

public class AtividadeFor {

	public static void main(String[] args) {		
		
        Scanner leia = new Scanner(System.in);
        
        // Variaveis
        int numero, totalPares = 0, totalImpares = 0;
        
        // Laço de repetição for, vai repetir de 1 a 10
        for (int n = 1; n <= 10; n++) {
        
        System.out.println("\nDigite o " + n + "º número: ");
        numero = leia.nextInt();
        
        // Laços condicional para verificar se o número é par ou impar
        if (numero % 2 == 0) {
        	totalPares++;
           } else { 
        	   totalImpares++;
           }
        }
        
        //Saida de dados
        System.out.println("\nTotal de números pares: " + totalPares); 
        System.out.println("\nTotal de números ímpares: " + totalImpares); 
        
        leia.close();
	}
}
