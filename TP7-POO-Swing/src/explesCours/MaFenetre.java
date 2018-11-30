package explesCours;

import javax.swing.JFrame;

public class MaFenetre extends JFrame {
	public MaFenetre ()   // constructeur
  	{ 
			setTitle ("Ma première fenêtre") ;
    			setSize (300, 150) ;
  	}
	
	public static void main (String args[]){ 
		JFrame fen = new MaFenetre() ; // créer un cadre
		fen.setVisible (true) ; // rendre visible la fenêtre
	}
}
