
public class Puissance {

	public static void main (String [] args ) {
		
		int b=2;
		int p=1;
		int n=11;
		int q=b;
		int m=n;
		
		while (m>0 ) {
			if (m%2!=0) p = p *q;
		
			m=m/2;
			q=q*q;
		}
		System.out.println(p);
		
	}
	
	
}
