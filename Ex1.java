package br.com.generation.listamatriz;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int vetor [] = new int [5], maior=0;
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i <5; i++) {
			System.out.println("Digite um número: ");
			
			vetor [i] = in.nextInt();
			if (vetor [i]> maior) {
				maior = vetor[i];
			}
		}
System.out.println("O maior valor foi: "+maior);
	}

}
