package ejerciciosClase;

/**
 * The Class Hilo3.
 */
public class Hilo3 extends Thread{
	
	/**
	 * Run. Prints the initial name and priority and then the modified ones
	 */
	public void run(){
		System.out.println("El nombre del hilo es "+this.getName()+" y tiene la prioridad "+this.getPriority());
		this.setName("SUPER-HILO-DM2");
		this.setPriority(6);
		System.out.println("Ahora el nombre del hilo es "+this.getName()+" y tiene la prioridad "+this.getPriority());
	}
	
}
