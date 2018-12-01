package explesCours;

import javax.swing.JFrame;

public class MaFenetre extends JFrame {
	public MaFenetre ()   // constructeur
  	{ 
			setTitle ("Ma premi�re fen�tre") ;
    			setSize (300, 150) ;
  	}
	
	public static void main (String args[]){ 
		JFrame fen = new MaFenetre() ; // créer un cadre
		fen.setVisible (true) ; // rendre visible la fen�tre
	}
}
