package tarea1GitGui;

import java.util.ArrayList;

public class receta {

	String nombre;
	ArrayList<String> ingredientes = new ArrayList<String>();
	ArrayList<String> preparacion = new ArrayList<String>();
			
	public receta(String nombre, ArrayList<String> ingredientes, ArrayList<String> preparacion) {
		super();
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.preparacion = preparacion;
	}
	
	public receta(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public ArrayList<String> getPreparacion() {
		return preparacion;
	}

	public void setPreparacion(ArrayList<String> preparacion) {
		this.preparacion = preparacion;
	}
	
}
