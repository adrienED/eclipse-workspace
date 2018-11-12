package Liste;

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

	
	
	
	
}



















