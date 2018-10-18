
public class Requete {
	public Requete (String s) { // 1 methode (contrsucteur)
		this.requete = s;
		//analyse de la chaine
		this.analyse(); 
		
	}
	String requete;
	String adrip;
	String date;
	int statut;
	
	public String getAdresseIP() {
		return this.adrip;
	}
	
	public String getDateRequete() {
		return this.date; // getter qui permet de lier 
	}
	
	public int get_StatutRequete() {
		return this.statut; // getter qui permet de lier 
	}
	
	private void analyse() {
		//Extraire adresse ip
		int posespace = this.requete.indexOf(" ");
		this.adrip = this.requete.substring(0,  posespace);
		//extraire date		
		int debut = this.requete.indexOf("[");
		int fin = this.requete.indexOf("]");
		this.date = this.requete.substring(debut+1, fin);
		
		String [] champ = this.requete.split(" ");
		
	}
	
	
}
