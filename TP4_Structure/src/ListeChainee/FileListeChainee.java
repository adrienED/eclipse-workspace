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
		int nbElements;
		
		
		
		
		public void enfiler(Object ob) {
			
			Maillon debut= new Maillon (ob);
			
			nbElements++;
			
		}
		
		
		public void defiler() {
			
			
			
		}
		
		public void afficherFile() {
			
			System.out.print("File Liste Chainee F : ");
			
			while (fin==null) {
				
			System.out.print(fin.element);
			fin=fin.suivant;
			
			}	
			System.out.println("\n");
		}
	}


