package EJ1;

public class MonroyPet {
	//Atributos
	public static final int COMIDA_INICIAL = 2;
	public static final int PUNTOS_INICIALES = 0;
	private String tipo;
	private String nombre;
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
				+ ". Su comida es " + comida;
	}
	

	public void darComida() throws MonroyPetException{
		
		
		
		
		
		
	}
	



	public void comprarComida() throws MonroyPetException{
		
		
		
		
		
	}
	
	public void jugar(int minutos)throws MonroyPetException {
		
		
		
		
		
		
		
	}
	
	

}
