package listaExercícios;

import java.util.Scanner;

/*2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

//fiz um d20 no lugar do 10...

public class Exercício2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int dado[] = new int[20], maiorDado = 0, contador;
		float soma = 0;

		for (contador = 0; contador < dado.length; contador++) {
			System.out.println("Informe o valor do " + (contador + 1) + "ª jogada: ");
			dado[contador] = ler.nextInt();

			if (dado[contador] < 1 || dado[contador] > 20) {

				System.out.println("\nValor inválido...");
				contador--;
			} else if (dado[contador] == 20) {
				maiorDado++;
			}
		}
		for (contador = 0; contador < 20; contador++) {
			soma = soma + dado[contador];

			if (dado[contador] == 20) {
				System.out.println("Valor da " + (contador + 1) + "ª rolagem... " + dado[contador]
						+ "! Acerto Crítico!!! ~(°u°~)");
			} else if (dado[contador] == 1) {
				System.out.println(
						"Valor da " + (contador + 1) + "ª rolagem... " + dado[contador] + "! Falha Crítica!!! (°_°')");
			} else {
				System.out.println("Valor da " + (contador + 1) + "ª rolagem... " + dado[contador] + ".");
			}
		}

		System.out.println("\nTotal de ocorrencias de 20 no d20 foi: " + maiorDado + ".");
		System.out.println("\nMédia de valor das jogadas: " + (soma / 20) + ".");

	}

}
