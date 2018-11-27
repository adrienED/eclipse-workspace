package graphe;

public class TestGraphe {

	public static void main(String[] args) throws Exception {

		String A = "A";
		String B= "B";
		String C = "C";
		String K = "K";

		
		Graphe g= new Graphe();
		System.out.println(g);
		
		g.ajouteSommet(A);
		System.out.println(g);
		
		g.ajouteSommet(B);
		System.out.println(g);
		
		g.ajouteChemin(A, B, 3);
		System.out.println(g);
		
		g.ajouteChemin(B, A, 3);
		System.out.println(g);
		
		g.ajouteCheminSiCheminSiAbsentMAJsiExistant(A, K, 1);
		System.out.println(g);
		
		g.ajouteCheminSiCheminSiAbsentMAJsiExistant(B, A, 2);
		System.out.println(g);
		
		
		
	}

}
