
public class Methode_dichtomique {

	public static void main(String[] args) {

//System.out.println(fx(2));
System.out.println(iterations(1,2,Math.pow(10, -5)));
//System.out.println((Math.log(20-5)-Math.log(1))/Math.log(2));
//affiche();
	
		}

	public static double fx (double x) {
		
		return  Math.pow(x, 3)-2*Math.pow(x, 2)+x-0.5;
		 	
		
	}
	
	public static int iterations (double a,double b,double epsi) {
		
		int n=0;
		while (n<((Math.log(b-a)-Math.log(epsi))/Math.log(2)))
		n+=1;
		return n;
	}
	
	public static void affiche () {

		
		double a= 1.0;
		double b =2.0;
		double epsi = Math.pow(10 ,-5);
		
		int it=iterations(a,b,epsi);
		for (int n=0; n<=it; n++ ) {
		
		
		
			double m = (a+b)/2;
		
		if ((fx(a)>0 && fx(m)>0) || (fx(a)<0 && fx(m)<0)) {
			a= m;
			
		}
		else {
			b=m;
			
		}
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("m= "+m);
		System.out.println("f(m)= "+fx(m));
		System.out.println("(b-a) "+ (b-a));
		System.out.println("n= "+n);
		
		}
	}

		
			
	}
	
	
	

