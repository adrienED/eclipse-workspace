
public class TestTriplet {

	public static void main(String[] args) {

		Triplet<String> TS = new Triplet<String>("un", "deux", "trois");

		System.out.println(TS.affiche());

		Triplet<Double> DS = new Triplet<Double>(1., 2., 3.);

		System.out.println(DS.affiche());
		
		
		TripletH<Double,String,Integer> TH = new TripletH<Double,String,Integer>(1., "Deux", 3);

		System.out.println(TH.affiche());
		
		Double n = TH.getPremier();
		System.out.println("Premier : "+n);
		
		String t = TH.getSecond();
		System.out.println("Premier : "+t);
		
		Integer v = TH.getTroisieme();
		System.out.println("Premier : "+v);
		
	}
	
}
