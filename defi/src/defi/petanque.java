package defi;

public class petanque {

	public static void main(String[] args) {
		
		double g=9.806;
		double Vo = 10.0;
		double alpha=0.0;
		double x=0;
		double h=1.2;
		
		double z =h+ (-g/2*Math.pow(Vo, 2))*Math.pow(x, 2)*(1+Math.pow(Math.tan(alpha),2))+x*Math.tan(alpha);
		
		
		
		for (alpha=1.0; alpha<90.;alpha+=0.1)
			  {
		
			
			
			for (x=0.0; x<1.3;x+=0.1) {
				
				z =h-z+ (-g/2*Math.pow(Vo, 2))*Math.pow(x, 2)*(1+Math.pow(Math.tan(alpha),2))+x*Math.tan(alpha);
				System.out.println(z);
			
		}
			
			//alpha+=0.1;
		
		
		}
	}
		
		
	}
	



