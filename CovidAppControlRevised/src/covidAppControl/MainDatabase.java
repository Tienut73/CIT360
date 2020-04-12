package covidAppControl;

import DatabaseView.CovidMenuView;


public class MainDatabase {
	
    private static System theSystem = null;
    
    //main function - entry point for the program
    //runs the main menu
    public static void main(String[] args) {
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenu();
       
    
    }
    
    public static void setTheSystem(System system){
        theSystem = system;
    }
    public static System getTheSystem(){
        return theSystem;
    }
    
    
} 
