package chapter03.section1.thread_3_1_3.project_2_test2;

public class MyThread1 extends Thread{
	private Object lock;
	
	public MyThread1(Object lock) {
		super();
		this.lock = lock;
	}
	
	@Override
	public void run() {
		try {
			synchronized (lock) {
				System.out.println("¿ªÊ¼    wait time=" + System.currentTimeMillis());
				lock.wait();
				System.out.println("½áÊø    wait time=" + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}































