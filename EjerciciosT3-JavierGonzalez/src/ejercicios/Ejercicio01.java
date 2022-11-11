package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Escribe un programa que incremente la hora de un reloj. Se pedirán por teclado:
			// - Hora
			// - Minutos
			// - Segundos
			// - Cantidad de segundos a incrementar
			//La aplicación debe mostrar la nueva hora. Por ejemplo, si el usuario introduce hora=13, minutos=59 y segundos=51, 
			// y se desea incrementar en 10 segundos, el resultado a mostrar es 14:00:01.
		int horas, minutos, segundos;
		int incremento;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca las horas");
		horas = sc.nextInt();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los minutos");
		minutos = sc.nextInt();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los segundos");
		segundos = sc.nextInt();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los segundos a incrementar");
		incremento = sc.nextInt();
		for (int i=1; i<=incremento; i++) {
			if (segundos == 59) {
				minutos = 0;
			 if (minutos == 59) {
				horas = 0;
			 if (horas == 23) {
				horas = 0;
			} else {
				
			}
				horas++;
			} else {
				
			}
				minutos++;
			} else {
				segundos++;
			}
					
				
		}  
			System.out.println(horas + ":" + minutos + ":" + segundos);
			sc.close();
			
	}


	}


