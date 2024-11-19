//Problem solving
//An error message appears when i try to run the program without parameters. I had bad written the condition of the if
package ejerciciosClase;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * The Class Actividad2.
 */
public class Actividad2 {

	/**
	 * Method that runs the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		if(args.length==0) {
			System.out.println("Se necesita una URL para obtener su dirección");
			System.out.println();
		}else {
			System.out.println("Las direcciones asociadas a "+args[0]+":");
			try {
				for(InetAddress a:InetAddress.getAllByName(args[0])){
					System.out.println(a);
				}
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
		}

	}

}
