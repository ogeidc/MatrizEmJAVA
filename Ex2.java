package br.com.generation.listamatriz;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int matriz [][] = new int [3][3];
		int soma =0, somaDiagonal=0;
		Scanner in = new Scanner (System.in);
		
		for (int i=0; i < matriz.length; i++) {
			for (int j=0; j< matriz.length; j++) {
				System.out.println("Digite um número: ");
				matriz[i][j] = in.nextInt();
				soma = soma + matriz[i][j];
				if (i == j) {
					somaDiagonal += matriz [i][j];
				}
			}
		}
		System.out.println("A soma total é "+soma);
		System.out.println("A soma diagonal é "+somaDiagonal);
	}

}
