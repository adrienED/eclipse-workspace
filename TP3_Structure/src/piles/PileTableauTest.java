package piles;
public class PileTableauTest {
public static void main(String[] args)
{
// TODO Auto-generated method stub
PileTableau pile = new PileTableau(5); // cr�er une pile de taille 4
Object element;
System.out.println("Ajout de 3 �l�ments");
pile.empiler('A'); // empiler 3 elements
pile.empiler('B');
pile.empiler('C');
System.out.println("taille(): "+ pile.taille());
element = pile.depiler(); // supprimer element
System.out.println(element + " est supprim�");
System.out.println("taille(): "+ pile.taille());
System.out.println("Ajout de 3 �l�ments");
pile.empiler('D'); // ajouter 3 �l�ments � la pile 
pile.empiler('E');
pile.empiler('F');
System.out.println(pile.depiler() + " est supprim�");
System.out.println("Ajout d'un �l�ment");
pile.empiler('G'); // empiler un element
element = pile.lireSommet(); // r�cup�rer l'�l�ment sommet de la pile 
System.out.println(element + " est au sommet de la pile");
pile.afficherPile();
}
}