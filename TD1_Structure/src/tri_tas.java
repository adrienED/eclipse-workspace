import java.util.Arrays;

public class tri_tas {

	public static void tamiser ( int [] t, int noeud, int n) {
		
		
		int k = noeud;
		int j=2*k;
		int tmp;
		while (j<=n) {
			
			if (j<n && t[j] < t[j+1]) j = j+1;
			
			if (t[k]<t[j]) {
					
					tmp=t[k];
					t[k]=t[j];
					t[j]=tmp;
					k=j;
					j=2*k;
			}
					else {
						j=n+1;
					}
				}
		}
		
	public static int [] tas ( int [] t ) {
		int tmp;
		
		for (int i=(t.length-1);i>=0; i--) {
			tamiser (t,i,t.length-1);
		}
		for (int i=t.length-1;i>=0; i--) {
			
			tmp=t[i];
			t[i]=t[0];
			t[0]=tmp;
			tamiser (t,0,i-1);
		}
		
		return t;
			
		}
	
	public static void main(String[] args) {

		int[] t = { 8, 7, 6, 9, 5, 2, 9, 5, 4, 1 };
		
		System.out.println(Arrays.toString(tas(t)));
	}
		
	}



	

