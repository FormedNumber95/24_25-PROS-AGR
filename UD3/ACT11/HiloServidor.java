//Problem solving
//The return of the input is the same of the received input. I forgot to assign the new value to the variable
package ejercicio11_UD3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * The Class HiloServidor.
 */
public class HiloServidor extends Thread{
	
	/** The s. */
	private Socket s;
	
	/**
	 * Instantiates a new hilo servidor.
	 *
	 * @param s the s
	 */
	public HiloServidor(Socket s) {
		this.s=s;
	}
	
	/**
	 * Run.
	 */
	@Override
	public void run() {
		System.out.println("Cliente Conectado.....");
		try {
			DataInputStream dis=new DataInputStream(s.getInputStream());
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			while(true) {
				String input=dis.readUTF();
				System.out.println("Comunico con: Socket[addr="+s.getInetAddress()+",port="+s.getPort()+",localport="+s.getLocalPort()+"]");
				input=input.toUpperCase();
				dos.writeUTF(input);
				if(input.equals("*")) {
					System.out.println("Fin de la conexión con: Socket[addr="+s.getInetAddress()+",port="+s.getPort()+",localport="+s.getLocalPort()+"]");
					break;
				}
			}
			dis.close();
			dos.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
