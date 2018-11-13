package blog;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractItem extends AbstractPublishableItem 
implements Taggable {
	
	public AbstractItem(long datepubli, String aut) {
		super(datepubli, aut);
		tags = new ArrayList<String>();
	}

	List<String> tags;

	public void addTag(String tag) {
		//Verifier que le tag n'existe pas dans la liste de tags
		if(!tags.contains(tag)) { // contains inclue dans java
			tags.add(tag); // add inclue dans java
		}
	}

	public void removeTag(String tag) {
		tags.remove(tag); //remove inclue dans java
	}
	
	public int tagCount() {
		return tags.size();
	}
	
	public List<String> getTags(){
		return tags;
	}
	
	
	
	
	

}
