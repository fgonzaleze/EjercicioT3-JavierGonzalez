package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Solicita al usuario un número n y dibuja un triángulo de base y altura n. 
	
		
		int num;
        Scanner sc = new Scanner(System.in);
		System.out.println("Cual es la altura del triángulo: ");
		num = sc.nextInt();
		   for(int altura = 1; altura <= num; altura++){                 // Inicializando el bucle en 1, acabamos en el num introducido y lo vamos incrementando 1

	            for(int i = 1; i<=num-altura; i++){   					//Inicializando el bucle en 1, lo terminamos en num-la altura y lo incrementamos en 1
	                System.out.print(" ");                              //Imprimimos un espacio en blanco
	            }

	            for(int j=1; j<=altura; j++){   							 // Inicializando el bucle en 1, lo terminamos en nla altura y lo incrementamos en 1
	                System.out.print(" * ");                                 // Imprimimos una estrella con espacios
	            }
	            System.out.println();                                      	 //Hacemos un salto de linea que imprima justo la siguiente
	        }
        
        sc.close();
    
		
		
	}
}


