package EJ1;

import java.util.Scanner;

public class MiEntradaSalida {

	static Scanner teclado=new Scanner(System.in);
	
	static int solicitarEntero() {
		int numero;
			
			System.out.println("Introduce un numero: ");
			numero=Integer.parseInt(teclado.nextLine());
		
		return numero;
	}
	
	static int solicitarEnteroPositivo() {
		int numero;
			
			do {
				System.out.println("Introduce un numero positivo: ");
				numero=Integer.parseInt(teclado.nextLine());
			} while (numero<0);
		
		return numero;
	}
	
	static int solicitarEnteroEnRango(int limiteInferior,int limiteSuperior) {
		int numero=0;	
		
			do {
				System.out.println("Introduce un numero entre "+limiteInferior+" y "+limiteSuperior+": ");
				numero=Integer.parseInt(teclado.nextLine());
			} while (numero<limiteInferior || numero>limiteSuperior);
		
		return numero;
	}

	static char solicitarCaracter() {
		char caracter;
	
			System.out.println("Introduce un caracter: ");
			caracter=teclado.nextLine().charAt(0);
		
		return caracter;
	}
	
	static char solicitarCaracterSN() {
		char respuesta;
	
			System.out.println("Introduce una respuesta(S/N): ");
			respuesta=teclado.nextLine().charAt(0);
		return respuesta;
	}
	
	static String solicitarCadena() {
		String cadena;
		
		System.out.println("Introduce un mensaje o cadena de texto: ");
		cadena=teclado.nextLine();
		
		return cadena;
	}

}
