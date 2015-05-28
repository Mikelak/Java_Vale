package main;

/**
 * 
 * 
 * @author Val
 *
 *El código de esta clase, es un poco misterioso. Algún programador Clase "C", no ha usado
 *nombres descriptivos y ahora, nos toca pegarnos y descubrir qué narices hace este código, 
 *para poder usarlo en nuestro proyecto.
 *
 *
 *Se pide:
 *
 *1) Adivinar la funcionalidad del método adivinaQueHace
 *2) Una vez descubierto, aplicar un nombre apropiado al método y a la clase
 *3) Idear un método equivalente, pero distinto. Es decir, crear un método 
 *que haga lo mismo que adivinaQueHace, pero de otra manera.
 *4) EXTRA: Sólo si resolviste los puntos anteriores, implementa una versión recursiva
 *
 */
public class Palindrome {
	
	private static boolean isPalindrome (String cad)
	{
		boolean bd = true;
		
		int i = 0;
		int j = cad.length()-1;
		
		while ((i<=j)&&(bd))
		{
			bd = cad.charAt(i)==cad.charAt(j);
			i++;
			j--;
		}
		
		return bd;
	}
	
	private static boolean myPalindrome(String cad)
	{
		// Hacemos un reverse de la cadena, y tiene que ser igual
		int longitud = cad.length();
		boolean bd = false;
		String nueva_cadena = "";
		
		for (int i = longitud - 1; i >= 0; i--)
		{
			nueva_cadena += cad.charAt(i);
		}	
		
		if (cad.equals(nueva_cadena))
			bd = true;
		
		return bd;
	}
	
	private static boolean recursivePalindrome(String cad)
	{
		
		return false;
	}
	
	private static boolean llamadaRecursiva(String cad, int num)
	{
		// if (cad.charAt(num) == cad.charAt(index))
		return false;
	}
	
	public static void main(String[] args) {
		if (myPalindrome("poiop"))
		{
			System.out.println("VERDADERO");
		} 
		else 
		{
			System.out.println("FALSO");
		}
	}
}
