// Problem solving
//I was trying to do what the synchronized() method does
package ejerciciosClaseUD2;

/**
 * The Class Actividad16.
 */
public class Actividad16 {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main (String[] args) {
		Contador cont = new Contador (100);
		HiloA a = new HiloA("HiloA", cont);
		HiloB b = new HiloB("HiloB",cont);
		a.start();
		b.start();
	} 
}
