package Sunquest;

import java.util.concurrent.*;

public class coading {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 15; i++) {
			Runnable run = new conClass();
			es.submit(run);
		}
		es.shutdown();
		while (!es.isTerminated()) {
		}
		System.out.println("Finished all threads");
		
		ExecutorService executorService =  Executors.newFixedThreadPool(5);
		Callable cal = new conClass();
		
		Future future = executorService.submit(cal);
		System.out.println("future.get() = " + future.get());
		
		Runnable run = new conClass();
		Future future2 = executorService.submit(run);
		System.out.println("future2.get() = " + future2.get());  //returns null if the task has finished correctly.
	}
}

class conClass implements Runnable, Callable{

	@Override
	public void run() {
		try {
            Thread.sleep(1500);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}

	@Override
	public Object call() throws Exception {
		try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Thread.currentThread().getName();
	}
}
