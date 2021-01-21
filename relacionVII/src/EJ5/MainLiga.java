package EJ5;

public class MainLiga {

	public static void main(String[] args) {
		Equipo betis=new Equipo("REAL BETIS","Benito Villamarin","SEVILLA");
		Equipo realMadrid=new Equipo("REAL MADRID","Santiago Bernabeu","MADRID");
		Equipo barcelona=new Equipo("FC BARCELONA","Camp Nou","BARCELONA");
		Equipo sevilla=new Equipo("SEVILLA FC","Sanchez Pizjuan","SEVILLA");
		
		
		try {
			
			Partido partido1=new Partido(6,sevilla,betis);
			partido1.ponerResultado("2-1");
			System.out.println(partido1);
			
			
			
			
			//Partido partido2=new Partido(2,barcelona,barcelona);
			//partido2.ponerResultado("0-0");
			//System.out.println(partido2);
			
			
			//Partido partido3=new Partido(2,barcelona,sevilla);
			//partido3.ponerResultado("1-2");
			//System.out.println(partido3);
			
			
			//Partido partido4=new Partido(12,realMadrid,barcelona);
			//partido4.ponerResultado("4-3");
			//System.out.println(partido4);
			
			
			//Partido partido5= new Partido(32,sevilla,barcelona);
			//partido5.ponerResultado("0-2");
			//System.out.println(partido5);
			
			
			//System.out.println(betis);
			//System.out.println(realMadrid);
			//System.out.println(barcelona);
			//System.out.println(sevilla);
			
		} catch (LigaException e) {
			e.getMessage();
		}
	}


	}


