package tarea1GitGui;

import java.util.ArrayList;

public class receta {

	String nombre;
	ArrayList<Ingredientes> ingredientes = new ArrayList<Ingredientes>();
	ArrayList<String> preparacion = new ArrayList<String>();
	String autor;
	int personas = 4;
	
	public receta(String nombre, ArrayList<Ingredientes> ingredientes, ArrayList<String> preparacion) {

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

	public ArrayList<Ingredientes> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public ArrayList<String> getPreparacion() {
		return preparacion;
	}

	public void setPreparacion(ArrayList<String> preparacion) {
		this.preparacion = preparacion;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPersonas() {
		return personas;
	}

	public void setPersonas(int personas) {
		this.personas = personas;
	}
	
	public receta recetaPara(int personas) {
		receta nueva = new receta(this.getNombre());
		nueva.setAutor(this.getAutor());
		nueva.setPersonas(personas);
		nueva.setPreparacion(this.getPreparacion());
		ArrayList<Ingredientes> ing = this.getIngredientes();
		double factor = personas/this.getPersonas();
		for(Ingredientes i:ing) {
			i.setCantidad((float) (i.getCantidad()*factor));
		}
		nueva.setIngredientes(ing);
		return nueva;
	}
}
