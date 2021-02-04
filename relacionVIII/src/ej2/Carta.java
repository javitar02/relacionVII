package ej2;
public class Carta {

	private int numero;
	private String palo;
	
	public Carta(int numero, String palo) throws CartaException{
		if(numero<1 || numero>12) {
			throw new CartaException("Error, las cartas van del 1 al 12"+numero);
		}
		this.numero = numero;
		
		if(!(palo.equals("OROS") || palo.equals("ESPADAS") || palo.equals("BASTOS") ||palo.equals("COPAS"))) {
			throw new CartaException("Error, palo incorrecto"+palo);
		}
		
		this.palo = palo;
	}
	public int getNumero() {
		return numero;
	}

	public String getPalo() {
		return palo;
	}
	@Override
	public String toString() {
		return "Carta: " + numero + " de "+ palo;
	}
	
	
	
	
}
