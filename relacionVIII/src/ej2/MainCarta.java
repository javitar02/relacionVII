
package ej2;


import java.util.Random;
import java.util.Scanner;

public class MainCarta {
	private static Scanner teclado=new Scanner(System.in);
	public static final int NUM_CARTAS = 48;
	public static final int NUM_CARTAS_POR_PALO = 12;

	public static void main(String[] args) {
		
		int cartasPorJugador;
		String palo;
		
		try {
			Carta []baraja=new Carta[NUM_CARTAS];
			crearBaraja(baraja);
			tirarCartas(baraja);
			
			Carta[]cartasJugador1,cartasJugador2;
			
			do {
				System.out.println("¿Cuantas cartas repartimos a cada uno?");
				cartasPorJugador=Integer.parseInt(teclado.nextLine());	
			} while (cartasPorJugador<=0);
			
			
			cartasJugador1=darCartas(baraja,cartasPorJugador);
			cartasJugador2=darCartas(baraja, cartasPorJugador);
			
			mostrarCartas(cartasJugador1,cartasJugador2,baraja);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		
	}

	private static void mostrarCartas(Carta[] cartasJugador1,Carta []cartasJugador2,Carta []baraja) {
		int i;
		
		System.out.println("Cartas del jugador 1: ");
		for(i=0;i<cartasJugador1.length;i++) {
			System.out.println(cartasJugador1[i]);
		}
		System.out.println();
		
		System.out.println("Cartas del jugador 2: ");
		for(i=0;i<cartasJugador2.length;i++) {
			System.out.println(cartasJugador2[i]);
		}
		System.out.println();
		
		System.out.println("Hechemos un vistazo a la baraja");
		for(i=0;i<baraja.length;i++) {
			System.out.println(baraja[i]);
		}
		
	}
	
	
	private static Carta[] darCartas(Carta []baraja, int cartasPorJugador ) {
		Carta [] reparto=new Carta[cartasPorJugador];
		
		Random generarAleatorio=new Random();
		int i=0;
		int numero;
		
		while(i<reparto.length) {
			numero=generarAleatorio.nextInt(NUM_CARTAS);
			if(baraja[numero]!=null) {
				reparto[i]=baraja[numero];
				i++;
				baraja[numero]=null;
			}
		}
		return reparto;
	}
	
	private static Carta[] tirarCartas(Carta baraja[])throws CartaException {
		
		int i;
		String paloATirar;
		
		try {
			System.out.println("Introduce palo a descartar: ");
			paloATirar=teclado.nextLine();
			
			for(i=0;i<baraja.length;i++) {
				if(baraja[i].getPalo().contains(paloATirar)) {
					baraja[i]=null;
				}
				System.out.println(baraja[i]);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		return baraja;
		
	}
	

	private static void crearBaraja(Carta[] baraja) throws CartaException {
		int i;
		
			for(i=0;i<NUM_CARTAS_POR_PALO;i++) {
						baraja[i]=new Carta(i+1,"OROS");
						baraja[i+12]=new Carta(i+1,"ESPADAS");
						baraja[i+24]=new Carta(i+1,"BASTOS");
						baraja[i+36]=new Carta(i+1,"COPAS");	
			} 
		
		}
	

}