package taller3.televisores;

public class Marca {
	private String nombre ;
	
	public Marca(String nombre ) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

    public String setNombre (String nomb) {
		nombre = nomb;
		return nombre;
	}
    
}
