package ejerciciosClase;

/**
 * The Class Posicion.
 */
public class Posicion implements Runnable {
	
	/** The text. */
	String text;
	
	/**
	 * Instantiates a new posicion.
	 *
	 * @param text the text
	 */
	public Posicion(String text) {
		this.text=text;
	}
	
	/**
	 * show 15 times the text + the iteration number (starting in 1).
	 */
	public void run() {
		for (int i=1;i<16;i++)
			System.out.println( text+" "+ i );
	}
}

