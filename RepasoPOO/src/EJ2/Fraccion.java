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
	
	public Fraccion() {
		
	}


	public int getNumerador() {
		return numerador;
	}


	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}


	public int getDenominador() {
		return denominador;
	}


	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}


	public boolean equals(Fraccion otraFraccion) {
		boolean esIgual=false;
		
		if(numerador%otraFraccion.numerador==1){
			
		}
		
		
		return esIgual;
		
	}
	

	public Fraccion sumar(Fraccion FraccionASumar) {
		Fraccion resultado = new Fraccion();
		
		
		
		return resultado;
	}
	
	public Fraccion restar(Fraccion fraccionARestar) {
		Fraccion resultado=new Fraccion();
		
		
		return resultado;
	}
	
	
	public Fraccion multiplicar(Fraccion fraccionAMultiplicar) {
		Fraccion resultado=new Fraccion();
		
		resultado.numerador=numerador*fraccionAMultiplicar.numerador;
		resultado.denominador=denominador*fraccionAMultiplicar.denominador;
		
		return resultado;
	}
	
	public Fraccion dividir(Fraccion fraccionADividir) {
		Fraccion resultado = new Fraccion();
		
		resultado.numerador=numerador*fraccionADividir.denominador;
		resultado.denominador=denominador*fraccionADividir.numerador;
		
		
		return resultado;
	}
	
	public void simplificar(Fraccion fraccionASimplificar) {
		int i=1;
		
		while(fraccionASimplificar.numerador>=1 ||fraccionASimplificar.denominador>=1) {
			
		}
		
		
		
	}


	@Override
	public String toString() {
		return "Fraccion(" + numerador + "/" + denominador+")";
	}
}
