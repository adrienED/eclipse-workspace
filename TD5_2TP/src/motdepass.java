import java.util.Scanner;
public class motdepass {
	
	
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
		
		do {
		System.out.println("Saisir mot de passe");
		Scanner sc = new Scanner (System.in);
		S=sc.next();
		}
		while ( (S.length()<8) || ((S.indexOf('&')<=0) && (S.indexOf('@')<=0) && (S.indexOf('#')<=0) && (S.indexOf('$')<=0)
				&& (S.indexOf('%')<=0) && (S.indexOf('^')<=0) && (S.indexOf('+')<=0) && (S.indexOf('=')<=0) && (S.indexOf('*')<=0)));
		
		return S;
		
	}
	
	public static String [] saisieTab(String [] tab){
		
		for (int i=0;i<4;i++) {
		tab[i]=saisiePwd();
		
	}
		return tab;
	}
	
	public static int taillePlusCourt (String[] tab){
		
		int count;
		int petit =0;
		String pass;
	
		pass=tab[0];
		petit=pass.length();
	
		for ( int i=0; i<4;i++) {
		
			pass=tab[i];
			count=pass.length();
			
			
			if(count<petit ) petit=count;
		}

		return petit;
	}
	

//exerice 13 
	
	public static int calculeMoyenne (String [] tab) {
		int moyenne = 0;
		String S;
		
		for ( int i=0; i<4;i++) {
			
			S=tab[i];
			moyenne=Integer.parseInt(S);
			
		}	
		return moyenne;
	
	
}
}

