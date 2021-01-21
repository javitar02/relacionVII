package EJ3;

public class Categoria {
	
	private String nombreCategoria;
	private int iva;
	
	public Categoria(String nombreCategoria, int iva)  {
		
		this.nombreCategoria = nombreCategoria;
		this.iva = iva;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public int getIva () {
		
		return iva;
	}
		
	
	
}
