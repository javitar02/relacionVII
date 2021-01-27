package EJ2;

public class Fraccion {
	//Atributos
	private int numerador;
	private int denominador;
	
	public Fraccion(int numerador, int denominador) throws FraccionException {
		this.numerador = numerador;
		
		if(denominador==0) {
			throw new FraccionException("Error, el denominador no puede ser 0");
		}
		this.denominador = denominador;
	}
	
	
	public boolean equals(Fraccion otraFraccion) {
		
		
		return false;
		
	}
	
	

	public Fraccion sumar(Fraccion fraccionASumar) {
		Fraccion resultado = null;
		
		
		
		return resultado;
	}
	
	public Fraccion restar(Fraccion fraccionARestar) {
		Fraccion resultado = null;
		
		return resultado;
	}
	
	public Fraccion multiplicar(Fraccion fraccionAMultiplicar) {
		Fraccion resultado = null;
		
		return resultado;
	}
	
	public Fraccion dividir(Fraccion fraccionADividir) {
		Fraccion resultado = null;
		
		return resultado;
	}
	
	public void simplificar(Fraccion fraccionASimplificar) {
		
		
		
		
		
	}
}
