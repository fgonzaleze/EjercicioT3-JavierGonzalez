package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
			// Escribe un programa que lea un número n e imprima una pirámide de números con n filas como en la siguiente figura:
			// 1
			// 121
			// 12321
			// 1234321
		
		// Prueba 1: -1; no es un número valido al ser negativo
		// Prueba 2: 2, lo imprime correctamente
		// Prueba 3: 12, lo imprime correctamente
		
        int num;																// Solo declaramos una variable, ya que las demás estarán en el bucle

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero positivo: ");			// Pedimos el num, la variable
        num = sc.nextInt();


        if (num < 0) {     														// Mensaje de error en caso de que introduzca un numero negativo
            System.out.print("Valor introducido no valido, el numero debe ser positivo");
        } else {            													// Si es positivo

            for (int i = 1; i <= num; i++) {      								  // Empezamos el bucle en 1, acabamos cuando llegue al num, y lo vamos incrementando uno
            																	  // Este bucle será para determinar las filas
                for (int j = 1; j <= i; j++) {    								  // Empezamos en 1 otra vez, acabamos al llegar a i y lo incrementamos en uno
                																// Este bucle será para los números crecientes (si es 5: 12345)
                    System.out.print(j);           								 // Imprimimos el numero j sin salto de linea
                }
                for (int k = i - 1; k >= 1; k--) { 								 //Inicializamos el segundo bucle en i pero le restamos 1, acabamos al llegar a 1 y vamos restando en uno
                																// Este bucle será para los números que van decreciendo (si es 5: 54321)
                    System.out.print(k);            							//Imprimimos el numero k en este caso sin saltar la linea
                }

                System.out.println();             								  //Hacemos un salto de linea
            }
        }
        		sc.close();															// Cerramos escáner
	    }
	}

