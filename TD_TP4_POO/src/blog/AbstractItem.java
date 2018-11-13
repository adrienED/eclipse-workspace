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
		if(!tags.contains(tag)) {
			tags.add(tag);
		}
	}

	public void removeTag(String tag) {
		tags.remove(tag);
	}
	
	public int tagCount() {
		return tags.size();
	}
	
	public List<String> getTags(){
		return tags;
	}
	
	
	
	
	

}
