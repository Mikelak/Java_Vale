// Como nombre de paquete, suele utilizarse primero el nombre de la empresa
package main;

public class PrimeraClase {

	// El modificador por defecto es package protected

	public static void main(String[] argumentos) 
	{
		Persona persona1 = new Persona("Pepe", 40);
		Persona persona2 = new Persona("Pepe", 40);
		Persona persona3 = new Persona("Juan", 50);
		
		if (persona3.equals(new String()))
		{
			System.out.println("Iguales");
		}
		else
		{
			System.out.println("No iguales");
		}
	}
}
