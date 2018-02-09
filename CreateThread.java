package MultiThreading;
public class CreateThread extends Thread implements Runnable{

	public void run()  {
		for(int i = 0;i<10;i++) {
			System.out.println(i+": "+Thread.currentThread().getName()+": Thread is running...");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		CreateThread t = new CreateThread();
		t.setName("Extend thread");
		t.start();
		t.join();

		Thread tt = new Thread(new CreateThread());
		tt.setName("Runnable thread");
		tt.start();
		t.join();


		Thread ttt = new Thread(new CreateThread());
		ttt.setName("Runnable ttt thread");
		ttt.start();

		while(t.isAlive() && tt.isAlive()) {
			//			System.out.println("Thread is alive");
		}

		if(!t.isAlive() && !tt.isAlive()) System.out.println("Thread dead");
	}
}