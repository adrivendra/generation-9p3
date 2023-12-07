package atividade9_3;

import java.util.Scanner;

public class Lista02Ex04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int tipoOp;
		float novoSaldo, valorDeposito, valorSaque, saldo = 1000;
		
		System.out.println("################################ OPERAÇÕES ################################");
		System.out.println("Escolha uma operação\n 1 - Saldo\n 2 - Saque\n 3 - Deposito");
		tipoOp = leia.nextInt();
		
		switch(tipoOp) {
		
		case 1:
			System.out.println("Operação - Saldo");
			System.out.printf("Saldo: R$ %.2f", saldo);
			break;
		
		case 2:
			System.out.println("Operação - Saque\n Digite o valor do Saque!: ");
			 valorSaque = leia.nextFloat();
			if(saldo > valorSaque){
				novoSaldo = saldo - valorSaque;
				System.out.printf("Novo Saldo: R$ %.2f", novoSaldo);
			}else if(saldo < valorSaque){
				System.out.println("Saldo Insuficiente!");
			}											
			break;
			
		case 3:
			System.out.println("Operação - Deposito\n Digite o valor do Deposito!: ");
			valorDeposito = leia.nextFloat();
			novoSaldo = saldo + valorDeposito;
			leia.close();
			System.out.printf("Novo Saldo: R$ %.2f", novoSaldo);					
			break;
		
		default:
			System.out.println("Operação Inválida!");
		}

}

}
