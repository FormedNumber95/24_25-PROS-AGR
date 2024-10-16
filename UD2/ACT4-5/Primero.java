package ejerciciosClase;

/**
 * The Class Primero.
 */
public class Primero extends Thread {
	
	/**
	 * Run. Prints 15 times Primero + i where i is the variable of the for and try to sleep for 100 milliseconds
	 */
	public void run(){
		for (int i=1;i<=15;i++) {
			System.out.println("Primero " + i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}