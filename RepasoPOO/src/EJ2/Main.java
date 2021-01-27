package EJ2;

public class Main {

	public static void main(String[] args) {
		try {
			Fraccion fraccion1=new Fraccion(1,0);
		} catch (FraccionException e) {
			e.getMessage();
		}
	}

}
