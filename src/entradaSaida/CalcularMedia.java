package entradaSaida;

import java.util.Locale;
import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		
		// Comando leia
	    Scanner leia = new Scanner(System.in);
	    
	    // Adicione esta linha para aceitar o ponto na digitação
	    leia.useLocale(Locale.US); 
	    
	    // Variaveis
	    float nota1, nota2, nota3, nota4, mediaFinal;
	    
	    // Entrada de Dados
	    System.out.println("Digite o valor da nota1");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite o valor da nota2");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite o valor da nota3");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite o valor da nota4");
		nota4 = leia.nextFloat();
		
		// Processamento
		mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;		
		
		// Adicione Locale.US aqui também para a RESPOSTA sair com ponto
		System.out.printf(Locale.US, "\nMédia final: %.1f", mediaFinal);
		
		leia.close();
		

	}

}
