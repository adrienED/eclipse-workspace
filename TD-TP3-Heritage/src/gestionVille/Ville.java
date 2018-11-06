/**
 * 
 */
package gestionVille;

import java.util.ArrayList;

/**
 * @author nizar
 *
 */
public class Ville {
	
	private ArrayList<Bien> lesBiens;
	private String nom;
	
	/**
	 * 
	 */
	public Ville() {
		lesBiens = new ArrayList<>();
		nom ="Terre";
	}
	
	public Ville(String nomVille) {
		lesBiens = new ArrayList<>();
		nom =nomVille;
	}
	
	
	public Ville(String nomVille, ArrayList<Bien> desBiens) {
		lesBiens=new ArrayList<>();
		lesBiens.addAll(desBiens);
		nom=nomVille;
	}
	
	public void ajouterBien(Bien b) {
		this.lesBiens.add(b);
	}
	
	public String getInfoBienParticulier(Bien b) {
		if(lesBiens.contains(b))
			return b.getInfo();
		return "Bien inexistant dans la ville. Aucune info à retourner";
	}
	
	// précondition 0<= indice < lesBiens.size() 
	public String getInfoBienParticulier(int indice) {
		//Bien leBienRecherche = lesBiens.get(indice);
		//return leBienRecherche.getInfo();
		// equivalent à 
		return lesBiens.get(indice).getInfo();
	}
	
	public int getNbreTotalVehicules() {
		int nbV = 0;
		for(Bien b : this.lesBiens)
			if(b instanceof Vehicule)
				nbV++;
		return nbV;
	}
	
	public int getNbreTotalLogements() {
		int nbL = 0;
		for(Bien b : this.lesBiens)
			if(b instanceof Logement)
				nbL++;
		return nbL;
	}
	
	public int getCoutTotalEntretien() {
		int ctE = 0;
		for(Bien b : this.lesBiens){
			ctE += b.getCoutEntretienMensuel();
		}
		return ctE;	
	}
	
	public int getNbTotalPersonneLogees() {
		int nbTPL = 0;
		for(Bien b : this.lesBiens) {
			if(b instanceof Logement)
				nbTPL += ((Logement) b).getNbPersonnesLogees();
		}
		return nbTPL;
	}
	
	public int getCoutTotalEntretienVehicules() {
		int ctEV = 0;
		for(Bien b : this.lesBiens){
			if(b instanceof Vehicule)
				ctEV += b.getCoutEntretienMensuel();
		}
		return ctEV;	
	}
	
	
	
	
	
}
