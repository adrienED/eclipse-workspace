/**
 * 
 */
package gestionVille;

/**
 * @author nizar
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

	/**
	 * @param v
	 * @param c
	 */
	public Logement(int v, int c, int sAS, int nbPL) {
		super(v, c);
		this.superficieAuSol=sAS;
		this.nbPersonnesLogees=nbPL;
	}

	/**
	 * @return the superficieAuSol
	 */
	public int getSuperficieAuSol() {
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
	public int getNbPersonnesLogees() {
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
		info+="Logement : \n";
		info+="Superficie au sol : "+this.superficieAuSol+"\n";
		info+="Nombre de personnes logées : "+this.nbPersonnesLogees+"\n";
		return info;
	}
	
}
