package ensemble;

public class TailleDepasseeException extends ArrayIndexOutOfBoundsException {

	public TailleDepasseeException() {
		// TODO Auto-generated constructor stub
	}

	public TailleDepasseeException(int index) {
		super(index);
		// TODO Auto-generated constructor stub
	}

	public TailleDepasseeException(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	
	public String getMessage() {
		return "Attention aucun �l�ment ne correspond � cet indice"+super.getMessage();
	}

}
