package EJ2;
import java.util.Scanner;

public class MainLinea {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) throws LineaException {
		
		Punto punto1=new Punto(pedirCoordenadaX(),pedirCoordenadaY());
		Punto punto2=new Punto(pedirCoordenadaX(),pedirCoordenadaY());
		
			crearLinea(punto1, punto2);
		
			
			
			
				
		
		
		
}

	private static  void crearLinea(Punto punto1,Punto punto2) {
		try {
			Linea linea1=new Linea(punto1,punto2);
			mostrarYTratarMenu(linea1);
		} catch (LineaException e) {
			e.getMessage();
		}
		
	}

	public static int pedirCoordenadaX() {
		int x;
		
		System.out.println("Introduce la coordenada x: ");
		x=Integer.parseInt(teclado.nextLine());
		
		return x;
	}
	
	public static int pedirCoordenadaY() {
		int y;
		
		System.out.println("Introduce la coordenada y: ");
		y=Integer.parseInt(teclado.nextLine());
		
		return y;
	}

		public static void mostrarYTratarMenu(Linea linea1) throws LineaException {
		int opcion;
		char letra;
		
		System.out.println("--BIENVENIDO AL MENU--");
		System.out.println("1.Pulse A-Arriba,B-aBajo,I-Izquierda o D-Derecha para desplazar la linea");
		System.out.println("2.Mostrar coordenadas de la linea");
		System.out.println("3.Salir");
	
		do {
			System.out.println("Introduce una opcion entre 1 y 3: ");
			opcion=Integer.parseInt(teclado.nextLine());
			
			switch(opcion) {
			case 1: 
				System.out.println("Seleccione una letra(A-B-I-D): ");
				letra=teclado.nextLine().charAt(0);
				letra=Character.toUpperCase(letra);
				switch(letra) {
					case'A':
						linea1.moverArriba(pedirDistanciaAMover());
						break;
					case'B':
						linea1.moverAbajo(pedirDistanciaAMover());
					case'I':
						linea1.moverIzquierda(pedirDistanciaAMover());
						break;
					case'D':
						linea1.moverDerecha(pedirDistanciaAMover());
						break;
				}
			case 2:
				System.out.println(linea1);
				break;
			case 3:
				System.out.println("HAS SELECCIONADO SALIR DEL MENU");
			}
		} while (opcion<1||opcion>3);
		
}
		
		
		public static int pedirDistanciaAMover() {
			int distanciaAMover;
			
			System.out.println("Introduce la distancia a cambiar: ");
			distanciaAMover=Integer.parseInt(teclado.nextLine());
			
			return distanciaAMover;
		}
	

}
