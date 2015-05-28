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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: " + this.nombre + " Edad: " + this.edad;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 * El método equals() de Object hace == (compara las referencias)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Persona))
		{
			return false;
		}
		else
		{
			Persona p = (Persona)obj;
			return (this.edad == p.edad && this.nombre.equals(p.nombre));
		}
	}	
	// Interesante
	public boolean equals2(Object obj) {
		boolean dev= false;
		Persona p = null;
		// Primero las comprobaciones más sencillas (eficientes). (obj == this) descarta lo demás
		dev = (null!=obj)&&((obj == this)||((null!=(p=esTipoPersona(obj)))&&(contienenLoMismo(this, p))));
	
		return (dev);
	}
	
	private Persona esTipoPersona (Object obj)
	{
		Persona p = null;
		
		if (obj instanceof Persona) {
			 p = (Persona) obj;
		}
		
		return p;
		
	}
	
	private static boolean contienenLoMismo (Persona p1, Persona p2)
	{
		boolean contienen_lomismo = false;
		
		
		contienen_lomismo = (p1.nombre.equals(p2.nombre)&&(p1.edad==p2.edad));
		
		return contienen_lomismo;
	}
}
