package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla los 
		// números desde 1 hasta N, uno en cada línea, repitiendo cada número tantas veces como su valor.
		
		// Prueba 1: 21, el numero es incorrecto
		// Prueba 2: 1, imprime 1
		// Prueba 3: 2, imprime correctamente
		// Prueba 4: 11, imprime correctamente
		
		int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entre 0 y 20 para repetirlos en línea: "); 			// Pedimos el num de filas
        num = sc.nextInt();
        if (num <= 20)
        for (int i = 1; i <= num; i++) {  		 		// Inicializamos el primer bucle en 1, lo terminamos en num y lo incrementamos en 1, bucle para ir saltando filas
            for (int j = 1; j <= i; j++) {      		// Inicializamos el segundo bucle en 1, lo terminamos en i y lo incrementamos en 1
                System.out.print(i);            		// Imprimimos i, ya que este bucle es para ir imprimiendo los números
            }
            System.out.println();            		  	// Hacemos un salto de linea
        } else {										// En caso de que el numero introducido sea erroneo
        	System.out.println("El número introducido es incorrecto");
        }
        sc.close();													//Cerramos el scanner
    }

	}


