//Problem solving
//when you run the 4th time the app, an excetion message appears, not the expected one. Change the e.printStackTrace() for System.out.println("Connection refused: connect");
package ejercicio7_UD3;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * The Class Cliente.
 */
public class Cliente {
	
	/**
	 * Method that creates the client of the server.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println("PROGRAMA CLIENTE INICIANDO");
		try {
				Socket s=new Socket("localhost", 6013);
				//hacer consulta
				DataInputStream dis=new DataInputStream(s.getInputStream());
				System.out.println("Recibiendo mensaje del servidor:");
				System.out.println(dis.readUTF());
				dis.close();
				s.close();
		} catch (IOException e) {
			System.out.println("Connection refused: connect");
		}
	}
}