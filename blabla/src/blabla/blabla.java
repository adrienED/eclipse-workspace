package blabla;

import java.util.Scanner;

public class blabla {
	
	
	
	public static void main (String [] args) {
		
		int X;
		int [] tab ={1,3,5,8,10,12};
		int n = tab.length;
		int tmp;
		System.out.println("entrer un nombre");
		Scanner sc = new Scanner (System.in);
		X=sc.nextInt();
		
		tab[n-1]=X;
		
		for (int i=n-1;i>1;i--) {
			for (int j=1;j<i;j++) {
				if (tab[j-1]>tab[j]) {
					tmp=tab[j-1];
					tab[j-1]=tab[j];
					tab[i]=tmp;
					
				}
			}
		}
		
		for (int j =0;j<tab.length;j++) {
			System.out.println(tab[j]);
	}
}
}