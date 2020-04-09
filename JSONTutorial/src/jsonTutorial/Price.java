package jsonTutorial;

public class Price {
	
	public String type;
	public int minimum;
	public boolean exclusiveMinimum;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public boolean isExclusiveMinimum() {
		return exclusiveMinimum;
	}
	public void setExclusiveMinimum(boolean exclusiveMinimum) {
		this.exclusiveMinimum = exclusiveMinimum;
	}
	
	

}
