package mvcFinal;

public class AppFinal {
	
public static void main(String[] args) {
		
		ModelFinal modelFinal = retriveAppFromDatabase();
		
		ViewFinal viewFinal = new ViewFinal();
		
		ControllerFinal controller = new ControllerFinal(modelFinal, viewFinal);
		
		controller.updateView();
		
		controller.setFirstname("Logan");
		
		controller.setLastname("Pierce");
		
		controller.updateView();
	}
	
	private static ModelFinal retriveAppFromDatabase() {
			
		ModelFinal app = new ModelFinal();
		app.setFirstname("Logan");
		app.setLastname("Pierce");
		return app;
	}

}
