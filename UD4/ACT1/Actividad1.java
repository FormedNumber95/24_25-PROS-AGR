//Problem solving
//Error finding FTPClient class. I had added the jar to the modulepath and no tu the classpath
package ejercicio1_UD4;

import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTPClient;

/**
 * The Class Actividad1.
 */
public class Actividad1 {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		FTPClient cliente=new FTPClient();
		String servidor="ftp.rediris.es";
		System.out.println("Nos conectamos a"+servidor);
		try {
			cliente.connect(servidor);
			boolean login=cliente.login("anonymous", "dm2");
			if(login) {
				System.out.println("Login correcto");
				System.out.println("Directorio actual:"+cliente.printWorkingDirectory());
				boolean creado=cliente.makeDirectory("DM2PROS");
				if (creado) {
					System.out.println("Directorio creado....");
				}else {
					System.out.println("NO SE HA PODIDO CREAR EL DIRECTORIO");
				}
				boolean logout=cliente.logout();
				if(logout) {
					System.out.println("Logout del servidor FTP...");
				}else {
					System.out.println("Error al hacer logout...");
				}
				cliente.disconnect();
				System.out.println("Desconectado...");
			}else {
				System.out.println("Login incorrecto…");
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}