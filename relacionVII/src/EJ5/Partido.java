package EJ5;

public class Partido {
	private static final int JORNADA_MAX = 38;
	public static final int JORNADA_MIN = 1;
	private int jornada;
	private int golesLocal;
	private int golesVisitante;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private char resultadoQuiniela;
	private boolean jugado;
	
	//Constructor
	public Partido(int jornada, Equipo equipoLocal, Equipo equipoVisitante) throws LigaException{
		this.equipoLocal=equipoLocal;
		this.equipoVisitante=equipoVisitante;
		
		
	
		setJornada(jornada);
		jugado=true;
		
		
		
	}
	//Metodos
	
	public void ponerResultado(String resultado) throws LigaException{
		
		String[]parts=resultado.split("-");
		String golLocal=parts[0];
		String golVisitante=parts[1];
		if(parts.length<2||parts.length>2) {
			throw new LigaException("Formato erroneo");
		}else {
			golesLocal=Integer.valueOf(golLocal);
			golesVisitante=Integer.valueOf(golVisitante);
			
			if(golesLocal<0||golesVisitante<0) {
				throw new LigaException("Error, no puede haber goles negativos"); 
			}else {
				if(golesLocal==golesVisitante) {
					resultadoQuiniela='X';
					
				}else {
					if(golesLocal>golesVisitante) {
						resultadoQuiniela='1';
						equipoLocal.incrementarPartidosGanados();
						setGolesLocales(golesLocal);
			
					}else {
						resultadoQuiniela='2';
						equipoVisitante.incrementarPartidosGanados();
						setGolesVisitantes(golesVisitante);
					}
				}
			}
		}
		
	
		
	}
	
	public int getGolesLocales() {
		
		return golesLocal;
	}
	
	public int getGolesVisitantes() {
		
		return golesVisitante;
	}
	
	public void setGolesLocales(int golesLocal) {
		int goles=0;
		if(golesLocal>0) {
			golesLocal=goles+golesLocal;
		}
				
	}
	
	public void setGolesVisitantes(int golesVisitante) {
		int goles=0;
		if(golesVisitante>0) {
			golesVisitante=goles+golesVisitante;
		}
	}
	
	
	public String toString(){
		String info;
		
		if(jugado=false) {
			info="El partido entre " +equipoLocal+ " y "+equipoVisitante+" no se ha disputado aun ";
		}else {
			info="Partido de la jornada " +jornada+" entre "+equipoLocal+ " y " + equipoVisitante+ 
					" jugado en la ciudad de "+equipoLocal.getCiudad()
					+" el estadio "+equipoLocal.getNombreEstadio()+". Ha finalizado con "+golesLocal+ 
					" goles locales y " +golesVisitante+ 
					" visitantes. El resultado de este partido en la "
					+ "quiniela es : "+resultadoQuiniela;
		}
		
		
		return info;
	}
	

	private void setJornada(int jornada) throws LigaException {
		if(jornada<JORNADA_MIN||jornada>JORNADA_MAX) {
			throw new LigaException("Error, los partidos se juegan entre la jornada 1 y la 38.");
		}else {
			this.jornada=jornada;
		}
		
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}
}
