package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Solicita al usuario un número n y dibuja un triángulo de base y altura n. 
		
				// Prueba 1: Pongo el 2, hace un triangulo con 3 estrellitas, es feísimo. 
				// Prueba 2: Pongo el 4, hace un triángulo con 4 estrellitas
				// Prueba 3: Pongo el 12, contra todo pronostico, hace un triangulo de 12 lados
				// Prueba 4: Pongo 300, tras 0.5 segundos, me imprime un triángulo que no puedo ver, pero intuyo que está bien
				// Prueba 5: Pongo 1000, tras un ratito imprimiendo, sale un triángulo tan grande que no puedo ver la punta
			
				
				int num;														// Variable para el número que vamos a solicitar
		        Scanner sc = new Scanner(System.in);							// Abrimos escáner
				System.out.println("Cual es la altura del triángulo: ");		// Pedimos la altura que queremos que tenga nuestro triángulo
				num = sc.nextInt();
				   for(int altura = 1; altura <= num; altura++){                // Inicializando el bucle en 1, acabamos en el num introducido y lo vamos incrementando 1

			            for(int i = 1; i<=num-altura; i++){   					// Inicializando el bucle en 1, lo terminamos en num-la altura y lo incrementamos en 1
			                System.out.print(" ");                              // Imprimimos un espacio en blanco
			            }

			            for(int j=1; j<=altura; j++){   						// Inicializando el bucle en 1, lo terminamos en nla altura y lo incrementamos en 1
			                System.out.print(" * ");                            // Imprimimos una estrella con espacios
			            }
			            System.out.println();                         	     	// Hacemos un salto de linea que imprima justo la siguiente
			        }
		        sc.close();														// Cerramos el escáner
		    
				
				
			}
		
	
}


