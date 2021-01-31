package EJ1;

public class MonroyPet {
	public static final int MAX__CONTROL_PARENTAL = 100;
	public static final int PTS_POR_MINUTO_JUGADO = 3;
	public static final int PTS_POR_ALIMENTO_COMPRADO = 30;
	//Atributos
	public static final int COMIDA_INICIAL = 2;
	public static final int PUNTOS_INICIALES = 0;
	private String tipo;
	private String nombre;
	private String tipoComida;
	private int puntos;
	private int comida;
	private static int totalJugadoEntreMascotas = 0;
	
	//Constructor
	public MonroyPet(String tipo, String nombre) throws MonroyPetException {
		if (tipo.equals("PERRO") || tipo.equals("GATO")) {
			throw new MonroyPetException("Error, tipo de mascota incorrecto");
		}
		this.tipo = tipo;
		this.nombre = nombre;
		this.puntos = PUNTOS_INICIALES;
		this.comida = COMIDA_INICIAL;
		
	}
	
	//Metodos
	public String getTipo() {
		return tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public int getComida() {
		return comida;
	}
	
	public static int getTotalJugadoEntreMascotas() {
		return totalJugadoEntreMascotas;
	}

	@Override
	public String toString() {
		
		return "Su mascota de tipo " + tipo + ", cuyo nombre es " + nombre + ", y que ha obtenido " + puntos
				+ ". Le quedan" + comida + " "+tipoComida;
	}
	

	public void darComida() throws MonroyPetException{
		if(comida==0) {
			throw new MonroyPetException("Error, no tienes comida en el almacén");
		}
		comida--;
		
	}
	
	public boolean equals(MonroyPet otro) {
		boolean esIgual=false;
		
		if(nombre.equals(otro.nombre)&&tipo.equals(otro.tipo)){
			esIgual=true;
		}
		
		return esIgual;
	}


	public void comprarComida() throws MonroyPetException{
		int alimentosAComprar = 0;
		int puntosNecesarios;
		
		if(puntos<PTS_POR_ALIMENTO_COMPRADO) {
			throw new MonroyPetException("Error, puntos insuficientes para comprar alimentos");
		}
		puntosNecesarios=alimentosAComprar*PTS_POR_ALIMENTO_COMPRADO;
		
		if(alimentosAComprar<=0) {
			throw new MonroyPetException("Error, no puede haber alimentos negativos");
		}
		
		puntos=puntos-puntosNecesarios;
		comida=comida+ alimentosAComprar;
		
		
	}
	
	public void jugar(int minutos)throws MonroyPetException {
		
		if(minutos>=20) {
			throw new MonroyPetException("Ha llegado al limite diario de 20 min de juego");
		}
	
		puntos=PUNTOS_INICIALES+(minutos*PTS_POR_MINUTO_JUGADO);
		
		if(totalJugadoEntreMascotas>=MAX__CONTROL_PARENTAL){
			throw new MonroyPetException("Superado el control parental");
		}
			totalJugadoEntreMascotas=totalJugadoEntreMascotas+minutos;
	}
	
	public String comidaMascota(String tipo) {
		String tipoComida = null;
		
		if(tipo=="GATO") {
			tipoComida="pescado";
		}else {
			if(tipo=="PERRO") {
				tipoComida="huesos";
			}
		}
		
		return tipoComida;
		
	}

}
