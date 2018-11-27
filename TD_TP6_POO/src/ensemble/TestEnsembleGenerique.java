package ensemble;

public class TestEnsembleGenerique {
	
	public static void main (String [] args) {
		ensembleGenerique<TripletH<Integer, Point, segment>> A = new ensembleGenerique<TripletH<Integer, Point, segment>>();
		ensembleGenerique<TripletH<Integer, Point, segment>> B = new ensembleGenerique<TripletH<Integer, Point, segment>>();
		ensembleGenerique<TripletH<Integer, Point, segment>> C = new ensembleGenerique<TripletH<Integer, Point, segment>>();
	
	
	int num = 1;
	Point point = new Point (5,10);
	segment seg = new segment (new Point(0,5), new Point (5,15));
	
	TripletH <Integer,Point,segment> bizarre1=
			new TripletH <>(num,point,seg);
	
	TripletH <Integer,Point,segment> bizarre2=
			new TripletH <>(2,point,seg);
	
	TripletH <Integer,Point,segment> bizarre3=
			new TripletH <>(3,point,seg);
	
	TripletH <Integer,Point,segment> bizarre4=
			new TripletH <>(4,point,seg);
	
	A.ajoute(bizarre1);
	A.ajoute(bizarre2);
	A.ajoute(bizarre3);
	
	B.ajoute(bizarre2);
	B.ajoute(bizarre3);
	B.ajoute(bizarre4);
	
	
	System.out.println(A);
	System.out.println(B);
	System.out.println(C);
	
	
	C=A.union(B);
	System.out.println("Union de A et B = "+C);
	
	ensembleGenerique<TripletH<Integer, Point, segment>> D = new ensembleGenerique <>();
	D = A.intersection(B);
	System.out.println("intersection de A et B = "+D);

}
}
