package Tableau;

public class FileTableauTest {

	public static void main(String[] args)
	{
	
	/* file pouvant contenir un maximum de 5 elements */ 
	FileTableau f = new FileTableau(5);
	Object element;
	f.enfiler('A');
	f.enfiler('B');
	f.enfiler('C');
	f.afficherFile();
	element = f.defiler();// supprimer 1 element System.out.println(element + " est supprim�");
	element = f.defiler();
	System.out.println(element + " est supprim�");
	f.afficherFile();
	/*
	f.enfiler('D'); // ajouter 3 nouveaux elements 
	f.enfiler('E');
	f.enfiler('F');
	f.afficherFile();
	element = f.defiler();
	System.out.println(element + " est supprim�");
	f.afficherFile();
	System.out.println("lireDebut(): " + f.lireDebut());
	f.enfiler('G');
	f.afficherFile();
	System.out.println("taille file : " + f.taille());
	
	*/
	}
	}

