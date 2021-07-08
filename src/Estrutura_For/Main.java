package Estrutura_For;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int contar = 0;
		
		for(int i =0; i < N; i++) {
			int x= sc.nextInt();
			contar = contar + x;
			
		}
		System.out.println(contar);
		sc.close();
	}

}
