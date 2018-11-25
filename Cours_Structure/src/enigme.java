
public class enigme {


	public static void main(String[] args) {
		
		permuter("abc");

	}
	public static void permuter (String ch) {
		recPermuter("",ch);
		
	}
	
	public static void recPermuter (String fait, String reste) {
		
		//cas de base
		if (reste.length()==0)
			System.out.println(fait);
		
		else
		{
			for (int i=0; i<reste.length();i++) {
				String faitProchain = fait+ reste.charAt(i);
				String ResteProchain = reste.substring(0, i)+ reste.substring(i+1);
				recPermuter (faitProchain, ResteProchain);
			}
		}
	}
}
