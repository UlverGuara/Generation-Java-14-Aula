package listaExerc�cios;

import java.util.Scanner;

/*1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.*/

public class Exerc�cio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int contador;
		float[] vetor = new float[5];
		float numero = 0;

		for (contador = 0; contador < vetor.length; contador++) {
			System.out.println("Digite o valor da " + (contador + 1) + "� pontua��o");
			vetor[contador] = ler.nextFloat();

			if (vetor[contador] > numero) {

				numero = vetor[contador];

			}
		}

		System.out.println("\nA maior pontua��o �: " + numero + ".");

	}

}
