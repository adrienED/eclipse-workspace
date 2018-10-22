
public class Exercice2 {

	public static void main(String[] args) {
		System.out.println(ESTDIV7(60));

	}
	
	
	public static boolean ESTDIV7( int n) {
		if (n<0) return ESTDIV7 (-n);
		else if (n==0) return true;
			else if (n<7) return false;
				else return ESTDIV7(n-7);
	}

}
