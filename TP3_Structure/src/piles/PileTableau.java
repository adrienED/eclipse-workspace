package piles;

public class PileTableau implements Pile 
{ 
private Object t[];
private int sommet; // sommet de la pile


	public PileTableau(int n) // constructeur 
	{ 
		
		t = new Object[n];// creer le tableau qui contiendra la pile 
	sommet = -1; // pas d'éléments dans la pile }
}

	public void empiler(Object ob) {
		
		if (sommet == t.length-1) {
			System.out.println("La pile est pleine");
			return;
		}
		
			sommet ++;
			t[sommet]=ob;
			
		}

	@Override
	public Object depiler() {
		
		if (pileVide()) {
System.out.println("Pile Vide");
		return null;
		}
		
		Object element = t[sommet];
		sommet--;
		return element;
	
	
	}
	
	public Object lireSommet() {
		return this.t[this.sommet];
	}
	
	public boolean pileVide() {
		if (this.sommet==-1) return true;
		return false;
	}
	
	public int taille() {
		return sommet+1;
	}
	
	public void afficherPile() {

		for (int i =this.sommet; i>=0;i--) {
			System.out.println(this.t[i]);
		}
		
		
		
	}
}
