package ej1;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	private static final int MAX_REFRANES = 50;
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion;
		int numRealRefranes = 0;
		Refran[] arrayRefranes = new Refran[MAX_REFRANES];
		
		
		do {
			opcion = mostrarMenu();
			numRealRefranes = tratarMenu(opcion, arrayRefranes, numRealRefranes);
		} while (opcion != 4);
	}

	private static int tratarMenu(int opcion, Refran[] arrayRefranes, int numRealRefranes) {
		

		switch (opcion) {
		case 1:

			try {
				
				numRealRefranes = guardarRefranes(arrayRefranes, numRealRefranes);
				System.out.println("El numero de refranes es: "+numRealRefranes);

			} catch (RefranException e) {
				e.getMessage();
			}
			break;

		case 2:
			buscarRefranPorPalabra(arrayRefranes,numRealRefranes);
			break;

		case 3:
			listarRefranes(arrayRefranes, numRealRefranes);
			mostrarRefranesOrdenados(arrayRefranes, numRealRefranes);
			break;

		default:
			System.out.println("Has seleccionado salir");
		}
		return numRealRefranes;
	}

	private static void mostrarRefranesOrdenados(Refran[] arrayRefranes, int numRealRefranes) {
		
		
		Refran []arrayCopia=new Refran[numRealRefranes];
		
		for(int i=0;i<numRealRefranes;i++) {
			arrayCopia[i]=arrayRefranes[i];
		}
		
		Arrays.sort(arrayCopia);
		
		for(int i=0;i<numRealRefranes;i++) {
			System.out.println(arrayCopia[i]);
		}
		
	}

	public static void listarRefranes(Refran[] arrayRefranes, int numRealRefranes) {
		int i;
		
		for (i = 0; i < numRealRefranes; i++) {
			System.out.println(arrayRefranes[i]);
			System.out.println("hay");
		}
	}

	public static int guardarRefranes(Refran[] arrayRefranes, int numRealRefranes) throws RefranException {
		if (numRealRefranes == MAX_REFRANES) {
			throw new RefranException("Error, no se pueden meter mas refranes en el array");
		}

		Refran refran = new Refran(introducirRefran(), introducirPopularidad());
		arrayRefranes[numRealRefranes] = refran;
		numRealRefranes++;

		return numRealRefranes;
	}

	private static String introducirRefran() {
		String refran;

		System.out.println("Introduce el refran: ");
		refran = teclado.nextLine();

		return refran;
	}

	private static int introducirPopularidad() {
		int popularidad;

		System.out.println("Introduce la popularidad del refran: ");
		popularidad = Integer.parseInt(teclado.nextLine());

		return popularidad;
	}

	public static void buscarRefranPorPalabra(Refran[] arrayRefranes,int numRealRefranes) {
		int i;
		boolean primero=false;
		String palabraABuscar;
		System.out.println("Introduce la palabra para buscar un refran: ");
		palabraABuscar = teclado.nextLine();

		for (i = 0; i < numRealRefranes && primero==false;  i++) {
			if (arrayRefranes[i].getNombre().contains(palabraABuscar)) {
				System.out.println("Refran encontrado: " + arrayRefranes[i].getNombre());
				primero=true;
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
		opcion = Integer.parseInt(teclado.nextLine());

		return opcion;
	}

}
