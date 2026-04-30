package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese la cantidad de productos: ");
		int productos = entrada.nextInt();
		
		String nombrep;
		int cantp;
		
		
		for ( int i = 0; i < productos; i++ ) {
			System.out.println("Ingrese nombre del producto N° " + (i+1));
			nombrep = entrada.next();
			
			System.out.println("Ingrese la cantidad de unidades del producto N° " + (i+1));
			cantp = entrada.nextInt();
				
			if (cantp < 5 ) {
			
			System.out.println("Casi sin Stock");	
				
			}
			
			
		}
		
		
	
		
		
			
			
			
			
		}
	}


	
	
	
	
	
	
	
	
	
	
	
		
        
        
        
        
        
		
		
		
