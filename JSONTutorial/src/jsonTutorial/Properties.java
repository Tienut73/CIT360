package jsonTutorial;

public class Properties {
	
	public Id id;
	public Name name;
	public Price price;
	public Tags tags;
	public Id getId() {
		return id;
	}
	public void setId(Id id) {
		this.id = id;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	public Tags getTags() {
		return tags;
	}
	public void setTags(Tags tags) {
		this.tags = tags;
	}
	
	// create getters and setters for each property.

}
