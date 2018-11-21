import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.DataInputStream;

public class Question_3 {
	
	public static void main (String [] args) throws IOException {
		
		
		int nb=0;
		int max=0;
		int min=0; 
		int somme = 0;
		int n=0;
		boolean eof = false;

		
		DataInputStream dis = null;

		
		
			if(!eof) {
			try {
				
				FileInputStream is = new FileInputStream("Q3.txt.txt");	
				dis = new DataInputStream(is);
				//FileReader f = new FileReader ("temp2");
				//entree = new BufferedReader(f);
				n=dis.readInt();
				
				if (nb == 0) {
					max = n;
					min = n;
					somme = n;
				}
				else {
					if (max<n) max = n;
					if (min>n) max = n;
					somme+=n;
				}
				n++;
				
			}
			catch (IOException e) {
				eof = true;
			}
		
			
			}
		
		System.out.println("max="+max);
		System.out.println("min="+min);
		System.out.println("moyenne="+(double)somme/n);
	}

}
