public class tri_insertion {

	public static int[] insertion(int t[]) {
		int tmp = 0;
		int j;
		for (int i = 0; i < t.length; i++) {

			tmp = t[i];

			j = i;
			while (j > 0 && t[j - 1] > tmp) {
				t[j] = t[j - 1];
				j = j - 1;

			}
			t[j] = tmp;
		}

		return t;
	}
}
