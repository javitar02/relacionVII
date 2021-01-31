package EJ1;
import java.util.Scanner;

public class Main {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
			MonroyPet mascota1;
			MonroyPet mascota2;
			try {
				mascota1 = new MonroyPet("PERRO", "DORAEMON");
				mascota2=new MonroyPet("GATO","TOBY");
				mostrarMenu(mascota1,mascota2);
			} catch (MonroyPetException e) {
				
				e.printStackTrace();
			}
		
			
	
		}
		
	
	
	public static void mostrarMenu(MonroyPet mascota1,MonroyPet mascota2) {
		int opcionMenu;
		int opcionMascota;
		int alimentosAComprar;
		int minutos;
		
		System.out.println("--BIENVENIDO AL MENU--");
		System.out.println("1-Dar de comer a tu mascota");
		System.out.println("2-Comprar comida para tu mascota");
		System.out.println("3-Solicite con cual mascota quiere jugar y los minutos que va a hacerlo");
		System.out.println("4-Mostrar informacion sobre ambas mascotas");
		System.out.println("5-Salir");
		
		do {
			System.out.println("Introduce una opcion: ");
			opcionMenu=Integer.parseInt(teclado.nextLine());
		} while (opcionMenu<1||opcionMenu>5);
		
		switch(opcionMenu) {
			case 1:
				System.out.println("Introduce a que mascota quiere dar de comer(1-2): ");
				opcionMascota=Integer.parseInt(teclado.nextLine());
				
				if(opcionMascota==1) {
					try {
						mascota1.darComida();
					} catch (MonroyPetException e) {
						e.printStackTrace();
					}
				}else {
					try {
						mascota2.darComida();
					} catch (MonroyPetException e) {
						e.printStackTrace();
					}
				}break;
				
			case 2:
				System.out.println("Introduce a que mascota quiere comprar comida(1-2): ");
				opcionMascota=Integer.parseInt(teclado.nextLine());
				
				if(opcionMascota==1) {
					try {
						mascota1.comprarComida();
					} catch (MonroyPetException e) {
						e.printStackTrace();
					}
				}else {
					try {
						mascota2.comprarComida();
					} catch (MonroyPetException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Introduce cuanta comida quieres comprar: ");
				alimentosAComprar = Integer.parseInt(teclado.nextLine());
				break;
				
			case 3:
				System.out.println("Introduce los minutos a jugar: ");
				minutos=Integer.parseInt(teclado.nextLine());
						
				System.out.println("Introduce con que mascota quiere jugar (1-2): ");
				opcionMascota=Integer.parseInt(teclado.nextLine());
				
				if(opcionMascota==1) {
					try {
						mascota1.jugar(minutos);
					} catch (MonroyPetException e) {
						e.printStackTrace();
					}
				}else {
					try {
						mascota2.jugar(minutos);
					} catch (MonroyPetException e) {
						e.printStackTrace();
					}
				}break;
				
			case 4:
				System.out.println(mascota1);
				System.out.println(mascota2);
				break;
				
				
			case 5:
				System.out.println("HAS SELECCIONADO SALIR, QUE PASE UN BUEN DIA");				
			}
			
		}
				
	}
		
		
		
	

	
	

