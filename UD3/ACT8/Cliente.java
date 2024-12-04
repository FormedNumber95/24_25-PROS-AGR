//Problem solving
//The connection between the cliente and the servidor doesn't work. Restarting Eclipse the error disappears
package ejercicio8_UD3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * The Class Cliente.
 */
public class Cliente {
	
	/** The Constant SERVERPORT. */
	final static int SERVERPORT=12346;
	
	/** The Constant CLIENTPORT. */
	final static int CLIENTPORT=34568;
	
	/** The Constant NUMBER. */
	final static byte NUMBER=4;
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		try {
			DatagramSocket clientSocket=new DatagramSocket(CLIENTPORT);
			byte[] sendData = String.valueOf(NUMBER).getBytes();
			InetAddress serverAddress = InetAddress.getByName("localhost");
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, SERVERPORT);
            clientSocket.send(sendPacket);
            System.out.println("Esperando respuesta...");
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);
            String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
            String simbolo="-";
            if(NUMBER>0) {
            	simbolo="+";
            }
            System.out.println("Esperando respuesta...: el cubo de "+simbolo+" " + Math.abs(NUMBER) + " es " + response);
            System.out.println("Adiós…");
            clientSocket.close();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
