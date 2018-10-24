package gestionVille;

public class TestBien {
	
public static void main (String [] args) {
	
	System.out.println("Test Constructeur par défault");
	Bien b1 = new Bien ();
	if (b1!=null && b1.getCoutEntretienMensuel()==0 && b1.getValEuros()==0 && Bien.getNbExemplaires()==1) {
		System.out.println("OK");
	}
	else 
		System.out.println("Erreur");

	
	System.out.println("Test Constructeur avec paramètres");
	Bien b2 = new Bien (100,20);
	if (b2!=null  &&
		b2.getValEuros()==100 && 
		b2.getCoutEntretienMensuel()==20 &&
		Bien.getNbExemplaires()==2) {
		System.out.println("OK");
	}
	else 
		System.out.println("Erreur");

System.out.println("Test Constructeur avec paramètres");
Logement b3 = new Logement (100,20,10,40);

	


}
}
