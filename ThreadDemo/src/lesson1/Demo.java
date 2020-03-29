package lesson1;

// MyClass extends Thread class
class MyClass extends Thread {

	//Extend the thread class
	public void run() {
		for(int i=0 ; i<10;i++) {
			//numbers the various threads
			System.out.println(Thread.currentThread().getId() + "Value " + i);
		}
		//pauses thread for 100 milliseconds.
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
}

public class Demo {

	public static void main(String[] args) {
		//first thread
		MyClass myClass = new MyClass();
		myClass.start();
		//second thread
		MyClass myClass1 = new MyClass();
		myClass1.start();
		//runs concurrently
	}

}
