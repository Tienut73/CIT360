package covidApp;

public class Dispatcher {
	
	private ChinaData China;
	private ItalyData Italy;
	private AmericaData America;
	
	public Dispatcher() {
		// Each implementation will have its own method.
		China = new ChinaData();
		Italy = new ItalyData();
		America = new AmericaData();
	}

	public void dispatch(String request) {
		
		if(request.equalsIgnoreCase("China")) {
			China.show();
			
		}
		else if(request.equalsIgnoreCase("Italy")) {
			Italy.show();
		}
		// if you type in anything other than
		// China or Italy, it will give you
		// America.
		else {
			America.show();
		}
	}

}
