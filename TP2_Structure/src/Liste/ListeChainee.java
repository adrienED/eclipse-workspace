package Liste;

import java.util.Scanner;

public class ListeChainee implements Liste{

	class Maillon 
	{
		Object element;
		Maillon suivant;
		
		Maillon (Object d)//
		{
			element = d;
			suivant = null;
		}
	}

	 
	Maillon tete ;
	int nbrElements;

	Maillon courant;

	public void ListChainee() {
		tete = null;
		nbrElements = 0;
		
	}
	@Override
	public void afficher() 
	{

		courant = tete;
		System.out.print("\nListe chainée : ");

		while (courant !=null)
		{
			System.out.print(courant.element +" ->");
			courant = courant.suivant;
}

			System.out.println(courant);
	}
@Override
public void initialiserListe() {
	tete = null;
	nbrElements = 0;
}

@Override
public void creerListe (int n) 

{
	courant = new Maillon (5);
	tete = courant;
	
	for (int i =1; i<n;i++)
	{
		courant = courant.suivant = new Maillon (5*i+5);
		
	}
	nbrElements = n;
}



public void creerListe1 () 

{
	int p=0;
	int n;
	System.out.println("Premier chiffre ?" );
	Scanner sc = new Scanner (System.in);
	n = sc.nextInt();
	courant = new Maillon (n);
	tete = courant;
	
	while (n!=0)
	{
		System.out.println("Prochain chiffre ?" );
		Scanner sd = new Scanner (System.in);
		n = sd.nextInt();
		if (n!=0)
		courant = courant.suivant = new Maillon (n);
		
	}
	nbrElements = p++;
}


	@Override
	public void insererDebut(Object item) {
		
		courant = new Maillon (item);
		courant.suivant = tete;
		tete= courant;
		nbrElements++;
		
	}

	@Override
	public void insererApres(Object item, Object cle) {
		
		courant = trouver(cle);
		if(courant == null)
			System.out.println(cle + " la clé n'a pas été trouvée");
		
		else
		{
			Maillon q = new Maillon (item); // creer un nouveau Maillon
			q.suivant= courant.suivant; // le nouveau Maillon.suivant fait référence
			courant.suivant=q;		// courant.suivant fait référence au nouveau Maillon
			nbrElements++;
		}
	
	}
	
	
	public Maillon trouver (Object key) {
		
		courant=tete;
		while(courant!=null)
		{
			if(courant.element == key) return courant;
			courant = courant.suivant; //passer au maillon suivant
		}
		return null;
	}

	
	public Object supprimerDebut() {
	
			if (listeVide())
			{
				System.out.println("La liste est vide : pas de suppression");
				return null;
			}
			
		Maillon tmp=tete; 
		tete = tete.suivant;
		nbrElements--;
		return tmp.element;
		
	}

	
	public Object supprimerApres(Object cle) {
		
		courant = trouver(cle);
		
		if (courant == null)
				{
			System.out.println(cle+" la clé n'a aps été trouvée");
			return null;
				}
		
		if(courant.suivant == null)
		{
			System.out.println("Pas de suppression");
			return null;
		}
		
		else 
		{
			Maillon tmp = courant.suivant;
			courant.suivant = tmp.suivant;
			nbrElements--;
			return tmp.element;
		}
		
		
	}

	
	public boolean listeVide() {
		
		if(tete==null) return true;
		else return false;
		
	}

	
	public int taille() {
		
		
		return nbrElements;
	}
		
		/*int n=1;
		courant=tete;
		while(courant.suivant!=null)
		{
			courant = courant.suivant; //passer au maillon suivant
			n++;
		}
		
		
		return n;
	}
	*/
	
	
	
	public void afficherMultiple (int n) {
		
		courant=tete;
		System.out.println("\nListe Chainee : ");
		
		while (courant.suivant!=null) {
			
		
		if ((int)courant.element%n==0) System.out.print(courant.element+ " ->");
			courant=courant.suivant;
		
	}
		
		System.out.println(courant.element);
	}
	
	public ListeChainee entrelacer (ListeChainee liste2 ) {
		Maillon l1 = tete;
		Maillon l2 = liste2.tete;
		
		
		
		while (l1 !=null && l2!=null ) {
			
			
			Maillon tmp1;
			Maillon tmp2;
			
			tmp1 =l1.suivant;
			tmp2=l2.suivant;
			
			
			l1.suivant=l2;
			l2.suivant=tmp1;
			
			l1=tmp1;
			l2=tmp2;
					
			
			
			
		}
		return this;
		
		
	}
	
	

	
	

	
	
	
	
	/*
	
	
	
	
	
	
	
	public static void exo4CC (ListeChainee liste1, ListeChainee liste2) {
		
		Maillon tmp1=liste1.tete;
		Maillon tmp2=liste2.tete;
		
		ListeChainee l1=liste1;
		ListeChainee l2 = liste2;
		
		tmp2=l2.suivant;
		l2=l1;
		
		while (l1.suivant !=null) {
			l1=l1.suivant;
			
		}
		l1.suivant=tmp2;
		
		
		
		System.out.print("\nListe chainée : ");
		
		while (l1 !=null)
		{
			System.out.print(l1.element +" ->");
			l1 = l1.suivant;
}

			System.out.println(l1);
	
	while (l2 !=null)
	{
		System.out.print(l2.element +" ->");
		l2 = l2.suivant;
}

		System.out.println(l2);
	
	
	
	}
	*/

	
	
	
	
}




















