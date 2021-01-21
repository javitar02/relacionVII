package EJ3;

public class Producto {
	private int codigo;
	private String descripcion;
	private double precioSinIva;
	private Categoria categoria;
	private static int siguienteCodigoADar=1;
	
	
	public Producto(String descripcion, double precioSinIva,Categoria categoria) throws ProdException {
		this.codigo=siguienteCodigoADar;
		siguienteCodigoADar++;
		
		this.descripcion = descripcion;
		
		if(precioSinIva<=0) {
			throw new ProdException("Error en el precio "+precioSinIva);
		}else {
			this.precioSinIva = precioSinIva;
		}
		
		this.categoria=categoria;
	}
	
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioSinIva() {
		return precioSinIva;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Producto con codigo"+ codigo + ", descripcion " + descripcion + " y cuyo "
				+ " precio sin iva es " + precioSinIva
				+ " Su categoria es " + categoria;
	}
	
	public double añadirIva(double precioSinIva,int iva) {
		double precioConIva;
		double indiceVariacion=(Main.pedirIva()/100)+1;
		
		precioConIva=precioSinIva*indiceVariacion;
		
		return precioConIva;
	}
}



	


