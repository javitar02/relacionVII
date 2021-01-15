package EJ4;

public class Jarra {

	private int capacidad;
	private int cantidad;
	private static int totalAguaConsumida;

	public Jarra(int capacidad) throws JarraException {
		if (capacidad < 0) {
			throw new JarraException("Error, no puede haber capacidades negativas" + capacidad);
		}
		this.capacidad = capacidad;
	}

	public int getCapacidad() {

		return capacidad;
	}

	public int getCantidad() {

		return cantidad;
	}

	public static int totalAguaConsumida() {

		return totalAguaConsumida;
	}

	public String toString() {
		String info = "La jarra contiene " + capacidad + " litros de capacidad y le quedan " + cantidad
				+ " litros de agua.";

		return info;
	}

	public void llenar() {

		totalAguaConsumida = (capacidad - cantidad) + totalAguaConsumida;
		cantidad = capacidad;

	}

	public void vaciar() {
		cantidad = 0;
	}

	public void setVolcarJarra(Jarra jarra2) {
		int cantidadAVolcar = cantidad + jarra2.cantidad;
		if (cantidadAVolcar > jarra2.capacidad) {
			if(capacidad>jarra2.capacidad) {
				jarra2.cantidad = jarra2.capacidad;
				cantidad = capacidad - jarra2.capacidad;
			}

		} else {
			if (cantidadAVolcar > capacidad) {
				if(jarra2.cantidad>capacidad) {
				cantidad = capacidad;
				jarra2.cantidad = jarra2.capacidad - capacidad;
			}
			}
		}
	}
}
