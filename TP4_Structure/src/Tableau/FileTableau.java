package Tableau;

public class FileTableau implements File {

	
		private int tailleMax; // taille maximale de la filee
		private Object[] file; // la file est un tableau private
		int debut;
		private int fin;
		private int nbElements; // taille de la file
		
		public FileTableau(int s) // constructeur 
		{ 
		tailleMax = s;
		file = new Object[tailleMax];
		debut = fin = -1;
		nbElements = 0; 

		}

	@Override
	public void enfiler(Object ob) {
		
		if ((debut+fin)>=5) file[fin-1]=ob;
		else {
		
			debut ++;	
			file[debut]=ob;
			
		}	
		}
	@Override
	public Object defiler() {
		
		Object defiler =file[fin+1];
		
		fin++;
		file[fin]=null;
		return defiler;
	}

	@Override
	public Object lireDebut() {
		
		return file[debut-1];
	}

	@Override
	public boolean fileVide() {
		if (debut==fin) return true;
		return false;
	}

	@Override
	public int taille() {
		
		return file.length-1;
	}

	@Override
	public void afficherFile() {
		System.out.print("File : ");
		
		for (int i =0; i<file.length; i++) {
			System.out.print( file[i]+" ");
		}

	System.out.println("\n");
	}
}
