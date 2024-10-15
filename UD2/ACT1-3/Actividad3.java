//The “Final programa” appears in the first line, and no in the last. 
//Use hilo.join(); in the main

package ejerciciosClase;

/**
 * The Class Actividad3.
 */
public class Actividad3 {

	/**
	 * Method that runs a Hilo3 and after the ejecution of the thread, prints Final programa.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Hilo3 hilo=new Hilo3();
		hilo.start();
		try {
			hilo.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Final programa");
	}

}
