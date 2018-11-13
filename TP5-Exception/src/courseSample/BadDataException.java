/**
 * 
 */
package courseSample;

/**
 * @author nizar
 *
 */
public class BadDataException extends Exception {

	/**
	 * 
	 */
	public BadDataException() {

	}

	/**
	 * @param message
	 */
	public BadDataException(String message) {
		super(message);
	}

	public String getMessage() {
		return super.getMessage();
	}
}
