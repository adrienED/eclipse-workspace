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
		
		Maillon debut, fin;
		int nbElements=0;
	
		
		
		
		
		public void enfiler(Object ob) {
			
			
			fin = new Maillon (ob);
			
			if (nbElements==0)
			debut= fin;
			debut.suivant=fin;
			
			nbElements++;
			
			
//			debut=fin;
//			fin = new Maillon(ob);
//			if (nbElements==0) {
//			fin.suivant=null;
//			
//			}
//			else {
//				
//				fin.suivant=debut;
//			}
//			
//			
//			nbElements++;
			
		}
		
		
		public void defiler() {
			
			
			
		}
		
		public void afficherFile() {
			
			int i=0;
			System.out.print("File Liste Chainee F : ");
			
			while (i<nbElements) {
				
			
			
			System.out.print(debut.element+ " ");
			debut=debut.suivant;
			
			i++;
			}	
			System.out.println(nbElements);
		}
	}


