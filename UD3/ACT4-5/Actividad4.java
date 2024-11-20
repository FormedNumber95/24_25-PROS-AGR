//Problem solving
// I make the Visualizar(URI uri) but i give a String like the parameter. Create a new URI in the constructor of Visualizar in the main method
package ejerciciosClase;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * The Class Actividad4.
 */
public class Actividad4 {

	/**
	 * Method that runs the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		try {
			Visualizar(new URI("http://docs.oracle.com"));
			Visualizar(new URI("http://docs.oracle.com/javase/7"));
			Visualizar(new URI("http://docs.oracle.com/javase/7/docs/api/java/net/URL.html"));
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * Method that shows the information.
	 *
	 * @param uri the uri
	 */
	private static void Visualizar(URI uri) {
		System.out.println("URI: "+uri);
		System.out.println("\tHost: "+uri.getHost());
		System.out.println("\tPort: "+uri.getPort());
		System.out.println("\tPath: "+uri.getPath());
		System.out.println("\tScheme: "+uri.getScheme());
		System.out.println("\tAuthority: "+uri.getAuthority());
	}

}
