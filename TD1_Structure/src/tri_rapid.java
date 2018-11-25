
public class tri_rapid {

	
	
	
	public static int  partitionner (int [] t , int premier, int dernier , int pivot ) {
		int tmp;
		tmp = t[pivot];
		t[pivot] = t[dernier];
		t[dernier] = tmp;
		int j=premier;
		
		for (int i =premier; i<dernier-1; i++) {
			if (t[i]<=t[dernier]) {
				
				tmp = t[i];
				t[i] = t[j];
				t[j] = tmp;
				j=j+1;
			}
		}
		tmp = t[dernier];
		t[dernier] = t[j];
		t[j] = tmp;
	return j;	
	}
	
	public static int choix_pivot (int [] t, int premier, int dernier) {
		int pivot = premier;
		return  pivot;
	}
	
	
	public static int[] tri_rapide (int [] t, int premier, int dernier) {
	
		if (premier<dernier) {
			int pivot = choix_pivot(t,premier,dernier);
			pivot = partitionner(t,premier,dernier,pivot);
			tri_rapide(t,premier,pivot-1);
			tri_rapide(t,pivot+1,dernier);
			
		}
		return t;
}

	
	
}
