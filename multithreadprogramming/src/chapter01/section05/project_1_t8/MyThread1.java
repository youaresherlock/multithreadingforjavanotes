package chapter01.section05.project_1_t8;

public class MyThread1 extends Thread {

	@Override 
	public void run() {
		try {
			System.out.println("run threadName="
					+ Thread.currentThread().getName() + " begin");
			Thread.sleep(2000);
			System.out.println("run threadName="
					+ Thread.currentThread().getName() + " end");
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}


























