
public class Factoriel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(3));
	}
	
	
	public static double fact(int n) { 
		
		if (n==0) return 1; // cas de base 
		else return n*fact(n-1); 
		
		}
	}


