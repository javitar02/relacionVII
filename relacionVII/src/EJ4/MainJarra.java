package EJ4;

import java.util.Scanner;

public class MainJarra {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int capacidad;
		int opcion;

		Jarra jarra1;
		Jarra jarra2;

		try {
			capacidad = MainJarra.pedirCapacidad();
			jarra1 = new Jarra(capacidad);

			capacidad = MainJarra.pedirCapacidad();
			jarra2 = new Jarra(capacidad);

			do {
				opcion = mostarMenu();
				MainJarra.tratarMenu(jarra1, jarra2, opcion);
			} while (opcion != 6);
		} catch (JarraException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void tratarMenu(Jarra jarra1, Jarra jarra2, int opcion) {
		char respuesta;
		switch (opcion) {
		case 1:
			System.out.println("¿Qué jarra desea llenar? (A/B)");
			respuesta = teclado.nextLine().charAt(0);
			if (respuesta == 'A') {
				jarra1.llenar();
			} else {
				if (respuesta == 'B') {
					jarra2.llenar();
				}
			}
			break;
		case 2:
			System.out.println("¿Qué jarra desea vaciar? (A/B)");
			respuesta = teclado.nextLine().charAt(0);
			respuesta=Character.toLowerCase(respuesta);
			if (respuesta == 'A') {
				jarra1.vaciar();
			} else {
				if (respuesta == 'B') {
					jarra2.vaciar();
				}
			}
			break;
		case 3:
			jarra1.setVolcarJarra(jarra2);
			break;
		case 4:
			jarra2.setVolcarJarra(jarra1);
			break;
		case 5:
			System.out.println(jarra1);
			System.out.println(jarra2);
			System.out.println("Se han consumido " + Jarra.totalAguaConsumida() + " litros de agua");
			break;
		}
	}

	public static int mostarMenu() {
		int opcion;

		do {
			System.out.println("--BIENVENIDO AL MENU--");
			System.out.println("1.Llenar jarra");
			System.out.println("2.Vaciar jarra");
			System.out.println("3.Volcar jarra A en B");
			System.out.println("4.Volcar jarra B en A");
			System.out.println("5.Ver estado de las jarras");
			System.out.println("6.Salir");
			System.out.println("Introduce una opcion: ");
			opcion = Integer.parseInt(teclado.nextLine());
			System.out.println();
		} while (opcion < 1 || opcion > 6);
		return opcion;
	}

	private static int pedirCapacidad() {
		int capacidad;
		do {
			System.out.println("Introduce la capacidad de la jarra: ");
			capacidad = Integer.parseInt(teclado.nextLine());
		} while (capacidad <= 0);

		return capacidad;
	}

}
