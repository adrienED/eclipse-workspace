package geometrie;

public class segment {
	
	//variable d'instance
	public Point debut; 
	public Point fin; 

	
	//constructeur
	
	public segment () {
		
		this.debut=new Point(0,0);
		this.fin= new Point (0,0);
	}
	
	public segment (Point debut, Point fin) {
		this.debut=debut;
		this.fin=fin;
	}
	
	//public segment (segment autreSegment ) {
		//this.debut=autreSegment.
	//}

	public Point getDebut() {
		return debut;
	}
	
	public Point getFin() {
		return fin;
	}
	
	
	public void setDebut (int x , int y) {
		this.debut=new Point(x,y);
		
	}
	
	public void setFin (int x , int y) {
		this.fin=new Point(x,y);
		
	}
	
	public void translater (Point deb, Point fin ) {
		
		this.setDebut(this.getDebut().getX()+deb.getX(),this.getDebut().getY()+deb.getY());
		this.setFin(this.getFin().getX()+fin.getX(), this.getFin().getY()+fin.getY());
	}
	
	
	
	
	public segment copy() {
		return new segment (this.getDebut(),this.getFin());
	}
	
	
	
}
	  