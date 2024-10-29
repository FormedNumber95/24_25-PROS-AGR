package ejerciciosClaseUD2;

/**
 * The Class HiloB.
 */
class HiloB extends Thread {
	
	/** The contador. */
	private Contador contador;
	
	/**
	 * Instantiates a new hilo B.
	 *
	 * @param n the n
	 * @param c the c
	 */
	public HiloB (String n, Contador c) {
		setName(n);
		contador=c;
	}
	
	/**
	 * Run.
	 */
	public void run () {
		synchronized(contador) {
			for (int j=0; j < 300; j++) {
				contador.decrementa();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {}
			}
			System.out.println(getName() + " contador vale " + contador.getValor());
		}
	}
}

