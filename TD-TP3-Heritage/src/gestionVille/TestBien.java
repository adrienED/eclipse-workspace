package gestionVille;

public class TestBien {

	public static void main(String[] args) {
		System.out.println("Test Constructeur par défaut ");
		
		Bien b1 = new Vehicule();//Bien();
		
		if(b1!=null 
				&& b1.getCoutEntretienMensuel()==0
				&& b1.getValEuros()==0
				&& Bien.getNbExemplaires()==1) {
			System.out.println("OK");
		}
		else
			System.out.println("Erreur");
		
		System.out.println("Test Constructeur avec paramètres ");
		Bien b2 = new Vehicule(100,20,"100-AAA-37",5);//Bien(100,20);
		if(b2!=null 
				&& b2.getCoutEntretienMensuel()==20
				&& b2.getValEuros()==100
				&& Bien.getNbExemplaires()==2) {
			System.out.println("OK");
		}
		else
			System.out.println("Erreur");
		
	}

}
