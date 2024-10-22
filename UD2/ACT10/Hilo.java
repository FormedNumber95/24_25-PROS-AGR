package ejerciciosClaseUD2;

// TODO: Auto-generated Javadoc
/**
 * The Class Hilo.
 */
public class Hilo extends Thread {
	
	/** The text. */
	String text;
	
	/**
	 * Instantiates a new hilo.
	 *
	 * @param text the text
	 */
	public Hilo(String text) {
		this.text=text;
	}
	
	/**
	 * Show in the console the text "Ejecutando "+the text given in the constructor.
	 */
	public void run(){
		System.out.println("Ejecutando "+text);
	}
}