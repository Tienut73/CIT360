package mvcFinal;

public class ControllerFinal {
	
	private ModelFinal model;
	private ViewFinal view;
	
	// Controller is an interface
	// between Model and View components.
	public ControllerFinal(ModelFinal m, ViewFinal v) {
		this.model = m;
		this.view = v;
	}
	
	public void setFirstname(String firstname) {
		model.setFirstname(firstname);
	}
	
	public String getFirstname() {
		return model.getFirstname();
	}
	
	public void setLastname(String lastname) {
		model.setLastname(lastname);
	}
	
	public String getLastname() {
		return model.getLastname();
				
	}
	
	public void updateView() {
		view.printDetails(model.getFirstname(), model.getLastname());
	}

}
