package blog;

public abstract class AbstractPublishableItem implements Publishable {

	long datepublication;
	String auteur;
	
	public AbstractPublishableItem (long datepubli,String aut) {
		this.datepublication=datepubli;
		this.auteur=aut;
	
	}
	
	public long getPublicationDate() {
		return this.datepublication;
	}
	public String getAuthor() {
		return this.auteur;
	}
}
