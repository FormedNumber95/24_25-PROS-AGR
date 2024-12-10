package ejercicio10_UD3;

import java.io.Serializable;

/**
 * The Class Tenista.
 */
public class Tenista implements Serializable{
	
	/** The apellido. */
	private String apellido;
	
	/** The altura. */
	private int altura;
	
	/**
	 * Instantiates a new tenista.
	 *
	 * @param apellido the apellido
	 * @param altura the altura
	 */
	public Tenista(String apellido, int altura) {
		this.apellido = apellido;
		this.altura = altura;
	}

	/**
	 * Gets the apellido.
	 *
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Sets the apellido.
	 *
	 * @param apellido the new apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Gets the altura.
	 *
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * Sets the altura.
	 *
	 * @param altura the new altura
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}
}
