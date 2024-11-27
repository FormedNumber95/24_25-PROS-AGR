//Problem solving
//The client and the server doesn't connect well. I have write() and not writeInt() and the same with the read()/readInt() of the server
package ejerciciosUD3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * The Class Servidor.
 */
public class Servidor {
	
	/**
	 * Method that creates a server in the port 6010.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println("Esperando al cliente.....");
		try {
			ServerSocket s=new ServerSocket(6010);
			Socket cli=s.accept();
			DataInputStream dis=new DataInputStream(cli.getInputStream());
			int num=dis.readInt();
			DataOutputStream dos=new DataOutputStream(cli.getOutputStream());
			dos.writeInt(num*num);
			dos.close();
			dis.close();
			cli.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}