package edu.eci.aygo.persistence;

/**
 *
 * @author Juan Pablo Arévalo
 */
public class PersistenceException extends Exception{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1515446460666104126L;

	public PersistenceException(String message) {
        super(message);
    }

    public PersistenceException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersistenceException(Throwable cause) {
        super(cause);
    }
    
}
