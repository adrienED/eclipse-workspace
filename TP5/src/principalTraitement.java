
public class principalTraitement {


	public static void main(String[] args) {
		
	Traitement chaine = new Traitement("195.242.73.130 - - [23/Oct/2003:10:26:48 +0200]\"GET / HTTP/1.1\" 200 324\"-\" \"Mozilla/4.0 (compatible; MSIE 5.5; Windows 98; Win 9x 4.90)\"\n");
		
	
	System.out.println(Traitement.getAdresseIP());
	
	
	}
	
	
	

}
