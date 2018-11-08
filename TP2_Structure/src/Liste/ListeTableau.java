package Liste;

import java.util.Arrays;

public class ListeTableau implements Liste { 
	
	
	
	class Maillon
	{
	Object info; int suivant;
	Maillon(Object ob, int i){
		info=ob;
		suivant=i;		
	}
	}
	
	
	int MAXTAILLE;
	Maillon liste[];
	int tete, nbrElements;
	// nbr maximum de Maillons dabs la liste Maillon liste[];
	// creer une liste sous forme de tableau int tete, nbrElements;
	// nbrElements: nombre de maillons 
	//à un moment donné dans la liste
	
	ListeTableau( int s)
	{
		// constructeur 
		{ 
			MAXTAILLE = s; 
			liste = new Maillon[MAXTAILLE]; 
		}
		}
		
	public void initialiserListe() { 
		
	for (int p=0; p<MAXTAILLE; p++) {
		liste[p]=new Maillon(null,p+1);
		
		liste[MAXTAILLE-1]= new Maillon(null,-1);
	}
		
		
	}

	@Override
	public void creerListe(int n) {
	
		int p;
		for (p=0;p<n;p++) {
			liste[p]= new Maillon (5+p*5, p+1);
			nbrElements++;
			
		}
		
		liste[p-1].suivant =-1;
		
	}

	@Override
	public void insererDebut(Object ob) {
		
		
	}

	@Override
	public void insererApres(Object ob, Object pos) {
		
		
	}

	@Override
	public Object supprimerDebut() {
		
		return null;
	}

	@Override
	public Object supprimerApres(Object pos) {
		
		return null;
	}

	@Override
	public boolean listeVide() {
		
		return false;
	}

	@Override
	public int taille() {
		
		return 0;
	}

	@Override
	public void afficher() {
		int p = tete;
		System.out.print("\nListe:[ ");
		while ( p!=-1)
		{
			System.out.println(liste[p].info+" ");
			p=liste[p].suivant;
		}
		
	}
	}

