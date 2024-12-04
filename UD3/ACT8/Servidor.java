//Problem solving
//The connection between the cliente and the servidor doesn't work. Restarting Eclipse the error disappears
package ejercicio8_UD3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * The Class Servidor.
 */
public class Servidor {
	
	 /** The Constant SERVERPORT. */
 	final static int SERVERPORT = 12346;
	
	 /**
 	 * The main method.
 	 *
 	 * @param args the arguments
 	 */
 	public static void main(String[] args) {
         
		try {
			DatagramSocket serverSocket=new DatagramSocket(SERVERPORT);
			 System.out.println("Esperando datagrama...");
	         byte[] receiveData = new byte[1024];
	         DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
	         serverSocket.receive(receivePacket);
	         String receivedString = new String(receivePacket.getData(), 0, receivePacket.getLength());
	         int receivedNumber = Integer.parseInt(receivedString);
	         System.out.println("Vamos a calcular el cubo de: " + receivedNumber);
	         String clientIP = receivePacket.getAddress().toString();
	         int clientPort = receivePacket.getPort();
	         System.out.println("IP de origen: " + clientIP);
	         System.out.println("Puerto de origen: " + clientPort);
	         int cube = receivedNumber * receivedNumber * receivedNumber;
	         byte[] sendData = String.valueOf(cube).getBytes();
	         DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, receivePacket.getAddress(), clientPort);
	         serverSocket.send(sendPacket);
	         System.out.println("Enviamos el resultado..." + cube);
	         System.out.println("Adiósss");
	         serverSocket.close();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

        
	}
	 
}
