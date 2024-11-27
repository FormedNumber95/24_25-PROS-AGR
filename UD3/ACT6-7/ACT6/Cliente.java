//Problem solving
//The client and the server doesn't connect well. I have write() and not writeInt() and the same with the read()/readInt() of the server
package ejerciciosUD3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The Class Cliente.
 */
public class Cliente {
	
	/**
	 * Method that .
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("PROGRAMA CLIENTE INICIANDO");
		System.out.println("Introduce un número");
		try {
			int num=input.nextInt();
			input.nextLine();
				Socket s=new Socket("localhost", 6010);
				//hacer consulta
				DataOutputStream dos=new DataOutputStream(s.getOutputStream());
				dos.writeInt(num);
				DataInputStream dis=new DataInputStream(s.getInputStream());
				System.out.println("El cuadrado del número "+num+" es "+dis.readInt());
				dis.close();
				dos.close();
				s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}catch(InputMismatchException e) {
			System.out.println("El número debe ser un número");
		}
	}
}