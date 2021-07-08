package Estrutura_For;

import java.util.Scanner;

public class Uri1072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		int contadorIn = 0;
		int contadorOut = 0;
		
		for (int i = 0; i < N; i++) {
			
			int x = sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				contadorIn++;
			} else {
				contadorOut++;
			}
		}

		System.out.println(contadorIn + "in");
		System.out.println(contadorOut + "out");
		
		sc.close();
	}

}
