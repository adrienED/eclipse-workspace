package pil;

public class PileListeChainee {

 class Maillon {
		
	Object element; // element de donnee
	Maillon suivant; // prochain maillon dans la liste chainee
	
	Maillon( Object e ) // constructeur 
	
	{
		element = e; // le prochain est automatiquement mis à null 
		}
	}
	
	Maillon sommet; // sommet de la pile
	Maillon p; // maillon courant



	public void empiler(Object ob) {

		this.p= new Maillon (ob);
		sommet= p;
		
	
		
	}

	public Object depiler() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object lireSommet() {
		return this.sommet.element;
	}

	public boolean pileVide() {
		// TODO Auto-generated method stub
		return false;
	}

	public int taille() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void afficherPile() {
		
		while (p.element !=null) {
			
		System.out.print("PIle : ["+this.p.element);
		p=p.suivant;
		}
	}
}
