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
	public int getNbPlaces() {
		return nbPlaces;
	}
	
	public String getInfo() {
		String info = super.getInfo();
		
		String tempInfo = info.substring(0,info.indexOf('\n'));
		tempInfo+="Vehicule";
		tempInfo += info.substring(info.indexOf('\n'));
		
		
		
		tempInfo+="Vehicule :\n";
		tempInfo+="Numero imatriculation : "+this.numeroImmatriculation+"\n";
		tempInfo+="Nombre de places : "+this.nbPlaces+"\n";
		return tempInfo; 
	}


	@Override
	public int getNb() {
		// TODO Auto-generated method stub
		return 0;
	}

}
