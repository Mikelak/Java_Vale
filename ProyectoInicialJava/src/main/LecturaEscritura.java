package main;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class LecturaEscritura {

	private File archivo;
	private FileReader lector;
	private FileWriter escritor;
	private BufferedReader buff_lector;
	private BufferedWriter buff_escritor;
	// No es la forma más lógica. Crear en casa los métodos que recibirán el archivo y lo crean y cierran,
	// y así se puede reutilizar la clase para más archivos. 
	public LecturaEscritura(String nom_archivo) 
	{
		this.archivo = new File(nom_archivo);
		try 
		{
			// this.lector = new FileReader(this.archivo);
			this.lector = new FileReader(nom_archivo);
			// this.escritor = new FileWriter(this.archivo);			
			this.buff_lector = new BufferedReader(this.lector);
			// this.buff_escritor = new BufferedWriter(this.escritor);
		}
		catch (FileNotFoundException fnf)
		{
			fnf.printStackTrace();
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}

	public static void main(String[] args) 
	{
		LecturaEscritura le = new LecturaEscritura("Documentorl.txt");
		String[] array;
		try {
			array = le.ficheroToArray();
			for (String str : array)
				System.out.println(str);	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}
	
	public boolean arrayToFichero(String[] array)
	{
		boolean result = true;
		try 
		{
			for (String str : array)
			{
				this.buff_escritor.write(str);					
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
			result = false;
		}
		return result;
	}
	
	public String[] ficheroToArray() throws FileNotFoundException 
	{
//		long lines = this.buff_lector.lines().count();
//		// +1 para guardar el null
//		String[] lectura = new String[(int)lines+1];
//		
//		try
//		{
//			for (int i = 0; (lectura[i] = this.buff_lector.readLine()) != null; ++i);
//		}
//		catch (IOException ioe)
//		{
//			ioe.printStackTrace();
//		}
//		
//		return lectura;
		// BufferedReader reader = new BufferedReader(new FileReader("Documentorl.txt"));
		// Stream<String> flujo = reader.lines();
		Stream<String> flujo = this.buff_lector.lines();		
		Object[] lectura = flujo.toArray();
		String[] str_lectura = Arrays.copyOf(lectura, lectura.length, String[].class);
		
		return str_lectura;
	}
	
	private boolean closeFlujos()
	{
		boolean success = true;
		try
		{
			this.lector.close();
			this.escritor.close();
			this.buff_lector.close();
			this.buff_escritor.close();
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
			success = false;
		}
		return success;
	}
}
