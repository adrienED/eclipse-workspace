/**
 * 
 */
package gestionVille;

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


	public Vehicule(int v, int c, String numImm, int nbP) {
		super(v, c);
		this.numeroImmatriculation=numImm;
		this.nbPlaces=nbP;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the numeroImmatriculation
	 */
	public String getNumeroImatriculation() {
		return numeroImmatriculation;
	}

	/**
	 * @return the nbPlaces
	 */
	public int getNb() {
		return nbPlaces;
	}
	
	public String getInfo() {
		String info = super.getInfo();
		info+="Vehicule :\n";
		info+="Numero imatriculation : "+this.numeroImmatriculation+"\n";
		info+="Nombre de places : "+this.nbPlaces+"\n";
		return info; 
	}

}
