package mvcFinal;

public class ModelFinal {
	private String firstname;
	private String lastname;
	
	// This represents data being transferred between
	// the View and Controller components.
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
