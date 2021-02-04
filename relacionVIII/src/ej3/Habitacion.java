package ej3;

public class Habitacion {
	private static final String HABITACION_SIMPLE = "simple";
	private static final String HABITACION_DOBLE = "doble";
	private static final String HABITACION_TRIPLE = "triple";
	private int numero;
	private String tipo;
	private boolean ocupada;
	
	
	public Habitacion(int numero, String tipo, boolean ocupada) {
		this.numero = numero;
		this.tipo = tipo;
		this.ocupada = ocupada;
	}

	public int getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}	
	
	
}
