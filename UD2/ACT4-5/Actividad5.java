//The sleep(100) doesn’t work. Put the sleep(100) inside the loop
package ejerciciosClase;

/**
 * The Class Actividad5.
 */
public class Actividad5 {
	
	/**
	 * Method that runs the Primero and Segundo classes.
	 *
	 * @param arg the arguments
	 */
	public static void main(String arg[]) {
		Primero p = new Primero();
		Segundo s = new Segundo();
		p.start();
		s.start();
		System.out.println("Fin programa");
	}
}
