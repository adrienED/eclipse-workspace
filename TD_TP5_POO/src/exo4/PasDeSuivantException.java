package exo4;

public class PasDeSuivantException extends Exception {

	/**
	 * 
	 */
	public PasDeSuivantException() {

	}

	/**
	 * @param message
	 */
	public PasDeSuivantException(String message) {
		super(message);
	}

	public String getMessage() {
		return super.getMessage();
	}
}