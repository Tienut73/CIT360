package covidApp;

public class AppControl {
		 
		 private Dispatcher dispatcher;
		 
		 public AppControl() {
			 
			 dispatcher = new Dispatcher();
		 }
		 
		 private boolean isAuthenticUser() {
			 
			 System.out.println("Authentication successful.");
			 return true;
		 }
			private void trackRequest( String request ) {
				System.out.println("Page requested: " + request);
			}
			
			public void dispatchRequest( String request ) {
				
				trackRequest(request);
				
				if( isAuthenticUser()) {		
			
				dispatcher.dispatch(request);
			}
		}
	}
