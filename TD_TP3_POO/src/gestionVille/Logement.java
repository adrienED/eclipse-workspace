/**
 * 
 */
package gestionVille;

/**
 * @author adrien
 *
 */
public class Logement extends Bien {
	
	
	private int superficieAuSol;
	private int nbPersonnesLogees;
	

	/**
	 * 
	 */
	public Logement() {
		
		super();
		this.superficieAuSol=0;
		this.nbPersonnesLogees=0;
	}
	
	
public Logement(int v, int c, int saS, int nbPL) {
		
		super(v,c);
		this.superficieAuSol=saS;
		this.nbPersonnesLogees=nbPL;
	}
	

	/**
 * @return the superficieAuSol
 */
public int get() {
	return superficieAuSol;
}


/**
 * @param superficieAuSol the superficieAuSol to set
 */
public void setSuperficieAuSol(int superficieAuSol) {
	this.superficieAuSol = superficieAuSol;
}


/**
 * @return the nbPersonnesLogees
 */
public int getNb() {
	return nbPersonnesLogees;
}

/**
 * @param nbPersonnesLogees the nbPersonnesLogees to set
 */
public void setNbPersonnesLogees(int nbPersonnesLogees) {
	this.nbPersonnesLogees = nbPersonnesLogees;
}

@Override
public String getInfo() {
	String info = super.getInfo();
	info+="Logement :\n";
	info+="Superficie au sol : "+this.superficieAuSol+"\n";
	info+="Nombre de personne logées : "+this.nbPersonnesLogees+"\n";
	return info; 
}


@Override
public String getNumeroImatriculation() {
	return null;
}

}
