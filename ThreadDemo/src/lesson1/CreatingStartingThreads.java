package lesson1;

public class CreatingStartingThreads {
	
	//Start a thread directly from a thread.
	public static class MyThread extends Thread {
		
		@Override
		public void run() {
			System.out.println("Hello World!");
		}
	}

	public static void main(String[] args) {
		Thread myThread = new MyThread();
		
		myThread.start();
	}

}
