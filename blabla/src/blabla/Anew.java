package blabla;

import java.util.Scanner;

public class Anew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X;
		int [] tab= {0,3,-5,8,-10,12};
		int sommeP=0;
		int sommeN=0;
		int Cnul=0;
		int CP=0;
		int CN=0;
		

		
		for (int i =0;i<tab.length;i++) {
			if (tab[i]>0) {
				sommeP=tab[i]+sommeP;
				CP=CP+1;
			}
				else {
						if (tab[i]<0) {
							sommeN=sommeN+1;
							CN=CN+1;
						}
							else {
								Cnul=Cnul+1;
			}
			}
		
		}
		
		int MP=sommeP/CP; 
		
System.out.println(sommeP+" "+MP);
		
		}

	}
