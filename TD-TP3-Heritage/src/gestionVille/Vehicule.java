/**
 * 
 */
package gestionVille;

/**
 * @author nizar
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

	/**
	 * @param numeroImmatriculation the numeroImmatriculation to set
	 */
	public void setNumeroImmatriculation(String numeroImmatriculation) {
		this.numeroImmatriculation = numeroImmatriculation;
	}

	/**
	 * @param nbPlaces the nbPlaces to set
	 */
	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}
	
	@Override
	public String getInfo() {
		String info =super.getInfo();
		String tempInfo = info.substring(0,info.indexOf('\n'));
		tempInfo+="Vehicule";
		tempInfo+=info.substring(info.indexOf('\n'));
		
		tempInfo+="Immatriculation : "+this.numeroImmatriculation+"\n";
		tempInfo+="Nombre de places : "+this.nbPlaces+"\n";
		
		return tempInfo;
	}
	
	
	

}
