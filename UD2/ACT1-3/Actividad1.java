package ejerciciosClase;

/**
 * The Class Actividad1.
 */
public class Actividad1 {
	
	/**
	 * Method that runs the 2 thread at the same time.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Primero p=new Primero();
		Segundo s=new Segundo();
		p.start();
		s.start();
		System.out.println("Fin programa");
		}
}
