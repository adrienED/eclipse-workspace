
public class tri_selection {

	public static int[] selection(int[] t) {
		int min;
		int tmp = 0;

		for (int i = 0; i < t.length - 1; i++) {
			min = i;
			for (int j = i; j < t.length; j++) {

				if (t[j] < t[min])
					min = j;
			}
			if (min != i)
				tmp = t[min];
			t[min] = t[i];
			t[i] = tmp;
		}
		return t;
	}

}
