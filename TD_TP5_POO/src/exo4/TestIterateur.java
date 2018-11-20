package exo4;

public class TestIterateur {

	
	public TestIterateur (String message, int [] t) throws PasDeSuivantException  {
		
		IterateursDesPairs itP = new IterateursDesPairs(t);

		System.out.println(message);
	
	
	while (itP.aUnSuivant()) {
		System.out.print(itP.suivant()+" ");
	}

	}



public static void main (String [] args) throws PasDeSuivantException  {
	
	new TestIterateur("test1 :", new int[] {1,2,6,7,8,9,11,12,14,13,5});
	new TestIterateur("test2 :", new int[] {2,79});
	new TestIterateur("test3 :", new int[] {});
	
	
	

}
}