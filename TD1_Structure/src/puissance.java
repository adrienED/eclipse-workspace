
public class puissance {

	public static void main(String[] args) {

		System.out.println(puissanceNaive(4, 4));
		System.out.println(puissanceEfficace(4, 4));

	}

	public static int puissanceNaive(int b, int n) {

		int p = 1;
		for (int i = 0; i < n; i++) {
			p *= b;
		}
		return p;
	}
	
	public static int puissanceEfficace(int b, int n) {

		int p = 1;
		int q = b;
		int m = n;

		while (m > 0) {

			if (m % 2 != 0) {
				p *= q;
			}
			m = m / 2;
			q *= q;
		}

		return p;
	}

}
