package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serialización {

	public static void main(String[] args) 
	{
		serializaPersonas();
		// Obtenemos las Personas serializadas y comprobamos su estado
		try 
		{
			ObjectInputStream obj_entrada = new ObjectInputStream(new FileInputStream("objetos.dat"));
			System.out.println(((Persona)obj_entrada.readObject()).getNombre());
			System.out.println(((Persona)obj_entrada.readObject()).getNombre());
			System.out.println(((Persona)obj_entrada.readObject()).getNombre());
			// No es necesario cerrar el FileInputStream
			obj_entrada.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void serializaPersonas()
	{
		ArrayList<Persona> lista_personas = new ArrayList<Persona>();
		// Persona debe implementar la interfaz Serializable
		Persona p1 = new Persona("Pepe", 21);
		Persona p2 = new Persona("Juan", 23);
		Persona p3 = new Persona("Ildefonso", 99);		
		lista_personas.add(p1);
		lista_personas.add(p2);
		lista_personas.add(p3);
		
		try 
		{
			ObjectOutputStream obj_salida = new ObjectOutputStream(new FileOutputStream("objetos.dat"));
			for (Persona p : lista_personas)
			{
				obj_salida.writeObject(p);
			}
			// No es necesario cerrar el FileOutputStream
			obj_salida.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
