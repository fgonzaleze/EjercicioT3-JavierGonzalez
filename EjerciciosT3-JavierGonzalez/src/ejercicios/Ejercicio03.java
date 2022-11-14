package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Solicita al usuario un número n y dibuja un triángulo de base y altura n. Por ejemplo para n=4 debe dibujar lo siguiente:
		// *
		// **
		// ***
		// ****

		//  for(int j=3; j>0; j--) {  
		     // for(int i=0; i<j; i++) {  
		     //   System.out.print( "*" );  
		    //  }  
		    //  System.out.println();  
		   // }  
		
		int num;
        Scanner sc = new Scanner(System.in);
		System.out.println("Cual es la altura del triángulo: ");
		num = sc.nextInt();
        for (int x = 1; x <= num; x++)
        {
            for (int i = 1; i <= x; i++)
            {
                System.out.print("*");
            }
            
            System.out.println("");
        
        }
        sc.close();
    
		
		
	}
}


