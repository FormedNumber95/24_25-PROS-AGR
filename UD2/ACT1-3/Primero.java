package ejerciciosClase;

/**
 * The Class Primero.
 */
public class Primero extends Thread {
	
	/**
	 * Run. Prints 20 times Primero + i where i is the variable of the for
	 */
	public void run(){
		for (int i=1;i<=20;i++)
			System.out.println("Primero " + i);
	}
}