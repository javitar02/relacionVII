package ej3;

public class Hotel {
	private static final int MINIMO_ESTRELLAS = 1;
	private static final int MAXIMO_ESTRELLAS = 5;
	private String nombre;
	private int estrellas;
	
	private Habitacion[] habitaciones;
	private int numHabitacionSimples;
	private int numHabitacionDobles;
	private int numHabitacionTriples;
	
	
	
	public Hotel(String nombre, int estrellas) throws HotelException {
		this.nombre = nombre;
		setEstrellas(estrellas);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEstrellas() {
		return estrellas;
	}
	public void setEstrellas(int estrellas) throws HotelException {
		if ( estrellas > MAXIMO_ESTRELLAS || estrellas < MINIMO_ESTRELLAS)
			throw new HotelException("Número de estrellas incorrecto " + estrellas);
		this.estrellas = estrellas;
	}
	@Override
	public String toString() {
		return "Hotel [nombre=" + nombre + ", estrellas=" + estrellas + "]";
	}
	
	
}


