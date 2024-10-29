package ejerciciosClaseUD2;

/**
 * The Class Contador.
 */
class Contador {
	
	/** The c. */
	private int c=0;
	
	/**
	 * Instantiates a new contador.
	 *
	 * @param c the c
	 */
	Contador (int c) { 
		this.c = c; 
	}
	
	/**
	 * Incrementa.
	 */
	public synchronized void incrementa() {
		c=c+1;
	}
	
	/**
	 * Decrementa.
	 */
	public synchronized void decrementa() {
		c=c-1;
	}
	
	/**
	 * Gets the valor.
	 *
	 * @return the valor
	 */
	public int getValor() {
		return c; 
	}

}
