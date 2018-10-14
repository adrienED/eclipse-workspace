import java.util.Scanner;

/**
 * Un objet Songage permet de réaliser (définir, effectuer) un sondage.
 * Cet objet propose des méthodes pour définir la question, les réponses possibles,
 * effectue le sondage c'est à dire collecte les réponses, et affiche les résultats.
 * @author thierrybrouard
 *
 */
public class blabla// nombre de réponses possible à la question

	private int nbchoix;
	// question à poser
	private String question;
	// tableau des réponses possibles 
	private String tabChoix[];
	// compteurs du nombre de fois où chaque réponse a été choisie
	private int tabReponses[];
	
	/**
	 * Définition de l'objet sondage
	 * On doit lui fournir la question posée ainsi que le nombre de réponses possibles
	 * @param i nombre de réponses possibles
	 * @param string question posée
	 */
	
	
	public Sondage(int i, String string) {
		this.nbchoix = i;
		this.question = string;
		this.tabChoix = new String[this.nbchoix];
		this.tabReponses = new int[this.nbchoix];
	}

	/**
	 * Ajout d'une réponse possible au sondage
	 * @param i numéro de la réponse (ordre d'affichage) à partir de 1
	 * @param string texte de la réponse
	 */
	public void ajouteReponse(int i, String string) {
		this.tabChoix[i-1] = string;
	}

	public void saisie() {

	}


	/**
	 * Affiche le questionnaire en vue d'en faire la saisie. 
	 * Cette méthode interne est utilisée par la méthode saisie()
	 * Elle affiche la question posée, la liste des choix ainsi que 
	 * l'option de sortie.
	 * @see #saisie
	 */
	private void afficheQuestionnaire() {
		
		System.out.println(this.question);
		for (int i=0; i<this.tabChoix.length; i++) {
			System.out.println("  -"+(i+1)+"-  "+this.tabChoix[i]);
		}
		System.out.println("  -0-  FIN DE SAISIE");
	}

	
	/**
	 * Affiche les résultats bruts de la saisie
	 * Affiche le nombre de fois où chaque choix a été exprimé
	 * La mise en page est la même que celle proposée par la méthode interne
	 * afficheQuestionnaire(), le numéro du choix est remplacé par le nombre 
	 * de fois où le choix a été exprimé.
	 */
	public void afficheResultatsNombres() {
		// TODO Auto-generated method stub
		System.out.println("Resultats du sondage : " + this.question);
		for (int i=0; i<this.tabChoix.length; i++) {
			System.out.println("  ["+this.tabReponses[i]+"]  "+this.tabChoix[i]);
		}
		System.out.println();		
	}

	public void afficheResultatsPourcentages() {
		
	}

	public void afficheResultatsBarres() {
		

	}

}
