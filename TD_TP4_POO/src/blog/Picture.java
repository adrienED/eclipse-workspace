package blog;

public class Picture extends AbstractItem {

	String url;
	
	public Picture(long datepubli, String aut, String url) {
		super(datepubli, aut);
		this.url=url;
		// TODO Auto-generated constructor stub
	}
	
	public String getURL(){
		return this.url;
	}

	@Override
	public void AbstractItem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AbstractPublishableItem() {
		// TODO Auto-generated method stub
		
	}
	

}
