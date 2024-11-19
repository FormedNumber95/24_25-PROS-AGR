//Problem solving
//I try to reuse the code of Actividad2, but it makes an error in the for. Remove the InetAddress.getAllByName(args[0]) and put InetAddress.getAllByName(address.getHostName()) 
package ejerciciosClase;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * The Class Actividad3.
 */
public class Actividad3 {

	/**
	 * Method that runs the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		InetAddress address=null;
		if(args.length==0) {
			try {
				address=InetAddress.getLocalHost();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
		}else {
			try {
				address=InetAddress.getByName(args[0]);
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Direccion IP:"+address.getHostAddress());
		System.out.println("Nombre:"+address.getHostName());
		try {
			for(InetAddress a:InetAddress.getAllByName(address.getHostName())){
				System.out.println(a);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
