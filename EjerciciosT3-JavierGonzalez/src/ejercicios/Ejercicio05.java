package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
				// De forma similar a la actividad 4, realiza un programa que calcule el mínimo 
				// común múltiplo de dos números dados. En este caso, habrá que partir del máximo de los dos e 
				// ir incrementando hasta encontrar el primer número que sea múltiplo de los dos números.
				
				// Prueba 1: 12 y 2; el mcm es 12
				// Prueba 2: 4 y 6, el mcm es 12
				// Prueba 3: 7 y 11, el mcm es 77
		
		
				int num1;
				int num2;
				int mcd = 1;
				int mcm;

				Scanner sc = new Scanner(System.in);										// Abrimos escáner

				System.out.println("Introduzca el primer numero entero positivo: ");		// Pedimos el primer número
				num1 = sc.nextInt();
				System.out.println("Introduzca el segundo numero entero positivo: ");		// Pedimos el segundo número
				num2 = sc.nextInt();

				for (int i = 1; i <= num1 && i <= num2; ++i) {								// Calculamos para averiguar el minimo comun divisor
																							// vamos sumando 1 hasta encontrar un número que sea divisible por ambos sin dar resto
					if (num1 % i == 0 && num2 % i == 0) {									// Condicional cuando el modulo i de num1 y num2 sea sin resto
						mcd = i;															// Una vez obtengamos el maximo comun divisor será igual a i
					}																		// Si tenemos un número primo el valor de mcd será 1 con lo que no nos dará error en la cuenta posterior
				}

				mcm = (num1 * num2) / mcd;  												// Calculamos el máximo común divisor, que será la multiplicación del num1
																							// y el num2 entre el minimo comun divisor, que en caso de que sea 1 de el mismo resultado
				System.out.print("El mínimo común múltiplo de " + num1 + " y " + num2 + " es " + mcm);  	
				sc.close();
			}
		
		
	}


