// Problem solving
//The expected result is not the correct one, appears first the thread with the priority 3 and then the one with the priority 7
//Put in the task manager put only 1 CPU to eclipse
package ejerciciosClaseUD2;

/**
 * The Class Actividad10.
 */
public class Actividad10 {

	/**
	 * Method that runs the program, creating 3 threads and printing in the console the expected result of the activity.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Thread main=new Thread();
		main.setName("main");
		Hilo h1=new Hilo("Hilo-prioridad 7");
		h1.setPriority(7);
		Hilo h2=new Hilo("Hilo-prioridad 3");
		h2.setPriority(3);
		System.out.println(main.getName()+" tiene la prioridad "+main.getPriority());
		System.out.println(h2.getName()+" tiene la prioridad "+h2.getPriority());
		System.out.println(h1.getName()+" tiene la prioridad "+h1.getPriority());
		h2.start();
		h1.start();
		System.out.println("Final programa");
	}

}
