
public class TD5 {

	public static void main(String[] args) {
		//afficheP ("UE info ");
		//String R = AjouteEtoile("UE info",3);
		//System.out.println(SupprimeCar("chocolat",'o'));
		//System.out.println("Duval".substring(1,3));
		//System.out.println("Marguerite".indexOf("rg"));
		//System.out.println("multiplication".indexOf("ti",4));
		//System.out.println("banane".indexOf("an",4));
	
	}
		
		public static void affiche (String S) {
			for (int i=0;i<S.length();i++) {
				System.out.println(S.charAt(i));
					if(i<S.length()-1) {
						System.out.println(',');
					}
			}
		}
		
		public static void afficheP (String S) {
			String C="";
			for (int i=0;i<S.length();i++) {
				
					if(i<S.length()-2) {
						C=C+S.charAt(i)+',';
						
					}
					else
					C=C+S.charAt(i);
			}
			
			System.out.println(C);
		}

		
		
public static String AjouteEtoile (String S, int n) {
	String E= "";
	for (int k = 0;k<n;k++) 
		E+='*';  // E=E+'*'
	
		return E+S+E;
		
	}






private static String [] R;


public static String SupprimeCar (String S, char c) {
	
	String R="";

	for (int k=0;k<S.length();k++) {
		if (S.charAt(k)!=c) {
		R=R+S.charAt(k);
		
	}
	}
	return R;
	
	

	
}


}

