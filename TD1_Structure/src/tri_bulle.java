
public class tri_bulle {

	public static int[] bulle(int[] t) {
		boolean tri;
		int tmp;
		for (int i = t.length - 1; i >= 0; i--) {
			tri = true;
			for (int j = 0; j < i; j++) {
				if (t[j + 1] < t[j]) {
					tmp = t[j + 1];
					t[j + 1] = t[j];
					t[j] = tmp;
					tri = false;

				}
			}

		}
		return t;
	}
}
