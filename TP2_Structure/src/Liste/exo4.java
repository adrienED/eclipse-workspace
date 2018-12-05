package Liste;

public class exo4 {
	public static void main(String[] args) {
	ListeChainee listesimple1 = new ListeChainee();
	
	ListeChainee listesimple2 = new ListeChainee();
	
	
		listesimple1.initialiserListe();		
	 listesimple1.creerListe1();  	 
	 //listesimple1.afficher();
	 
	 listesimple2.initialiserListe();
	 listesimple2.creerListe1(); 	 
	 //listesimple2.afficher();
	 
	 ListeChainee.exo4CC(listesimple1,listesimple2);
	}
}
