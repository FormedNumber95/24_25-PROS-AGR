//Problem solving
//I can only send 1 string to the server. I had dis.readUTF() many times in the code
package ejercicio11_UD3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * The Class Cliente.
 */
public class Cliente {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("PROGRAMA CLIENTE INICIANDO");
		String cadena="";
		String resp="";
		try {
			Socket s=new Socket("localhost", 6000);
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			DataInputStream dis=new DataInputStream(s.getInputStream());
			do{
				System.out.println("Introduce una cadena:");
				cadena=input.nextLine();
				dos.writeUTF(cadena);
				resp=dis.readUTF();
				System.out.println(" =>Respuesta:"+resp);
			}while(!resp.equals("*"));
			System.out.println("Fin del envío....");
			dis.close();
			dos.close();
			s.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		input.close();
	}
	
}
