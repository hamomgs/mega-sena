package br.com.vainaweb.backendt1.megasena;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;

public class MegaSena {

	public static void main(String[] args) {
		int quantidadeDeNumeros = 7;
		int limite = 101;
		int[] numerosSorteados = sortearNumeros(quantidadeDeNumeros, limite);
		int[] numerosEscolhidos = obterNumerosEscolhidos(quantidadeDeNumeros, limite);
		int acertos = contarAcertos(numerosSorteados, numerosEscolhidos);
		int premio = calcularPremio(acertos);

		System.out.println("\n\n\n==========Resultado==========\n");
		System.out.println("Números da sorte:       " + Arrays.toString(numerosSorteados));
		System.out.println("Números escolhidos:  " + Arrays.toString(numerosEscolhidos));
		System.out.println("\nVocê acertou " + acertos + " números.");
		System.out.println("Seu prêmio: R$" + premio);
	}

	static int[] sortearNumeros(int quantidadeDeNumeros, int limite) {
		Random random = new Random();
		int[] numerosSorteados = new int[quantidadeDeNumeros];

		for (int i = 0; i < quantidadeDeNumeros; i++) {
			numerosSorteados[i] = random.nextInt(limite);
		}

		return numerosSorteados;
	}

	static int[] obterNumerosEscolhidos(int quantidadeDeNumeros, int limite) {
		Scanner sc = new Scanner(System.in);
		int[] numerosEscolhidos = new int[quantidadeDeNumeros];

		System.out.println("=========Mega Sena=========\n");

		for (int i = 0; i < quantidadeDeNumeros; i++) {
			try {
				System.out.println("\nDigite o " + (i + 1) + "° número (entre 0 e " + (limite - 1) + "):");
				int numeroEscolhido = sc.nextInt();

				if (numeroEscolhido >= 0 & numeroEscolhido < limite) {
					numerosEscolhidos[i] = numeroEscolhido;
				} else {
					System.err.println("Insira um número entre 0 e " + (limite - 1));
					i--;
				}
			} catch (InputMismatchException e) {
				System.err.println("Insira um número válido.");
				sc.next();
				i--;
			}
		}

		sc.close();

		return numerosEscolhidos;
	}

	static int contarAcertos(int[] numerosSorteados, int[] numerosEscolhidos) {
		int acertos = 0;

		for (int i = 0; i < numerosSorteados.length; i++) {
			if (numerosEscolhidos[i] == numerosSorteados[i]) {
				acertos++;
			}
		}

		return acertos;
	}

	static int calcularPremio(int acertos) {
		int premio;

		switch (acertos) {
			case 5:
				premio = 10000;
				break;
			case 6:
				premio = 50000;
				break;
			case 7:
				premio = 200000;
				break;
			default:
				premio = 0;
		}

		return premio;
	}

}
