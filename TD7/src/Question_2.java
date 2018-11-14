import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question_2 {
	
	public static void main (String [] args) throws IOException {

	BufferedReader entree = null;
	
	try {
		FileReader f = new FileReader ("temp1");
		entree = new BufferedReader(f);
		
		String ligne = "";
		
		while (ligne != null) {
			
			ligne = entree.readLine();
			if (ligne != null) System.out.println(ligne);
			
		}
	}
	catch (IOException e) {
		System.out.println("Erreur fichier");}
	finally {
		entree.close();}
	}
}

