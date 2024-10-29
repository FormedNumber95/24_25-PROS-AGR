package ejerciciosClaseUD2;

/**
 * The Class HiloA.
 */
class HiloA extends Thread {
	
	/** The contador. */
	private Contador contador;
	
	/**
	 * Instantiates a new hilo A.
	 *
	 * @param n the n
	 * @param c the c
	 */
	public HiloA (String n, Contador c) {
		setName(n);
		contador=c;
	}
	
	/**
	 * Run.
	 */
	public void run () {
		synchronized(contador) {
			for (int j=0; j < 300; j++) {
				contador.incrementa();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {}
			}
			System.out.println(getName() + " contador vale " + contador.getValor());
		}
	}
}
