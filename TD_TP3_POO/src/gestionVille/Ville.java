package gestionVille;

public class Ville {
	
	private static Bien [] tabBien ;
	
	

	public static void main (String [] args) {
		
	
		
		System.out.println(tabBien);
	}
	
	
	public Ville (int i,int v, int c, String numImm, int nbP) {
		
			
			
		Vehicule V = new Vehicule (v, c, numImm, nbP);
		this.tabBien[i]= V;	
		
	}

	public Ville (int i,int v, int c, int saS, int nbPL) {
		
		Logement L = new Logement ();
		this.tabBien[i]= L;	
	}
	
	/*
	public getInfo(int indice) {
		
		if ()
	}
	
	

	public int getNbVehicules() {
		
		
		
		return
		
	}
	
	public int getEntretienCourantMensuel() {
		
		return tabBien.getCoutEntretienMensuel();
	}
	
	public int getNbPersonnesLogees() {
		
		return 
	}


	/**
	 * @return the tabBien
	 */
	public Bien[] getTabBien() {
		return tabBien;
	}

}
