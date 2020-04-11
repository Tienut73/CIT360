package covidApp;

public interface CovidInterface {

interface ChinaData {
	public void myChinaData();
}

interface ItalyData {
	public void myItalyData();
}

interface AmericaData {
	public void myAmericaData();
}

class Dispatcher implements ChinaData, ItalyData, AmericaData {
	public void myChinaData() {
		System.out.println("Some text...");
	}
	
	public void myItalyData() {
		System.out.println("Some text...");
	}
	
	public void myAmericaData() {
		System.out.println("Some text...");
	}
   }

   class AppControlDemo {
	   public static void main(String[] args) {
		   Dispatcher myObj = new Dispatcher();
		   myObj.myChinaData();
		   myObj.myItalyData();
		   myObj.myAmericaData();
		   
	   }
   }

}