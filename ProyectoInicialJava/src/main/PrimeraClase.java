// Como nombre de paquete, suele utilizarse primero el nombre de la empresa
package main;

public class PrimeraClase {

	// El modificador por defecto es package protected
	public int calcula() {
		return 1 + 1;
	}

	public static void main(String[] argumentos) {
		PrimeraClase p_clase = new PrimeraClase();
		System.out.println(p_clase.calcula());
	}
}
