package chapter03.section2.thread_3_2_5.project_2_join_sleep_2;

public class ThreadA extends Thread {
	
	private ThreadB b;
	
	public ThreadA(ThreadB b) {
		super();
		this.b = b;
	}
	
	@Override
	public void run() {
		try {
			synchronized(b) {
				b.start();
				Thread.sleep(6000);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}










































