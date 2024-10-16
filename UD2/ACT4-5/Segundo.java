package ejerciciosClase;

/**
 * The Class Segundo.
 */
public class Segundo extends Thread {
	
	/**
	 * Run. Prints 15 times Segundo + i where i is the variable of the for and try to sleep for 0,2 seconds
	 */
	public void run(){
		for (int i=1;i<=15;i++) {
			System.out.println("Segundo " + i);
			try {
				sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}