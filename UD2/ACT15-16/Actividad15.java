//Problem solving
//The LocalDateTime.now() show more information that the one requiered in the asigment. 
//use LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute()+":"+LocalDateTime.now().getSecond() to get the expected result
package ejerciciosClaseUD2;

/**
 * The Class Actividad15.
 */
public class Actividad15 {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Hilo h1=new Hilo();
		Hilo h2=new Hilo();
		Hilo h3=new Hilo();
		h1.setName("Hilo 1");
		h2.setName("Hilo 2");
		h3.setName("Hilo 3");
		h1.start();
		h2.start();
		h3.start();
	}

}
