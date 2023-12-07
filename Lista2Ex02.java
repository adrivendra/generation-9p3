package atividade9_3;

import java.util.Scanner;

public class Lista2Ex02 {

	public static void main(String[] args) {
		String colaborador, cargo = null;
		int codigoCargo;
		float salario, reajuste = 0, salarioNovo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: \n");
		colaborador = leia.nextLine();
		
		System.out.println("################################################");
		System.out.println("Digite o código do seu cargo: \n 1 - Gerente \n 2 - Vendedor \n 3 - Supervisor \n 4 - Motorista \n 5 - Estoquista \n 6 - Técnico de TI");
		codigoCargo = leia.nextInt();
		
		switch(codigoCargo){
		
		case 1:
			reajuste = 0.1f;
			cargo = "Gerente";
			System.out.println("Você é Gerente!");
		break;
		
		case 2:
			reajuste = 0.07f;
			cargo = "Vendedor";
			System.out.println("Você é Vendedor!");
		break;

		case 3:
			reajuste = 0.09f;
			cargo = "Supervisor";
			System.out.println("Você é Supervisor!");
		break;
		
		case 4:
			reajuste = 0.06f;
			cargo = "Motorista";
			System.out.println("Você é Motorista!");
		break;
		
		case 5:
			reajuste = 0.05f;
			cargo = "Estoquista";
			System.out.println("Você é Estoquista!");
		break;
		
		case 6:
			reajuste = 0.08f;
			cargo = "Técnico de TI";
			System.out.println("Você é Técnico de TI!");
		break;
		
		default:
			System.out.println("Número incorreto!");
		}
		
		System.out.println("Digite o seu salário: \n");
		salario = leia.nextFloat();
		leia.close();
		
		salarioNovo = salario + (reajuste  * salario);
		
		System.out.println("Nome do colaborador: "+colaborador);
		System.out.println("Cargo: "+cargo);
		System.out.printf("O seu salário ajustado é: R$ %.2f", salarioNovo);
	}

}
