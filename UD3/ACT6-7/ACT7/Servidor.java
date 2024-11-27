//Problem solving
//I don't control that you only can connect 3 times. Remove the local i variable and use a for loop
package ejercicio7_UD3;

import java.io.DataOutputStream;
import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * The Class Servidor.
 */
public class Servidor {
	
	/**
	 * Method that creates a server in the port 6013.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println("Esperando a los clientes.....");
		try {
			ServerSocket s=new ServerSocket(6013);
			for(int i=1;i<4;i++) {
				Socket cli=s.accept();
			DataOutputStream dos=new DataOutputStream(cli.getOutputStream());
			dos.writeUTF("Hola cliente "+i);
			dos.close();
			cli.close();
			}
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}