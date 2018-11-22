
public class TripletH <E,T,V> {

	private E premier;
	private T second;
	private V troisieme;

	public TripletH(E p, T s, V t) {
		this.premier = p;
		this.second = s;
		this.troisieme = t;
	}

	public E getPremier() {
		return this.premier;
	}

	public T getSecond() {
		return this.second;
	}

	public V getTroisieme() {
		return this.troisieme;
	}

	public String affiche() {

		return "premiere valeur : "+this.getPremier() + "deuxieme valeur : " + this.getSecond() + "troisieme valeur :  " + this.getTroisieme();
	}


}
