package EJ3;
import java.util.Scanner;

public class Main {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		double precioSinIva=pedirPrecioProducto();
		int iva=pedirIva();
		
		Categoria categoria1=new Categoria("APERTIVOS",iva);
		Producto producto1;
		try {
			producto1 = new Producto("PATATAS FRITAS", precioSinIva, categoria1);
			producto1.añadirIva(precioSinIva, iva);
			System.out.println(producto1);
			
		} catch (ProdException e) {
			System.out.println(e.getMessage());
			
		}

		
		
		
	}
		public static int pedirIva(){
			int iva;
			
			System.out.println("Introduce el IVA a añadir: ");
			iva=Integer.parseInt(teclado.nextLine());
			
			return iva;
		}
		
		public static double pedirPrecioProducto() {
			double precioSinIva;
			
			System.out.println("Introduce el precio del producto: ");
			precioSinIva=Double.parseDouble(teclado.nextLine());
			
			return precioSinIva;
		}
	
}
