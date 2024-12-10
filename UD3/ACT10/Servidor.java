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
import java.net.SocketException;

/**
 * The Class Servidor.
 */
public class Servidor {
	
	/** The Constant SERVERPORT. */
	final static int SERVERPORT = 12348;

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		try {
			DatagramSocket socket=new DatagramSocket(SERVERPORT);
			System.out.println("Esperando datagrama.......");
			byte[] buffer = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
            socket.receive(receivePacket);
            ByteArrayInputStream byteIn = new ByteArrayInputStream(receivePacket.getData());
            ObjectInputStream objectIn = new ObjectInputStream(byteIn);
            Tenista t = (Tenista) objectIn.readObject();
            System.out.println("Recibo el objeto: "+t.getApellido()+" "+t.getAltura());
            System.out.println("IP de origen: "+receivePacket.getAddress());
            System.out.println("Puerto de origen: "+receivePacket.getPort());
            t.setApellido("Karlovic");
            t.setAltura(208);
            System.out.println("Envío el objeto: "+t.getApellido()+" "+t.getAltura());
            ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
            ObjectOutputStream objectOut = new ObjectOutputStream(byteOut);
            objectOut.writeObject(t);
            byte[] dataToSend = byteOut.toByteArray();
            DatagramPacket sendPacket = new DatagramPacket(dataToSend, dataToSend.length, receivePacket.getAddress(), receivePacket.getPort());
            socket.send(sendPacket);
            System.out.println("Fin del servidor");
            socket.close();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
