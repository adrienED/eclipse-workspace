
	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;

		
public class cas_general {

		public static void main (String [] args) throws IOException {

		BufferedReader entree = null;
		
		boolean eof = false;
		
		while (!eof) {
		
		
		try {
			FileReader f = new FileReader ("temp1");
			entree = new BufferedReader(f);
			
			String ligne = "";
			
			
				
				ligne = entree.readLine();
				if (ligne != null) System.out.println(ligne);
				
			}
		}
		catch (IOException e) {
			eof = true;
		}
		finally {
			entree.close();}
		}
	}

}
