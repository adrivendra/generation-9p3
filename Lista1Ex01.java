package atividade9_3;

import java.util.Scanner;

public class Lista1Ex01 {

	public static void main(String[] args) {
		int nA, nB, nC;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número A: \n");
		nA = leia.nextInt();

		System.out.println("Digite o número B: \n");
		nB = leia.nextInt();

		System.out.println("Digite o número C: \n");
		nC = leia.nextInt();

		leia.close();

		if (nA + nB > nC) {
			System.out.println("A Soma de A + B é Maior do que C");
		} else if (nA + nB < nC) {
			System.out.println("A Soma de A + B é Menor do que C");
		} else if (nA + nB == nC) {
			System.out.println("A Soma de A + B é Igual a C");

		}

	}
}