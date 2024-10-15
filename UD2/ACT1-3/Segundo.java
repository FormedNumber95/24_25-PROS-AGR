package ejerciciosClase;

/**
 * The Class Segundo.
 */
public class Segundo extends Thread {
	
	/**
	 * Run. Prints 20 times Segundo + i where i is the variable of the for
	 */
	public void run(){
		for (int i=1;i<=20;i++)
			System.out.println("Segundo " + i);
	}
}