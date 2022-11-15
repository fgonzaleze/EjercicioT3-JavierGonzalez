package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

				// Prueba 1: Introduzco 23, 59, 59, 1, la hora debería ser 0:0:0, es correcto
				// Prueba 2: Introduzco 23, 59, 50, 10, la hora debería ser 0:0:0, es correcto
				// Prueba 3: Introduzco 12, 00, 00, 3600, la hora debería ser 13:0:0, es correcto

				// Escribe un programa que incremente la hora de un reloj. Se pedirán por
				// teclado:
				// - Hora
				// - Minutos
				// - Segundos
				// - Cantidad de segundos a incrementar
				// La aplicación debe mostrar la nueva hora. Por ejemplo, si el usuario
				// introduce hora=13, minutos=59 y segundos=51,
				// y se desea incrementar en 10 segundos, el resultado a mostrar es 14:00:01.
				
				int horas;											// Variable para guardar las horas
				int minutos;										// Variable para guardar los minutos
				int segundos;										// Variable para guardar los segundos
				int incremento;										// Variable para guardar el incremento
				Scanner sc = new Scanner(System.in);
				System.out.println("Introduzca las horas:");			// Pedimos las horas
				horas = sc.nextInt();
				System.out.println("Introduzca los minutos:");		// Pedimos los minutos
				minutos = sc.nextInt();
				System.out.println("Introduzca los segundos:");		// Pedimos los segundos
				segundos = sc.nextInt();
				System.out.println("Introduzca los segundos a incrementar:");	// Pedimos los segundos a incrementar
				incremento = sc.nextInt();
				 for (int i = 1; i <= incremento; i++) { 	// Usamos el for incrementando un segundo por cada bucle

		             if (segundos == 59) {           // Si los segundos son iguales a 59
		                 segundos = 0;               // Igualamos los segundos a 0
		                 if (minutos == 59) {        // Si los minutos son iguales a 59
		                     minutos = 0;            // Igulamos los minutos a 0
		                     if (horas == 23) {      // Si las horas son iguales a 23
		                         horas = 0;          // Igualamos las horas a 0
		                     } else {                // Si las horas no son iguales a 23
		                         horas++;            // incrementamos las horas en 1
		                     }
		                 } else {                    // Si los minutos no son iguales a 59
		                     minutos++;              // Incrementamos los minutos en 1
		                 }
		             } else {                        // Si los segundos no son igualae a 59
		                 segundos++;                 // Incrementamos los segundos en 1
		             }


				}
				System.out.println(horas + ":" + minutos + ":" + segundos);			// Imprimimos las horas, los minutos y los segundos como un reloj
				sc.close();															// Cerramos el escáner
				
			}

}
