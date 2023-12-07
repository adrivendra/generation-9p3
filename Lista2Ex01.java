package atividade9_3;

import java.util.Scanner;

public class Lista2Ex01 {

	public static void main(String[] args) {
		int opcao, quantidade;
		float preco = 0, valorTotal;

		Scanner leia = new Scanner(System.in);

		System.out.println(
				"########################################## MENU ##########################################\n");
		System.out.println("Digite 1 para Cachorro quente");
		System.out.println("Digite 2 para X-Salada");
		System.out.println("Digite 3 para X-Bacon");
		System.out.println("Digite 4 para Bauru");
		System.out.println("Digite 5 para Refrigerante");
		System.out.println("Digite 6 para Suco de laranja");

		opcao = leia.nextInt();

		switch (opcao) {

		case 1:
			preco = 10.0f;
			System.out.println("Voce escolheu Cachorro quente!");
			break;

		case 2:
			preco = 15.0f;
			System.out.println("Voce escolheu X-Salada!");
			break;

		case 3:
			preco = 18.0f;
			System.out.println("Voce escolheu X-Bacon!");
			break;

		case 4:
			preco = 12.0f;
			System.out.println("Voce escolheu Bauru!");
			break;

		case 5:
			preco = 8.0f;
			System.out.println("Voce escolheu Refrigerante!");
			break;

		case 6:
			preco = 13.0f;
			System.out.println("Voce escolheu Suco de Laranja!");
			break;

		default:
			System.out.println("Número inválido");

		}
		System.out.println("Digite a quantidade do produto: \n");
		quantidade = leia.nextInt();
		leia.close();

		valorTotal = quantidade * preco;

		System.out.printf("O valor final foi: R$ %.2f", valorTotal);

	}

}
