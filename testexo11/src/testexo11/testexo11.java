package testexo11;

public class testexo11 {
	
	
	public static char deplacement(char premiersNombres[][],int i,int j) {
		char cellule = (char) premiersNombres[i][j+1];
		return cellule;
	}

	public static void main(String[] args) {
		
		char premiersNombres[][] = { {'a','c','b','f','g'},{'v','n','m','l','z'} };
		int i = 0;
		int j = 0;
	
	System.out.println("la lettre est "+deplacement(premiersNombres, i, j));
		
		
	}

}

