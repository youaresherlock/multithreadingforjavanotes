package chapter03.section1.thread_3_1_4.project_1_waitReleaseLock;

public class Service {
	
	public void testMethod(Object lock) {
		try {
			synchronized(lock) {
				System.out.println("begin wait()");
				lock.wait();
				System.out.println("  end wait()");
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
