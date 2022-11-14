package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Realiza un programa que nos pida un número n y nos diga cuántos números hay
		// entre 1 y n que sean primos.

		int num;
		int contador = 0;
		boolean esPrimo = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero entero positivo para saber cuantos números primos hay: ");
		num = sc.nextInt();
		if (num > 0) {
			for (int i = 2; i <= num; i++) {
				esPrimo=true;
				for (int j=2; j<i; j++) {
					if (i % j ==0) {
						esPrimo = false;
						break;
					}
				}
				if (esPrimo) {
					contador++;
					} 
			}
		} else {
			System.out.println("No ha introducido un número válido");
		}
		
		System.out.println("Hay " + contador + " numeros primos en " + num);

		sc.close();
	}

}
