public class Exercice1 {

	public static void main(String[] args) {
	
	double R = NUL(5,3);
	System.out.println("5*3= "+R);
	

	}
	public static double NUL (double R, int N) {
		if(N==0) return 0;
		else
			if (N==1) return R;
			else return R+NUL (R,N-1);
	}

}