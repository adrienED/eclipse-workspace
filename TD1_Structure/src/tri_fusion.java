
public class tri_fusion {

	
	public static int []  triFusion ( int [] t ) {
		
		if (n<=1) return t;
		
		return fusion ()
	}
	
	
	
	public static fusion (int [] A, int [] B) {
		
		if (A.isEmpty()==0)
			return B;
		if (B.isEmpty()==true)
			return A;
		
		if (A[1]<=B[1])
			return A[1] = fusion (A[2],B);
		else
				return B[1] = fusion (A,B);
	}
}