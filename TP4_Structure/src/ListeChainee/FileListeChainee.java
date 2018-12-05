package ListeChainee;



public class FileListeChainee {
	
	
		class Maillon {
			
		Object element; // element de donnee
		Maillon suivant; // prochain maillon dans la liste chainee
		
		Maillon( Object e ) // constructeur
		{
			element = e; // le prochain est automatiquement mis à null 
			}
		}
		
		Maillon debut, fin,p,courant;
		
		public int nbElements=0;
		
		
		
		
		public void enfiler(Object ob) {
			
			
			p = new Maillon (ob);
			if (nbElements==0) {
			debut=debut.suivant=p;
			
			nbElements++;
			}
			
			else {
			debut.suivant = p;
			debut=debut.suivant;
			
			nbElements++;
			}
}
			
		
		
		
		public void defiler() {
			
			Maillon defiler = debut;
			debut=debut.suivant;
			nbElements--;
			
		}
		
		public void afficherFile() {
			

				courant = debut;
				System.out.print("\nListe chainée : ");

				while (courant !=null)
				{
					System.out.print(courant.element +" ->");
					courant = courant.suivant;
		

			
		}
		}
}

	


