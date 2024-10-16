//Error trying to use the start(). The start must be in Thread.start(); and no in Posicion.start()

package ejerciciosClase;

/**
 * The Class Actividad4.
 */
public class Actividad4 {
	
	/**
	 * Method that runs Posicion 2 times, one with the text "Primero" and the other with the text "Segundo".
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new Thread(new Posicion("Primero")).start();
		new Thread(new Posicion("Segundo")).start();
		System.out.println("Final Programa");
	}
	
}
