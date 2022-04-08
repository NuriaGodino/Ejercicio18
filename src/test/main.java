package test;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Runnable numPrimo = () -> {
			System.out.println("Introduce un número");
			int num = sc.nextInt();
			if(esPrimo(num)) {
				System.out.println("El número " + num + " es un numero primo");
			}else {
				System.out.println("El número " + num + " no es un numero primo");
			}
		};
		
		Thread h1 = new Thread(numPrimo);
		h1.start();

	}
	
	public static boolean esPrimo(int num) {
		if(num == 0 || num == 1 || num == 4) { //el numero 1 no es primo porque solo tiene un divisor el mismo
			return false;
		}
		
		for(int i = 2; i < num/2; i++) {
			if(num%2 == 0) {
				return false;
			}
		}
		return true;
	}

}
