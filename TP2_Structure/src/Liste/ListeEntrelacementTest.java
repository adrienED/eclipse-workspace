package Liste;
import java.util.Scanner;

public class ListeEntrelacementTest {

	public static void main(String[] args) {
		ListeChainee listesimple1 = new ListeChainee();
		
		ListeChainee listesimple2 = new ListeChainee();
		
		
		listesimple1.initialiserListe();		
		 listesimple1.creerListe1();  	 
		 listesimple1.afficher();
		 
		 listesimple2.initialiserListe();
		 listesimple2.creerListe1(); 	 
		 listesimple2.afficher();


		 listesimple1=listesimple1.entrelacer(listesimple2);
		 listesimple1.afficher();
	
	/*
	ListeChainee.Maillon tmp ,tmp2;
	tmp= listesimple2.tete;
	tmp2=listesimple1.tete;
	listesimple1.tete=listesimple1.tete.suivant;
	listesimple1.tete.suivant=listesimple2.tete;
	listesimple2.tete= tmp2;
	listesimple2.tete.suivant=null;
	
	listesimple1.afficher();
	listesimple2.afficher();
*/	
	

}
}
