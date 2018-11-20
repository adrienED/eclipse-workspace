package exo1;

public class TestStack {

	public static void main (String [] args) throws EmptyStackException {
		
		Stack pile = new LIFOStack();
		Value v1 = new Value( "Un", 1);
		Value v2 = new Value( "Deux", 2);
		
		pile.push(v1);
		pile.push(v2);
		
		try {
		Value depileV = pile.pop();
		System.out.println(depileV);
		
		depileV = pile.pop();
		System.out.println(depileV);
	
		depileV = pile.pop();
		System.out.println(depileV);
	}
		catch (EmptyStackException ese) {
			System.out.println(ese.getMessage());
			System.out.println("Voulez vous ajouter des valeurs à la Pile");
			pile.push(new Value("Default",0));
			System.out.println("Une valeur par default a été ajouté à la pile");
			
		}
		System.out.println("Lala");

}
}
