package EJ5;

public class Equipo {
	// Atributos
			private String nombreEquipo;
			private String nombreEstadio;
			private String ciudad;
			private int partidosGanados;

			// Constructor
			public Equipo(String nombreEquipo, String nombreEstadio, String ciudad) {
				this.nombreEquipo = nombreEquipo;
				this.nombreEstadio = nombreEstadio;
				this.ciudad = ciudad;
				this.partidosGanados = 0;
			}

			// M�todos get
			public String getNombreEquipo() {
				return nombreEquipo;
			}

			public String getNombreEstadio() {
				return nombreEstadio;
			}

			public void setNombreEstadio(String nombreEstadio) {
				this.nombreEstadio = nombreEstadio;
			}

			public String getCiudad() {
				return ciudad;
			}

			public void setCiudad(String ciudad) {
				this.ciudad = ciudad;
			}

			public int getPartidoGanados() {
				return partidosGanados;
			}

			// M�todos set
			public void setNombreEquipo(String nombreEquipo) {
				this.nombreEquipo = nombreEquipo;
			}

			@Override
			public String toString() {
				return  nombreEquipo + " que juega en el estadio " + nombreEstadio + " de la ciudad de " + ciudad
						+ " .En total ha ganado "+partidosGanados+" partidos";
			}
			
			/**
			 * Determina si dos equipos son iguales (tienen el mismo nombre).
			 * @param otroEquipo Equipo con el que comparar.
			 * @return true si son iguales.
			 */
			
			public boolean equals(Equipo otroEquipo) {
				boolean esIgual = false;
				if (this.nombreEquipo.equals(otroEquipo.nombreEquipo)) {
					esIgual = true;
				}
				return esIgual;
			}

			/**
			 * Incrementa en uno los partidos ganados por el Equipo.
			 */
			public void incrementarPartidosGanados() {
				this.partidosGanados++;
			}

			
}
