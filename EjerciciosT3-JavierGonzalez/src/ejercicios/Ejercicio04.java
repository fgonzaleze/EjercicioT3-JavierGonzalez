package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
				// Para dos números dados, a y b, es posible calcular el máximo común divisor
				// (el número más grande que divide a ambos) mediante un algoritmo ineficiente
				// per sencillo:
				// desde el menor de a y b, ir buscando, de forma decreciente, el primer número
				// que divide a
				// ambos simultáneamente. Teniendo en cuenta lo que se acaba de explicar,
				// realiza un programa
				// que calcule el máximo común divisor de dos números.

				int num1;
				int num2;
				int mcd = 1;

				Scanner sc = new Scanner(System.in);

				System.out.println("Introduzca el primer numero entero positivo: ");
				num1 = sc.nextInt();
				System.out.println("Introduzca el segundo numero entero positivo: ");
				num2 = sc.nextInt();

				for (int i = 1; i <= num1 && i <= num2; ++i) {								// Calculamos para averiguar el minimo comun divisor
																							// vamos sumando 1 hasta encontrar un número que sea divisible por ambos sin dar resto
					if (num1 % i == 0 && num2 % i == 0) {									// Condicional cuando el modulo i de num1 y num2 sea sin resto
						mcd = i;															// Una vez obtengamos el maximo comun divisor será igual a i
					}
				}

				System.out.printf("El máximo común divisor de " + num1 + " y " + num2 + " es " + mcd);		// Imprimimos la solución
				sc.close();																					// Cerramos el escáner
				
			}

	}


