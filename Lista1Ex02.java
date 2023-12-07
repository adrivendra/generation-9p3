package atividade9_3;

import java.util.Scanner;

public class Lista1Ex02 {

	public static void main(String[] args) {
		int numero;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número: \n");
		numero = leia.nextInt();

		leia.close();

		if (numero >= 0 && numero % 2 == 0) {
			System.out.println("O número " + numero + " é par e positivo!");

		} else if (numero < 0 && numero % 2 == -1) {
			System.out.println("O número " + numero + " é ímpar e negativo!");

		} else if (numero < 0 && numero % 2 != -1) {
			System.out.println("O número " + numero + " é par e negativo!");

		} else if (numero >= 0 && numero % 2 == 1) {
			System.out.println("O número " + numero + " é ímpar e positivo!");
		}

	}

}
