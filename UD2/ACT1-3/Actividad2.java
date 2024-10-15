//The output is alwais “Hilo 5” and there are only 4 threads.
//I had (n+1) and not (i+1) 

package ejerciciosClase;

/**
 * The Class Actividad2.
 */
public class Actividad2 {

	/**
	 * Method that run n threads, where n is a local variable.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++) {
			new Hilo(i+1).start();
		}
		System.out.println("Final Programa");
	}

}
