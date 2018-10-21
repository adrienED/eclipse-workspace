package swap;
import java.util.Scanner;

public class swap {

	
	public static void main (String [] args) {
		
	int X;
	int [] tab= {1,3,5,8,10,12};
	int pos=0;
	System.out.println("entrer un nombre");
	Scanner sc = new Scanner (System.in);
	X=sc.nextInt();
	
	for (int i =0;i<tab.length;i++) {
		if (tab[i]>X)
			pos=i;
			
		}
	
	
	for (int i =tab.length+1;i>pos;i--) {
		
			
			
			for (int j =0;j<tab.length;i++) {
					System.out.println(j);
		}
	}
	
	}
	
	
}
