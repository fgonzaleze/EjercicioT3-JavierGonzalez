package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Realiza un programa que nos pida un número n y nos diga cuántos números hay
		// entre 1 y n que sean primos.
				// Prueba 1: Introduzco 10, hay 4 números primos. Es correcto: 2, 3, 5 y 7.
				// Prueba 2: Introduzco 12, hay 5 números primos. Es correcto: 2, 3, 5, 7 y 11.
				// Prueba 3: Introduzco 2, hay 1 número primo. Es correcto, el 2.
				// Prueba 4: Introduzco el 53, hay 16 numeros primos. Es correcto: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47 y 53.

				int num;											// Indicamos la variable num que será por la que pedimos el numero
				int contador = 0;									// Variable para el contador, iniciado en 0
				boolean esPrimo = true;								// Variable boolean para esPrimo, que será true or false. En este caso la establecemos como true
				Scanner sc = new Scanner(System.in);				// Abrimos escáner
				System.out.println("Introduzca un numero entero positivo para saber cuantos números primos hay: ");
				num = sc.nextInt();
				if (num > 0) {										// Condicional if para asegurarnos de que el numero introducido es correcto
					for (int i = 2; i <= num; i++) {				// Usamos el for inicializando i en 2 ya que es el primer número primo, ponemos que acabe cuando sea <= al num y así lo cuente también, y vamos incrementando
						esPrimo=true;
						for (int j=2; j<i; j++) {
							if (i % j ==0) {
								esPrimo = false;
								break;
							}
						}
						if (esPrimo) {								// Hacemos que si es primo sume al contador
							contador++;
							} 
					}
				} else {											// En caso de que el num introducido no sea correcto
					System.out.println("No ha introducido un número válido");
				}
				
				System.out.println("Hay " + contador + " numeros primos en " + num);

				sc.close();											// Cerramos escáner
			}

}
