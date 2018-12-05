 package arbre;

public class TestArbreBinaire {

	public static void main(String[] args) {
		ArbreBinaire ab = new ArbreBinaire();
		ab.ajout(6);
		ab.ajout(4);
		ab.ajout(8);
		ab.ajout(3);
		ab.ajout(5);
		ab.ajout(7);
		ab.ajout(9);
	
		/*(a) Inorder (Left, Root, Right)
		 *  (b) Preorder (Root, Left, Right)
		 *   (c) Postorder (Left, Right, Root)
		 *    (d) Breadth First or Level Order Traversal */
		/*ab.parcoursOrdre(ab.racine);
		System.out.println();
		ab.parcoursPreOrdre(ab.racine);
		System.out.println();
		ab.parcoursPostOrdre(ab.racine);
		System.out.println();
		ab.parcoursLargeur();
		System.out.println();
		System.out.println(ab.contientSommet(6));
		System.out.println(ab.contientSommet(4));
		System.out.println(ab.contientSommet(1));
		System.out.println(ab.taille());
		*/
		} 
	}

