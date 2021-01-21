package EJ2;

public class Linea {
	private Punto puntoA;
	private Punto puntoB;
	
	public Linea(Punto puntoA, Punto puntoB) throws LineaException {
		if(puntoA.equals(puntoB)) {
			throw new LineaException("Error, no se puede crear una linea con las dos coordenadas iguales");
		}
		this.puntoA=puntoA;
		this.puntoB=puntoB;
	}

	public Punto getPuntoA() {
		return puntoA;
	}

	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}

	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}

	
	
	public void moverDerecha(int moverDerecha)throws LineaException {
		if(moverDerecha<0) {
			throw new LineaException("Error, no valen valores negativos");
		}
		this.puntoA.setX(this.puntoA.getX()+moverDerecha);
		this.puntoB.setX(this.puntoB.getX()+moverDerecha);
	}
	
	public void moverIzquierda(int moverIzquierda)throws LineaException {
		if(moverIzquierda<0) {
			throw new LineaException("Error, no valen valores negativos");
		}
		this.puntoA.setX(this.puntoA.getX()-moverIzquierda);
		this.puntoB.setX(this.puntoB.getX()-moverIzquierda);
	}
	
	public void moverArriba(int moverArriba)throws LineaException {
		if(moverArriba<0) {
			throw new LineaException("Error, no valen valores negativos");
		}
		this.puntoA.setY(this.puntoA.getY()+moverArriba);
		this.puntoB.setY(this.puntoB.getY()+moverArriba);
	}
	
	public void moverAbajo(int moverAbajo)throws LineaException {
		if(moverAbajo<0) {
			throw new LineaException("Error, no valen valores negativos");
		}
		this.puntoA.setY(this.puntoA.getY()-moverAbajo);
		this.puntoB.setY(this.puntoB.getY()-moverAbajo);
	}

	@Override
	public String toString() {
		return "Linea con coordenadas(" + puntoA + ") y ("+ puntoB +")";
	}
	
	
	
	
	
	
	
	
}
