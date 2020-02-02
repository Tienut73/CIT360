package JavaThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Implement a runnable instance to a Thread.
public class javaThread implements Runnable {
	
public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		System.out.println("It's the final countdown!");
		// The Executor service executes tasks in the background.
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new javaThread());
		executorService.execute(new javaThread());
		executorService.execute(new javaThread());
		executorService.execute(new javaThread());
		executorService.execute(new javaThread());
		
		executorService.shutdown();
}
		@Override
		public void run() {
			for (int i = 10; i > 0; i--) {
			System.out.println(i + "!");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Give me a: ");
		}
			System.out.println("break!");

	}
}