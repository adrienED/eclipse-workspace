	package ensemble;
	import java.util.ArrayList;

public class ensembleGenerique <E> {


	
		private ArrayList <E> elements;
		
		public ensembleGenerique(){
			
			this.elements = new ArrayList<>();
		}
		
		public void ajoute (E a) {
			this.elements.add(a);
		}
		
		public int taille() {
			return this.elements.size();
			
		}
		public E getElement (int i) {
			if (i>=this.taille()) {
				throw new TailleDepasseeException(i);
			}
			return elements.get(i);
		}
		public String toString() {
			
			return this.elements.toString();
			
			/*String listString = "";
			for (Integer s :x elements)
			{   listString += s + "\t";}
			return listString;
		*/
		}
		public ensembleGenerique<E> union (ensembleGenerique<E> b) {
			ensembleGenerique<E> resultat = new ensembleGenerique<>();
			for (int i= 0; i<elements.size();i++)
				resultat.ajoute(elements.get(i));
			for (int i = 0; i<b.taille();i++)
				if (!elements.contains(b.getElement(i)))
					resultat.ajoute(b.getElement(i));
			
			return resultat;
		}
		
		public ensembleGenerique<E> intersection (ensembleGenerique<E> b) {
			ensembleGenerique<E> resultat = new ensembleGenerique<>();
			for (int i = 0; i<b.taille();i++)
				if (elements.contains(b.getElement(i)))
					resultat.ajoute(b.getElement(i));
			
			return resultat;
		}
	
}



