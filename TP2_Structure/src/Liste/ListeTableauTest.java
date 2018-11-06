package Liste;

public class ListeTableauTest {

		public static void main(String[] args) { // TODO Auto-generated method stub
		
		ListeTableau listesimple = new ListeTableau(10);
		listesimple.initialiserListe();
		listesimple.creerListe(8); // creer 4 maillon
		listesimple.afficher(); // afficher la liste
		System.out.print("Inserer au début 45:");
		listesimple.insererDebut(45);
		listesimple.afficher();
		System.out.print("Inserer 50 après 35:");
		listesimple.insererApres(50, 35); // inseerer 66 apres 33 listesimple.afficher();
		Object item = listesimple.supprimerDebut(); 
		System.out.print("Maillon supprimé: " + item);
		listesimple.afficher();
		item = listesimple.supprimerApres(25); // supprimer le maillon apres le maillon 25 System.out.print("Maillon supprimé : " + item); listesimple.afficher();
		System.out.println("taille(): " + listesimple.taille());
		
		}

}
