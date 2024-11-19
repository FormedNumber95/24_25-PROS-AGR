//Problem solving
// Only appears 1 address. Put the getAllByName and no the getByName
package ejerciciosClase;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * The Class Actividad1.
 */
public class Actividad1 {

	/**
	 * Method that runs the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
	
		System.out.println("Direcciones asociadas a Spotify:");
		System.out.println();
		try {
			InetAddress[] ad=InetAddress.getAllByName("www.spotify.com");
			for(InetAddress a:ad) {
				System.out.println(a);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
