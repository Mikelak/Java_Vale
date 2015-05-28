package main;

public class Persona {

	private String nombre;
	private int edad;
	
	/**
	 * Crea un objeto Persona con nombre y edad
	 * @param nombre
	 * @param edad
	 */
	public Persona(String nombre, int edad)
	{
		this.nombre = nombre;
		this.edad = edad;
	}
	
	/**
	 * Devuelve el nombre de la persona
	 * @return String
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Asigna el nombre al objeto Persona
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Devuelve la edad
	 * @return int
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * Asigna la edad (int)
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
