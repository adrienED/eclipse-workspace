package blabla;

import java.util.Scanner;

public class test {

	
	
	
	public static void main (String [] args) {
		System.out.println("nombre de ligne");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for (int i =0;i<=n ; i++ ) {
			for (int j=0;j<=i;j++) {
				System.out.print(j+1);
			}
	}
	}
}
