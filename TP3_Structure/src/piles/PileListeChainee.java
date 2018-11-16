package piles;

public class PileListeChainee implements Pile {

	
	class Maillon {
	Object element; // element de donnee
	Maillon suivant; // prochain maillon dans la liste chainee
	Maillon( Object e ) // constructeur 
	
	{
		element = e; // le prochain est automatiquement mis à null }
	}
	
	Maillon sommet; // sommet de la pile
	Maillon p; // maillon courant
	
	}

	@Override
	public void empiler(Object ob) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object depiler() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object lireSommet() {
		return
	}

	@Override
	public boolean pileVide() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void afficherPile() {
		// TODO Auto-generated method stub
		
	}
}
