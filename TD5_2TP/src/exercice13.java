import java.util.Scanner;

public class exercice13 {
	
	private static String [] tableau;	
		
	/*public motdepass() {
		this.tableau = new String [30];
	}
	*/

		public static void main(String[] args) {
			
			tableau = new String [4];
			saisieTab(tableau);
			//System.out.println("taillePlusCourt =   "+ taillePlusCourt(tableau));
			System.out.println("moyenne =   "+ calculeMoyenne(tableau));
		}

		public static String saisiePwd (){
			String S;

			System.out.println("Saisir mot de passe");
			Scanner sc = new Scanner (System.in);
			S=sc.next();

			return S;
			
		}
		
		public static String [] saisieTab(String [] tab){
			
			for (int i=0;i<3;i++) {
			tab[i]=saisiePwd();
			
		}
			return tab;
		}
		


		
		public static String calculeMoyenne (String [] tab) {
			int moyenne = 0;
			String S;
			String age="";
			int count =0;
			for ( int i=0; i<3;i++) {
				
				S=tab[i];
				
				for (int k=0;k<S.length()-1;k++){
					
					if (S.charAt(k)==':') count =k;

				}	
				
					age = age+S.charAt(count+2)+S.charAt(count+3);
				
			
				
			}	
				
			return age;
		
		
	}
	


}
