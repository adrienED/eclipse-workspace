package ensemble;
import java.util.ArrayList;

public class Ensemble {
	
	private ArrayList <Integer> ens;
	
	public Ensemble(){
		
		ens = new ArrayList<>();

	}
	
	public void ajoute (Integer a) {
		this.ens.add(a);
	}
	
	public int taille() {
		return this.ens.size();
		
	}
	public Integer getElement (int i) {
		return this.ens.get(i);
	}
	public String toString() {
		
		String listString = "";

		for (Integer s : ens)
		{
		    listString += s + "\t";
		}
		return listString;
	
	}
	//public Ensemble intersection (Ensemble x) {
		
	}
	
	
	

