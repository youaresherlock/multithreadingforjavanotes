package chapter03.section1.thread_3_1_7.project_1_notifyAll;

public class ThreadB extends Thread {
	private Object lock;

	public ThreadB(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service service = new Service();
		service.testMethod(lock);
	}
}