package chapter03.section2.thread_3_2_5.project_1_join_sleep_1;

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
				b.join(); //说明join释放锁了
				for (int i = 0; i < Integer.MAX_VALUE; i++) {
					String newString = new String();
					Math.random();
				}
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}










































