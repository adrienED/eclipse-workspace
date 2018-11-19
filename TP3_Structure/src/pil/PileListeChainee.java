package pil;

public class PileListeChainee {

 class Maillon {
		
	Object element; // element de donnee
	Maillon suivant; // prochain maillon dans la liste chainee
	
	Maillon( Object e ) // constructeur 
	
	{
		element = e;  // le prochain est automatiquement mis à null 
		
		}
	}
	
	Maillon sommet; // sommet de la pile
	Maillon p; // maillon courant
	int nb=0;


	public void empiler(Object ob) {

	
		p= new Maillon (ob);
		p.suivant= sommet;
		sommet=p;
		nb++;
			
	}

	public Maillon depiler() {
		Maillon depiler = sommet;
		sommet=sommet.suivant;
		
		nb--;
		
		return depiler;
	}

	public Maillon lireSommet() {
		return sommet;
	}

	public boolean pileVide() {
		if (sommet !=null)
		return false;
		else 
			return true;
	}

	public int taille() {
		
		return nb;
	}

	public void afficherPile() {
		p=sommet;
		while (p !=null) {
			
		System.out.print("["+p.element+"]");
		p=p.suivant;
		
		}	
		System.out.println(p);
	}
}
