package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Realiza un programa que nos pida un número n y nos diga cuántos números hay entre 1 y n que sean primos.

		int num;
		boolean esPrimo = true;
		int contador = 0;
		int resultado;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero entero positivo para saber cuantos números primos hay: ");
		num = sc.nextInt();	
		for (int i=2; i<num; i++) {
				if (num % i == 0) { 
					
				} else {
				contador++;
				}
			}
			resultado = num - contador;
			System.out.println("Hay " + resultado + " numeros primos en " + num);
		
		sc.close();
	}

}
