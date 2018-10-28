
public class Exercice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = somme (458);
		System.out.println(s);
		System.out.println(estDiv3(451));
	}
	
	public static int somme (int n) {
		
		if (n%10==n) return n;
		else
			
		return n%10+somme(n/10);
	}
	
	public static boolean estDiv3 (int n) {
		
		if (n<10 && (n==3 || n==6 || n==9)) return true;
		else {if (somme(n)%3==0) { return true;
		
		}
				else {return false;
		}
		
	}
}
}
