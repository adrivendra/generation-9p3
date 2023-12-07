package atividade9_3;

import java.util.Scanner;

public class Lista02Ex03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float numero1, numero2, resultado;
		int opMat;

		System.out.println("Digite o 1º numero: \n");
		numero1 = leia.nextFloat();

		System.out.println("Digite o 2º numero: \n");
		numero2 = leia.nextFloat();
		System.out.print("\033[0;35m");
		System.out.println("################################ OPERAÇÕES ################################");
		System.out.println(
				"Digite um numero para escolher uma operação\n 1 - Soma\n 2 - Subtração\n 3 - Multiplicação\n 4 - Divisão");
		System.out.print("\033[0m");
		opMat = leia.nextInt();

		leia.close();

		switch (opMat) {

		case 1:
			resultado = numero1 + numero2;
			System.out.printf("%.1f + %.1f = %.1f", numero1, numero2, resultado);
			break;

		case 2:
			resultado = numero1 - numero2;
			System.out.printf("%.1f - %.1f = %.1f", numero1, numero2, resultado);
			break;

		case 3:
			resultado = numero1 * numero2;
			System.out.printf("%.1f * %.1f = %.1f", numero1, numero2, resultado);
			break;

		case 4:
			resultado = numero1 / numero2;
			System.out.printf("%.1f / %.1f = %.1f", numero1, numero2, resultado);
			break;

		default:
			System.out.println("Operação Inválida!");

		}

	}

}
