//Problem solving
//I don’t have any problem in this code
package ejerciciosClaseUD2;

/**
 * The Class Actividad14.
 */
public class Actividad14 extends Thread { 
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {
		Recurso a = new Recurso(); 
		Recurso b = new Recurso(); 
		Hilo h1 = new Hilo(a, b, "uno"); 
		Hilo h2 = new Hilo(a, b, "dos"); 
		h1.start();
		h2.start(); 
	}
}
