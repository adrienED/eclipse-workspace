package gestionVille;

public class TestVille {

	
	public static void main(String[] args) {
		Ville tours = new Ville("Tours");
		
		tours.ajouterBien(new Vehicule());
		tours.ajouterBien(new Logement());
		tours.ajouterBien(new Vehicule(10,10,"10",5));
		tours.ajouterBien(new Logement(15,15,50,3));
		
		System.out.println(tours.getCoutTotalEntretienVehicules());
		
		System.out.println(tours.getInfoBienParticulier(2));
	}

}
