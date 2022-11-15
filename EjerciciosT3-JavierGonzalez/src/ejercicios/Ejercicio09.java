package ejercicios;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. El número introducido debe ser mayor que 0.
		
				// Prueba 1: Pongo el 10, dice que tiene 2 cifras, está en lo correcto
				// Prueba 2: Pongo el 9, dice que tiene una cifra, está en lo correcto
				// Prueba 3: Pongo 123, dice que tiene 3 cifras, vuelve a acertar
				// Prueba 4: Pongo 1234, dice que tiene 4 cifras, perfecto
				// Prueba 5: Pongo 123456789, dice que tiene 9 cifras, bien
				// Prueba 6: Pongo 1234567890, tiene 10 cifras; efectivamente
				// Prueba 7: Pongo 12345678901, da error. Mierda
				// Prueba 8: Pongo 2147483647, pone que tiene 10 cifras
				// Prueba 9: Pongo 2147483648, da error. Efectivamente es cosa del Int, ya que su valor máximo es 2147483647
				// Prueba 10: Cambio los int por long, y pongo 2147483648, dice que tiene 10 cifras, no da error, soy un máquina
				// Prueba 11: Pongo 123456789098765, dice que tiene 15 cifras, al final hacer pruebas si que va a servir. 
				
				long num;
		        long contador = 0;
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Introduzca un numero entero: ");								// Pedimos el número entero
		        num = sc.nextLong();
		        if (num <= 0) {                														// Condicional por si el numero introducido es menor que 0 
		            System.out.println("Numero no válido, debe ser mayor que 0");
		        } else {                      														// Si el numero es correcto
		            while (num > 0){          														// Mientras el numero sea mayor que 0
		                num = num / 10;            													// Dividimos el numero entre 10, lo que hará que contemos cada cifra
		                contador++;   																// Añadimos 1 al contador por cada cifra
		            }
		            System.out.println("El numero introducido tiene " + contador + " cifras");		// Imprimimos el contador que será las cifras que tenga
		        }

		        sc.close();																			// Cerramos el escáner
			}
	}


