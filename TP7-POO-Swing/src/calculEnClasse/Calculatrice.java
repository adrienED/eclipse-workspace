package calculEnClasse;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculatrice extends JFrame {
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, 
	bPlus, bMoins, bFois, bEgal, bSur, bRAZ;
	
	JPanel panelBoutons;
	
	JTextField zoneResultat;
	
	int opd1;
	int opd2;
	int resultat;
	char operation;
	
	public Calculatrice(){
		setTitle ("Ma première Calculatrice") ;
		setSize (200, 300) ;
		
		declarationBoutons();
		placerBoutons();
		this.getContentPane().add(BorderLayout.NORTH,panelBoutons);
		
		zoneResultat = new JTextField(10);
		zoneResultat.setText("0");
		
		this.getContentPane().add(BorderLayout.SOUTH,zoneResultat);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
		
	}
	public void declarationBoutons(){
		b0 = new JButton("0");
		b1 = new JButton("1");
		b1.addActionListener(new B1Listener());
		b2 = new JButton("2");
		b2.addActionListener(new B2Listener());
		b3 = new JButton("3");
		b3.addActionListener(new B3Listener());
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		bPlus = new JButton("+");
		bPlus.addActionListener(new BPlusListener());
		bMoins = new JButton("-");
		bFois = new JButton("*");
		bSur = new JButton("/");
		bRAZ = new JButton("C");
		bEgal = new JButton("=");
		bEgal.addActionListener(new BEgalListener());
		
	}
	public void placerBoutons(){
		panelBoutons = new JPanel();
		panelBoutons.setLayout(new GridLayout(6,3));
		panelBoutons.add(b0);
		panelBoutons.add(b1);
		panelBoutons.add(b2);
		panelBoutons.add(b3);
		panelBoutons.add(b4);
		panelBoutons.add(b5);
		panelBoutons.add(b6);
		panelBoutons.add(b7);
		panelBoutons.add(b8);
		panelBoutons.add(b9);
		panelBoutons.add(bPlus);
		panelBoutons.add(bMoins);
		panelBoutons.add(bFois);
		panelBoutons.add(bSur);
		panelBoutons.add(bEgal);
		panelBoutons.add(bRAZ);
	}
	
	// les listners des boutons
	 class B1Listener implements ActionListener {
	  		public void actionPerformed(ActionEvent Event) {		
	  			String text = zoneResultat.getText();
	  			if(!text.equals("0"))
	  				zoneResultat.setText(text+"1");
	  			else
	  				zoneResultat.setText("1");
	 	}
	 }
	 class B2Listener implements ActionListener {
	  		public void actionPerformed(ActionEvent Event) {		
	  			String text = zoneResultat.getText();
	  			if(!text.equals("0"))
	  				zoneResultat.setText(text+"2");
	  			else
	  				zoneResultat.setText("2");
	 	}
	 }
	 
	 class B3Listener implements ActionListener {
	  		public void actionPerformed(ActionEvent Event) {		
	  			String text = zoneResultat.getText();
	  			if(!text.equals("0"))
	  				zoneResultat.setText(text+"3");
	  			else
	  				zoneResultat.setText("3");
	 	}
	 }
	 
	 class BPlusListener implements ActionListener {
	  		public void actionPerformed(ActionEvent Event) {		
	  			opd1 = Integer.parseInt(zoneResultat.getText());
	  			operation='+';
	  			zoneResultat.setText("0");
	 	}
	 }
	 
	 class BEgalListener implements ActionListener {
	  		public void actionPerformed(ActionEvent Event) {		
	  			opd2 = Integer.parseInt(zoneResultat.getText());
	  			switch(operation){
	  			case '+' :
	  				resultat = opd1+opd2;
	  				break;
	  			case '-' :
	  				resultat = opd1-opd2;
	  				break;
	  			case '*' :
	  				resultat = opd1*opd2;
	  				break;
	  			default : resultat=0;
	  			}			
	  			zoneResultat.setText(resultat+"");
	  			
	 	}
	 }
	
}
