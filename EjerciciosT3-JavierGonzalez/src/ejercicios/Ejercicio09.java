package ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		// Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. El número introducido debe ser mayor que 0.
		
		int num;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero entero: ");								// Pedimos el número entero
        num = sc.nextInt();
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
