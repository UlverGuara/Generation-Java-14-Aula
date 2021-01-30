package listaExerc�cios;

import java.util.Scanner;

/*2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/

//fiz um d20 no lugar do 10...

public class Exerc�cio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int dado[] = new int[20], maiorDado = 0, contador;
		float soma = 0;

		for (contador = 0; contador < dado.length; contador++) {
			System.out.println("Informe o valor do " + (contador + 1) + "� jogada: ");
			dado[contador] = ler.nextInt();

			if (dado[contador] < 1 || dado[contador] > 20) {

				System.out.println("\nValor inv�lido...");
				contador--;
			} else if (dado[contador] == 20) {
				maiorDado++;
			}
		}
		for (contador = 0; contador < 20; contador++) {
			soma = soma + dado[contador];

			if (dado[contador] == 20) {
				System.out.println("Valor da " + (contador + 1) + "� rolagem... " + dado[contador]
						+ "! Acerto Cr�tico!!! ~(�u�~)");
			} else if (dado[contador] == 1) {
				System.out.println(
						"Valor da " + (contador + 1) + "� rolagem... " + dado[contador] + "! Falha Cr�tica!!! (�_�')");
			} else {
				System.out.println("Valor da " + (contador + 1) + "� rolagem... " + dado[contador] + ".");
			}
		}

		System.out.println("\nTotal de ocorrencias de 20 no d20 foi: " + maiorDado + ".");
		System.out.println("\nM�dia de valor das jogadas: " + (soma / 20) + ".");

	}

}
