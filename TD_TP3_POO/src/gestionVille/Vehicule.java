/**
 * 
 */
package gestionVille;

/**
 * @author adrien
 *
 */
public class Vehicule extends Bien {
	
	private String numeroImmatriculation;
	private int nbPlaces;

	/**
	 * 
	 */
	public Vehicule() {
		super();
		this.numeroImmatriculation="";
		this.nbPlaces=0;
	}

	/**
	 * @param v
	 * @param c
	 */
	public Vehicule(int v, int c, String numImm, int nbP) {
		super(v, c);
		this.numeroImmatriculation=numImm;
		this.nbPlaces=nbP;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the numeroImmatriculation
	 */
	public String getNumeroImmatriculation() {
		return numeroImmatriculation;
	}

	/**
	 * @return the nbPlaces
	 */
	public int getNbPlaces() {
		return nbPlaces;
	}
	
	

}
