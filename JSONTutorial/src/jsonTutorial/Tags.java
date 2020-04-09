package jsonTutorial;

public class Tags {
	
	public String type;
	public Items items;
	public int minItems;
	public boolean uniqueItems;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Items getItems() {
		return items;
	}
	public void setItems(Items items) {
		this.items = items;
	}
	public int getMinItems() {
		return minItems;
	}
	public void setMinItems(int minItems) {
		this.minItems = minItems;
	}
	public boolean isUniqueItems() {
		return uniqueItems;
	}
	public void setUniqueItems(boolean uniqueItems) {
		this.uniqueItems = uniqueItems;
	}
	
	

}
