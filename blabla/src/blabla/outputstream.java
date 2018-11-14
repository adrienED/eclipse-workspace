package blabla;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class outputstream {
	
	public static void main (String [] args) {
	
	DataOutputStream sortie = null;
	
	try
	{ 
	FileOutputStream f = new FileOutputStream("monFichier"); 
	sortie = new DataOutputStream(f); 
	sortie.writeInt(15); 
	sortie.writeInt(4); 
	sortie.writeInt(8); 
	} 
	catch(IOException e){ 
	System.out.println("Erreur fichier"); 
	}
	finally{ 
	sortie.close();}
}
	



