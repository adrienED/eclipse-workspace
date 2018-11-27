package graphe;

import java.util.HashMap;

public class Graphe {
	
	HashMap<String, HashMap<String,Integer>> leGraphe;
	
	public Graphe() {
		this.leGraphe = new HashMap<String, HashMap<String,Integer>>();
		
	}
	
	public void ajouteSommet(String nomS) throws Exception{
		if(leGraphe.containsKey(nomS))
			throw new Exception ("Ce sommet existe déja");
		leGraphe.put(nomS, new HashMap<String,Integer>());
		
		
	}
	
	public void ajouteChemin(String depart , String arrivee, Integer distance) throws Exception{
		if(!leGraphe.containsKey(depart)) throw new Exception ("Sommet de depart inexistant");
		if(!leGraphe.containsKey(arrivee)) throw new Exception("Sommet d'arrivé inexistant"); 
		
		HashMap<String, Integer> chemins = leGraphe.get(depart);
		
		if(chemins.containsKey(arrivee))
			throw new Exception ("Ce chemin existe deja");
		chemins.put(arrivee,distance);
	
	}
	
	public void ajouteCheminSiCheminSiAbsentMAJsiExistant (String depart, String arrivee, Integer distance) throws Exception{
		if(!leGraphe.containsKey(depart))  this.ajouteSommet(depart);
		if(!leGraphe.containsKey(arrivee)) this.ajouteSommet(arrivee);
		
		HashMap<String, Integer> chemins = leGraphe.get(depart);
		
		if(chemins.containsKey(arrivee))
		chemins.replace(arrivee,distance);
		else
			chemins.put(arrivee, distance);
	}
	public Integer distance (String depart, String arrivee) {
		if(!leGraphe.containsKey(depart)) return null;
		if(!leGraphe.containsKey(arrivee)) return null;
		HashMap<String, Integer>chemins = leGraphe.get(depart);
		return chemins.getOrDefault(arrivee, null);	
	}
	
	public String toString() {
		return this.leGraphe.toString();
	}
	
}
