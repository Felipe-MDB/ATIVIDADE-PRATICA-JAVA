package lacoCondicional;

import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);
		
		int A, B, C, soma;

		// Entrada de dados
		System.out.print("Digite o número A: ");
		A = leia.nextInt();
		
		System.out.print("Digite o número B: ");
		B = leia.nextInt();
		
		System.out.print("Digite o número C: ");
		C = leia.nextInt();
		
		// Processamento de dados
		soma = A + B;
		
		System.out.println("\n" + A + " + " + B + " = " + soma);
		
		// Laço Condicional para verificar a relação com C
		if (soma > C) {
			System.out.println("A Soma de A + B é Maior do que C");
		} else if (soma < C) {
			System.out.println("A Soma de A + B é Menor do que C");
		} else {
			System.out.println("A Soma de A + B é Igual a C");
		}
		

	}

}
