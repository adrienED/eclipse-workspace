import java.util.Arrays;

public class recherche {

	public static void main(String[] args) {
		
		int [] t= {1,7,8,9,5,2,9,5,4,1};
		System.out.println(Arrays.toString(insertion(t)));

	}

	
	
	public static int [] insertion (int t []) {
		int tmp=0;
		//for (int i=0;i<t.length-1;i++) {
			
		do {	
			
			if (t[i]>t[i+1]) {
				tmp=t[i];
				t[i]=t[i+1];
				t[i+1]=tmp;
			}
	
		}
	
		return t;
		
		
	}
}
