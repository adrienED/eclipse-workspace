import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class QUestion_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		DataOutputStream monfic = null;
		
		try {
		FileOutputStream f = new FileOutputStream ("temp1");
		
		monfic = new DataOutputStream(f);
		
			//for (int i =0; i<20;i++) {
			int n = 256*256*256 * 'J' +256*256*'A' +256* 'V' +'A';
			//int n = (int) (Math.round(Math.random()*70)-20);
			monfic.writeInt(n);
			//}
	
		}
		catch (IOException e) {
		System.out.println("erreur");
		}
		
		finally {
		if(monfic !=null) monfic.close();
		}
	}


public static int alea() {
	return (int) (Math.round(Math.random()*70)-20);

}
}
// Dans le fichier on voit qu'il y a des caractères sans signification particulières, il
//y en a 80 (20x4)
//2eme essaie : entier appartient [65-91]
//_ _ _ X _ _ _ Y _ _ _ K
//1 entier = 4 octets = decomposer en 4 octets. Si n <255, il "tient" sur 1 seul octet
//l'octet de poid faible est à droite 
//ex : 65 => 0,0,0,65 ; qui affiche _ _ _ A

//Pour ecrire java il faut 65 86 65 74 (code ASCII)

	



