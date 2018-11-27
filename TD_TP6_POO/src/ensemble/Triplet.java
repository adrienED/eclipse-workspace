package ensemble;

public class Triplet<E> {

	private E premier;
	private E second;
	private E troisieme;

	public Triplet(E p, E s, E t) {
		this.premier = p;
		this.second = s;
		this.troisieme = t;
	}

	public E getPremier() {
		return this.premier;
	}

	public E getSecond() {
		return this.second;
	}

	public E getTroisieme() {
		return this.troisieme;
	}

	public String affiche() {

		return "premiere valeur : "+this.getPremier() + "deuxieme valeur : " + this.getSecond() + "troisieme valeur :  " + this.getTroisieme();
	}

	public static void main(String[] args) {

		Triplet<String> TS = new Triplet<String>("un", "deux", "trois");

		System.out.println(TS.affiche());

		Triplet<Double> DS = new Triplet<Double>(1., 2., 3.);

		System.out.println(DS.affiche());
	}
}