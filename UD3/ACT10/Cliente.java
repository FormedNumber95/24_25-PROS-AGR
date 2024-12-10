//Problem solving
//The connection between the Cliente and the Servidor don't work. I had the port 12348 in the client and the port 12348 in the server
package ejercicio10_UD3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
	final static int SERVERPORT=12348;
	
	/** The Constant CLIENTPORT. */
	final static int CLIENTPORT=34567;
	
	/**
	 * Method that creates a Tenista and send it to the server. Later it receive a Tenista and prints the both attributes
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		try {
			Tenista t=new Tenista("del Potro", 198);
			DatagramSocket clientSocket=new DatagramSocket(CLIENTPORT);
			InetAddress serverAddress = InetAddress.getByName("localhost");
			ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
			ObjectOutputStream oos=new ObjectOutputStream(byteOut);
			oos.writeObject(t);
			byte[] dataToSend = byteOut.toByteArray();
			DatagramPacket sendPacket = new DatagramPacket(dataToSend, dataToSend.length, serverAddress, 12348);
			clientSocket.send(sendPacket);
			System.out.println("Envío el objeto: "+t.getApellido()+" "+t.getAltura());
			System.out.println("Esperando datagrama.......");
			byte[] buffer = new byte[1024];
	        DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
	        clientSocket.receive(receivePacket);
	        ByteArrayInputStream byteIn = new ByteArrayInputStream(receivePacket.getData());
            ObjectInputStream objectIn = new ObjectInputStream(byteIn);
            t=(Tenista) objectIn.readObject();
            System.out.println("He recibido el objeto: "+t.getApellido()+" "+t.getAltura());
            System.out.println("Fin del cliente");
            clientSocket.close();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
