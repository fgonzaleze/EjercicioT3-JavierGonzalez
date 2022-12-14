package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Realiza un programa que nos pida un número n y nos diga cuántos números hay
		// entre 1 y n que sean primos.
		
		// Prueba 1: 0, No ha introducido un número válido
		// Prueba 2: 1, no hay números primos
		// Prueba 3: 2, hay un número primo en 2
		// Prueba 4: 11, hay 5 números primos

		
				int num;											// Indicamos la variable num que será por la que pedimos el numero
				int contador = 0;									// Variable para el contador, iniciado en 0
				Scanner sc = new Scanner(System.in);				// Abrimos escáner
				System.out.println("Introduzca un numero entero positivo para saber cuantos números primos hay: ");
				num = sc.nextInt();
				if (num > 0) {										// Condicional if para asegurarnos de que el numero introducido es correcto
					for (int i = 2; i <= num; i++) {				// Usamos el for inicializando i en 2 ya que es el primer número primo, ponemos que acabe cuando sea <= al num y así lo cuente también, y vamos incrementando
						contador++;									// usamos el contador para que tenga recuento de la cantidad de números
						for (int j=2; j<i; j++) {
							if (i % j ==0) {
								contador--;							// Restamos cada vez que no sea primo
								break;
							}
						}
						
					}
				} else {											// En caso de que el num introducido no sea correcto
					System.out.println("No ha introducido un número válido");
				}
				
				System.out.println("Hay " + contador + " numeros primos en " + num);

				sc.close();												// Cerramos escáner
			}

}
