package Exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		/*
		 * Tabuada de Multiplicação: Solicite um número ao usuário e exiba a tabuada de
		 * multiplicação desse número até 10 usando um loop for.
		 */

		int recebe = 0;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Digite um número para obter sua respectiva tabuada: ");
			recebe = sc.nextInt();

			if (recebe < 0 || recebe == 0) {
				System.out.println("Você digitou um número inválido, tente novamente");
			} else {
				for (int i = 1; i <= 10; i++) {
					System.out.println(recebe + " X " + i + " = " + recebe * i);
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Você digitou um valor inválido, insira um número inteiro.");
		} finally {
			sc.close();
		}
	}

}
