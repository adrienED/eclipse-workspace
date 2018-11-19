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
		
			file[debut+1]=ob;
			debut ++;
			fin++;
			
		}
		

	

	@Override
	public Object defiler() {

		Object defiler =file[fin];
		
		file[fin]=null;		
		fin--;
		return defiler;
	}

	@Override
	public Object lireDebut() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean fileVide() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void afficherFile() {

		for (int i =0; i<file.length; i++) {
			System.out.println(file[i]);
		}
		
		
	}

}
