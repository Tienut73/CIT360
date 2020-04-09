package jsonTutorial;

public class MyPojo2 {
	
	public String $schema;
	public String title;
	public String description;
	public String type;
	public Properties properties;
	public String [] required;
	
	public String get$schema() {
		return $schema;
	}
	public void set$schema(String $schema) {
		this.$schema = $schema;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public String[] getRequired() {
		return required;
	}
	public void setRequired(String[] required) {
		this.required = required;
	}
	
	

}
