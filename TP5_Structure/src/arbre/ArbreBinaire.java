package arbre;



public class ArbreBinaire implements ArbreBinaireInterface {

	Sommet racine;
	int nbElements=0; 
	

	public void ajout (int valeur) {
		racine = ajoutRecursive (racine, valeur);
		nbElements++;
		
		
	}
	
	
	
	
	private Sommet ajoutRecursive(Sommet courrant, int valeur) {
		
		if(courrant == null) {
			return new Sommet(valeur);
		}
		
		if (valeur < courrant.valeur) {
			courrant.gauche = ajoutRecursive(courrant.gauche, valeur);
			
		}
		else if (valeur >courrant.valeur) {
			courrant.droite = ajoutRecursive(courrant.droite, valeur);
		
		}
		return courrant;
	}


	@Override
	public boolean estVide() {

		return racine==null;
		
	}




	@Override
	public int taille() {
		
		return tailleRecursive(racine);
	}
	
	private int tailleRecursive(Sommet courant) {
		if(courant == null) return 0;
		else return tailleRecursive(courant.gauche)+1+tailleRecursive(courant.droite); 
	}




	@Override
	public boolean contientSommet(int valeur) {
		return contientSommetRecursive(racine,valeur);
		
	}
	
	private boolean contientSommetRecursive(Sommet courrant, int valeur) {
		if (courrant == null) {
			return false;
			
		}
		if (valeur == courrant.valeur) {
			return true;
		}
		if(valeur <courrant.valeur) return contientSommetRecursive (courrant.gauche, valeur );
		else return contientSommetRecursive(courrant.droite,valeur);
	}




	@Override
	public void suppression(int valeur) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void parcoursOrdre(Sommet sommet) {
		parcoursOrdreRecursive(sommet,racine);
		
		
	}

	private void parcoursOrdreRecursive(Sommet courant, Sommet racine) {
		
		
		
	}
	


	@Override
	public void parcoursPreOrdre(Sommet sommet) {
	
		
		
	}




	@Override
	public void parcoursPostOrdre(Sommet sommet) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void parcoursLargeur() {
		// TODO Auto-generated method stub
		
	}

}
