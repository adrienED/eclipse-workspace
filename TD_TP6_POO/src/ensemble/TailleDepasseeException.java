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
		return "Attention aucun élément ne correspond à cet indice"+super.getMessage();
	}

}
