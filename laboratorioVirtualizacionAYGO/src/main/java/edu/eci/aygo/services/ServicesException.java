package edu.eci.aygo.services;

/**
 *
 * @author Juan Pablo Arévalo
 */
public class ServicesException extends Exception{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServicesException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServicesException(String cause) {
        super(cause);
    }
    
}
