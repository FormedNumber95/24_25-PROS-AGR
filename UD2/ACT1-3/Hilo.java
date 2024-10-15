package ejerciciosClase;

/**
 * The Class Hilo.
 */
public class Hilo extends Thread {
	
	/** The number. */
	int num;
	
	/**
	 * Instantiates a new hilo.
	 *
	 * @param num the number
	 */
	public Hilo(int num) {
		this.num=num;
	}
	
	/**
	 * Run. Prints 20 times Hilo + num where num is the number of the thread
	 */
	public void run(){
		for (int i=1;i<=20;i++)
			System.out.println("Hilo "+num);
	}
}