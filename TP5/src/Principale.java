
public class Principale {
	private static Requete r;
		public static void main (String [] args) {
			r = new Requete ("195.242.73.130 - - [23/Oct/2003:10:26:48 +0200]\"GET / HTTP/1.1\" 200 324\"-\" \"Mozilla/4.0 (compatible; MSIE 5.5; Windows 98; Win 9x 4.90)\"\n");
			//afficher l adresse IP
			System.out.println(r.getAdresseIP());
			System.out.println(r.getDateRequete());
			System.out.println(r.get_StatutRequete());
		}
}
