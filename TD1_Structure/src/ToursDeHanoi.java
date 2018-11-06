public class ToursDeHanoi {

	public static void main(String[] args) {
		
		hanoi(100,'A','B','C');
	}

	public static void hanoi(int n, char x, char y, char z) {
		/* pour déplacer n disques de x vers z avec le pieu annexe y */

		if (n == 0);
		else {
			hanoi(n - 1, x, z, y);
			System.out.println("deplacer : " + x + " vers : " + z);
			hanoi(n - 1, y, x, z);
		}
		
		
	}
}
