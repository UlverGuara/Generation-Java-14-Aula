package listaExercícios;

import java.util.Scanner;

/*4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/

public class Exercício4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int matriz[][] = new int[3][3], linha, coluna, soma = 0, somaDiagonal = 0;

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite o valor da Matriz posição linha [" + (linha + 1) + "] e posição coluna ["
						+ (coluna + 1) + "].");
				matriz[linha][coluna] = ler.nextInt();

				soma = soma + matriz[linha][coluna];

				if (linha == coluna) {
					somaDiagonal = somaDiagonal + matriz[linha][coluna];
				}
			}

		}
		System.out.println("\nA soma de todas as linhas e colunas é : " + soma + ".");
		System.out.println("\nValor Total da diagonal: " + somaDiagonal + ".");
	}

}
