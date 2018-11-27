package ensemble;
import java.util.ArrayList;

public class Ensemble {
	
	private ArrayList <Integer> elements;
	
	public Ensemble(){
		
		this.elements = new ArrayList<>();

	}
	
	public void ajoute (Integer a) {
		this.elements.add(a);
	}
	
	public int taille() {
		return this.elements.size();
		
	}
	public Integer getElement (int i) {
		if (i>=this.taille()) {
			throw new TailleDepasseeException(i);
		}
		return elements.get(i);
	}
	public String toString() {
		
		return this.elements.toString();
		
		/*String listString = "";

		for (Integer s : elements)
		{
		    listString += s + "\t";
		}
		return listString;
	*/
	}
	public Ensemble union (Ensemble b) {
		Ensemble resultat = new Ensemble();
		for (int i= 0; i<elements.size();i++)
			resultat.ajoute(elements.get(i));
		for (int i = 0; i<b.taille();i++)
			if (!elements.contains(b.getElement(i)))
				resultat.ajoute(b.getElement(i));
		
		return resultat;
	}
	
	public Ensemble intersection (Ensemble b) {
		Ensemble resultat = new Ensemble();
		for (int i = 0; i<b.taille();i++)
			if (elements.contains(b.getElement(i)))
				resultat.ajoute(b.getElement(i));
		
		return resultat;
	}
		
	}
