package ej1;
import java.util.Scanner;

public class Principal {

	private static final int MAX_REFRANES = 5;
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		int opcion;
		int numRealRefranes=0;
		Refran[] arrayRefranes=new Refran[MAX_REFRANES] ;
		
		
		do {
			opcion=mostrarMenu();
			numRealRefranes=tratarMenu(opcion,arrayRefranes,numRealRefranes);
		} while (opcion!=4);
	}

	private static int tratarMenu(int opcion, Refran[] arrayRefranes,int numRealRefranes) {
		int i=0;
		
		
		switch(opcion) {
			case 1: 
				
			try {
				arrayRefranes[i]=new Refran(introducirRefran(),introducirPopularidad());
			} catch (RefranException e) {
				e.getMessage();
			}
					numRealRefranes++;
					break;
			
			case 2: 		
			buscarRefranPorPalabra(arrayRefranes);
			break;
			
			case 3:
				for(i=0;i<arrayRefranes.length;i++) {
					System.out.println("En realidad hay "+numRealRefranes+ " refranes en el array");	
				}
				break;
			case 4:
				System.out.println("Has seleccionado salir");
		}
		return numRealRefranes;
	}

	private static String introducirRefran() {
		String refran;
		
		System.out.println("Introduce el refran: ");
		refran=teclado.nextLine();
		
		return refran;
	}
	
	private static int introducirPopularidad() {
		int popularidad;
		
		System.out.println("Introduce la popularidad del refran: ");
		popularidad=Integer.parseInt(teclado.nextLine());
		
		return popularidad;
	}

	public static void buscarRefranPorPalabra(Refran[] arrayRefranes) {
		int i;
		String palabraABuscar;
		System.out.println("Introduce la palabra para buscar un refran: ");
		palabraABuscar=teclado.nextLine();

		for(i=0;i<arrayRefranes.length;i++) {
			if(arrayRefranes.equals(palabraABuscar)) {
				System.out.println("Refran encontrado");
			}else {
				System.out.println("Refran no encontrado");
			}
		}
	}
	
	private static int mostrarMenu() {
		int opcion;
		
		System.out.println("--BIENVENIDO AL MENU--");
		System.out.println("1.Guardar un refran");
		System.out.println("2.Buscar un refran por un palabra");
		System.out.println("3.Mostrar la lista de refranes guardados");
		System.out.println("4.Salir");
		
		System.out.println("Introduce una opcion: ");
		opcion=Integer.parseInt(teclado.nextLine());
		
		return opcion;
	}
	
	
	
	
	
	
	
	
}
