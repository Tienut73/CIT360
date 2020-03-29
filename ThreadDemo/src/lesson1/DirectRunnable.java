package lesson1;

public class DirectRunnable implements Runnable {

	// Start a runnable directly.
	public static void main(String[] args) {
		System.out.println("Inside : " + Thread.currentThread().getName());
		
		System.out.println("Creating Runnable...");
		Runnable runnable = new DirectRunnable();
		
		System.out.println("Creating Thread...");
		Thread thread = new Thread(runnable);
		
		System.out.println("Starting Thread...");
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("Inside : " + Thread.currentThread().getName());
	}

}
