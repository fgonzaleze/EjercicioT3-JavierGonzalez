package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		// Realiza un programa que nos diga si un número introducido por teclado es capicúa o no.
		
		// Prueba 1: -1, nos pide introducir un numero correcto
				// Prueba 2: 12, no es capicua
				// Prueba 3: 11, es capciua
				// Prueba 4: 112, no es capicua
				// Prueba 5: 121, es capicua
				// Prueba 6: 1221, es capicua
				// Prueba 7: 123321, es capicua
					
				int num1;																// Variable del numero que pidamos
				int num2;																// Variable para igualarla a num1
				int respuesta = 0;														// Respuesta la igualamos a 0
				int cifra;																// Variable donde guardaremos la cifra dentro del bucle
				
				Scanner sc = new Scanner(System.in);									// Pedimos el número por escáner
				System.out.println("Introduzca un numero entero: ");
			    num1 = sc.nextInt();
				
			    num2 = num1;															// Igualamos num2 al número que hemos solicitado
			    
			    if (num1 < 0) {															// En caso del que el numero introducido no sea correcto
			    	System.out.println("Introduzca un numero entero positivo");
			    } else {
			    	while (num2>0) {													// Bucle while para comprobar que el número en la posición que le debe 
			    		cifra=num2%10;													// corresponder es capicua o no. Comprobamos con el módulo 10, guardandolo en respuesta
			    		respuesta=respuesta*10+cifra;									// y multiplicando por 10, sumándole despues la cifra que hemos calculado anteriormente
			    		num2 = num2 / 10;												// para continuar, el num2, se divide entre 10 y pasar al siguiente num. 
			    	}
			    	if (respuesta == num1) {											// Si la respuesta es igual al num1 que hemos introducido, el numero será capicua
			    		System.out.println("El número es capicua");
			    	} else {															// Sino, no lo será 
			    		System.out.println("El numero no es capciua");
			    	}
			    	sc.close();															// Cerramos escáner
			    }

	}

}
