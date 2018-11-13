package blog;

public class Message extends AbstractPublishableItem {
	
	String corps_message;
	
	public Message(long datepubli, String aut, String corps) {
		super(datepubli, aut);
		this.corps_message=corps;
		// TODO Auto-generated constructor stub
	}
	
	public String getContent() {
	return this.corps_message;
	
}
	@Override
	public void AbstractPublishableItem() {
		// TODO Auto-generated method stub
		
	}
}
