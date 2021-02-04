package ej1;

public class Refran {
	private String nombre;
	private int popularidad;
	
	public Refran(String nombre, int popularidad)throws RefranException {
		
		this.nombre = nombre;
		setPopularidad(popularidad);
	}

	
	public String toString() {
		return "Refran: " + nombre + ".Popularidad: " + popularidad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPopularidad() {
		return popularidad;
	}

	
	
	public int compareTo(Refran otro) {
		return Integer.compare(popularidad,otro.popularidad);
	}
	
	
	
	
	public void setPopularidad(int popularidad)throws RefranException {
		
		if(popularidad<0||popularidad>100) {
			throw new RefranException("Popularidad incorrecta "+popularidad);
		}
		
		this.popularidad = popularidad;
}
}
