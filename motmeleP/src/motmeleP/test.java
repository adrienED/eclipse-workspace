package motmeleP;

import java.util.Scanner;

public class test{

	
	
	
	private static int[][] T;
	private int N;
	

	
public test(int N) {
	N = 12;
	T = new int[N][N];
}


public static Alphabet french() {
	char[] chars = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','é','è','à','ù','ç','â','ê','î','ô','û','ë','ï'};
	return new Alphabet(chars);
    }




private static void remplirTableau() {

	for (int i = 0; i < T.length; i++) {
		T[i] = alea();
	}
}

public static void main(String[] args) {
	// TODO Auto-generated method stub

	TP2_E3 TP2_E3 = new TP2_E3(5);
	remplirTableau();

	for (int c = 0; c < T.length; c++) {

		System.out.println(T[c]);

	}
	System.out.println("max = " + Max());
	System.out.println("min = " + Min());
	System.out.println("moyenne = " + Moyenne());

}

}