package Ejercicio9;
import java.util.Scanner;
public class Ejercicio9 {

	static Scanner entrada = new Scanner(System.in);
	static int opcion = 0;
	static int puntajemax = 0, puntaje1;
	public static void main(String[] args) {
		mostrarMenu();
	}
	public static void registrarPuntaje() {
		System.out.println("Ingrese puntaje: ");
		puntaje1 = entrada.nextInt();
		if (puntaje1 > puntajemax) {
			puntajemax = puntaje1;
		}
	}
	public static void mostrarMejorPuntaje() {
		
	
		
		
		System.out.println("El récord actual es: " + puntajemax + " puntos");  }
	
	private static void validarIngreso() {
		while (puntaje1 < 0 || puntaje1 > 500) {
			System.err.println("Error: El puntaje. Ingrese un valor entre 0 y 500:");
			puntaje1 = entrada.nextInt();
		}
	}
	public static void mostrarMenu() {
		do {
			System.out.println("------MENU------");
			System.out.println("Seleccione una opcion: ");
			System.out.println("1-Registrar puntaje.");
			System.out.println("2-Mostrar mejor puntaje.");
			System.out.println("3-Salir.");
			opcion = entrada.nextInt();
			switch (opcion) {
				case 1:
					registrarPuntaje();
					validarIngreso();
					break;
				case 2:
					mostrarMejorPuntaje();
					
					break;
				case 3:
					System.out.println("Saliendo");
					break;
				default:
					break;
			}
		} while (opcion != 3);
	}
}

