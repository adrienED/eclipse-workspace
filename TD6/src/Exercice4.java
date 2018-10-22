
public class Exercice4 {

	public static void main(String[] args) {
		
		int [] t= {1,4,7,8,32};
		
		System.out.println(DICHO(t,0,4,7));

	}
	
	
	public static boolean DICHO (int [] T, int D, int F, int R) {
		int M;
		if (D==F)
			if (T[D]==R) return true; else return false; //= return (T[D]==R
		else 
			M=(D+F)/2;
			if (T[M]>R) // recherche moitié gauche
				return (DICHO(T,M+1,F,R));
			else 
				return (DICHO(T,D,M,R));
		
	}

}
