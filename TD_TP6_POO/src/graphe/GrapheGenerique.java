	package graphe;

	import java.util.HashMap;

public class GrapheGenerique {

		
		HashMap<String, HashMap<String,Integer>> m;
		
		public GrapheGenerique() {
			this.m = new HashMap<String, HashMap<String,Integer>>();
			
		}
		
		public void ajouteSommet(String nomS) throws Exception{
			if(m.containsKey(nomS))
				throw new Exception ("Ce sommet existe déja");
			m.put(nomS, new HashMap<String,Integer>());
			
			
		}
		
		public void ajouteChemin(String depart , String arrivee, Integer distance) throws Exception{
			if(!m.containsKey(depart)) throw new Exception ("Sommet de depart inexistant");
			if(!m.containsKey(arrivee)) throw new Exception("Sommet d'arrivé inexistant"); 
			
			HashMap<String, Integer> chemins = m.get(depart);
			
			if(chemins.containsKey(arrivee))
				throw new Exception ("Ce chemin existe deja");
			chemins.put(arrivee,distance);
		
		}
		
		public void ajouteCheminSiCheminSiAbsentMAJsiExistant (String depart, String arrivee, Integer distance) throws Exception{
			if(!m.containsKey(depart))  this.ajouteSommet(depart);
			if(!m.containsKey(arrivee)) this.ajouteSommet(arrivee);
			
			HashMap<String, Integer> chemins = m.get(depart);
			
			if(chemins.containsKey(arrivee))
			chemins.replace(arrivee,distance);
			else
				chemins.put(arrivee, distance);
		}
		public Integer distance (String depart, String arrivee) {
			if(!m.containsKey(depart)) return null;
			if(!m.containsKey(arrivee)) return null;
			HashMap<String, Integer>chemins = m.get(depart);
			return chemins.getOrDefault(arrivee, null);	
		}
		
		public String toString() {
			return this.m.toString();
		}
		
	}


