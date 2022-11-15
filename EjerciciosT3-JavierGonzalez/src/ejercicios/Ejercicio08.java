package ejercicios;

public class Ejercicio08 {

	public static void main(String[] args) {
		 // Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último dado. La introducción de
		 // números finaliza con la introducción de un 0. Al final se mostrará:
		 // El total de números introducidos, excluido el 0. El total de números fallados.
		
		// Prueba 1: Pongo 12, me pide otro numero entero, pongo 2, me da error, pongo 4, me pide otro número, pongo 0; 3 introducidos, 1 fallado.
		// Prueba 2: Pongo 1, 2, 1, da error, pongo el 3 y el 0; 4 introducidos, 1 fallado.
		
       int num;
       int mayor;
       int contador_num = 0;
       int contador_fallados = 0;

       Scanner sc = new Scanner(System.in);

       System.out.println("Introduzca un numero entero: ");
       num = sc.nextInt();
       mayor = num;                                										// El mayor es lo introducido al inicio, así que mayor = num

       while (num != 0) {                              									// Mientras que num no sea igual a 0 ya que 0 es para cerrar el programa
           contador_num++;                              									// añadimos 1 al contador de numeros para mostrarlo al final
           if (num < mayor) {                     											// Si el numero inicial es menor que el mayor introducido hasta el momento
               System.out.println("Fallo, introduzca un numero mayor al anterior.");      	// Imprimimos un mensaje de error
               contador_fallados++;                           								// Sumamos 1 al contador de fallos, donde llevaremos los errores
           }
           mayor = num;                           											// Aquí vamos a tener un nuevo número mayor, que será el proximo a tener en cuenta para la condicion
                                                           					
           System.out.println("Introduzca un numero entero:");    							// Pedimos de nuevo un número para continuar en bucle en la variable num
           num= sc.nextInt();                       							
       }

       System.out.println("Numeros introducidos: " + contador_num);						// Imprimimos el contador de num introducidos
       System.out.println("Numeros fallados: " + contador_fallados);						// Imprimimos el contador de fallos

       sc.close();																			// Cerramos escaner
	}
	}


