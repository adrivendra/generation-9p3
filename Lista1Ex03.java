package atividade9_3;

import java.util.Scanner;

public class Lista1Ex03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nome;
		int idade;
		boolean primeiraDoacao;

		System.out.println("Digite o Nome do doador: \n");
		nome = leia.nextLine();

		System.out.println("Digite a Idadea do doador: \n");
		idade = leia.nextInt();

		System.out.println("Primeira doação de sangue? Responder com true para Sim e false para não!!\n");
		primeiraDoacao = leia.nextBoolean();
		
		leia.close();

		if (idade >= 18 && idade < 60) {
			System.out.println(nome + " está apto para doar sangue! ");
		} else if (idade >= 60 && idade < 69 && primeiraDoacao == true) {
			System.out.println(nome + " não está apto para doar sangue! ");
		} else if (idade >= 60 && idade < 69 && primeiraDoacao == false) {
			System.out.println(nome + " está apto para doar sangue! ");

		}else {
			System.out.println(nome + " não está apto para doar sangue! ");
		}

	}

}
