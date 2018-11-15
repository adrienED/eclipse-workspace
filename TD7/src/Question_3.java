import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Question_3 {
	
	public static void main (String [] args) {
		
		
		int nb=0;
		int max;
		int min; 
		int somme = 0;
		int n;
		boolean eof = false;
		
		DataOutputStream monfic = new DataOutputStream();
		
		if (!eof) {
			try {
				FileOutputStream f = new FileOutputStream ("temp1");
				

			
				
				n = monfic.readInt();
				
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
