package Estrutura_For;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		char resp;
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			double tempCelsius = sc.nextDouble();
			double formula = 9.0 * tempCelsius / 5 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n" , formula);
			System.out.println("Deseja repetir (s/n)");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		sc.close();
	}

}
