//Problem solving
// I can't connect to the Cliente. I had the port 6013 and no the 6000
package ejercicio11_UD3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * The Class Servidor.
 */
public class Servidor {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		try {
			ServerSocket server=new ServerSocket(6000);
			while(true) {
				Socket s=new Socket();
				s=server.accept();
				HiloServidor hilo=new HiloServidor(s);
				hilo.start();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
