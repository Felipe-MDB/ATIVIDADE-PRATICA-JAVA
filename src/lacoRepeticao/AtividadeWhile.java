package lacoRepeticao;

import java.util.Scanner;

public class AtividadeWhile {

	public static void main(String[] args) {
		
        Scanner leia = new Scanner(System.in);
        
        // Variaveis
        int idade, menores21 = 0, maiores50 = 0;
        
        System.out.println("Digite uma idade: ");
        idade = leia.nextInt();
        
        // Laço de repetição while executa até idade for positiva
        while (idade >= 0) {
        		
     
        
        // Laços condicional para verificar menores e maiores
        if (idade <21) {
        	
        	menores21++;
           } else if(idade > 50){ 
        	   maiores50++;
           }
        
        // Pede a proxima idade
        System.out.println("Digite uma idade: ");
        idade = leia.nextInt();
        
        }
        
        //Saida de dados
        System.out.println("\nTotal de pessoas menores de 21 anos: " + menores21); 
        System.out.println("\nTotal de pessoas maiores de 50 anos: " + maiores50); 
        
        leia.close();
		
	}

}
