package tarea1GitGui;

public class receta {

	String nombre;
	String ingredientes;
	String preparacion;
			
	public receta(String nombre, String ingredientes, String preparacion) {
		super();
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.preparacion = preparacion;
	}
	
	public receta(String nombre) {
		super();
		this.nombre = nombre;
	}
	
}
