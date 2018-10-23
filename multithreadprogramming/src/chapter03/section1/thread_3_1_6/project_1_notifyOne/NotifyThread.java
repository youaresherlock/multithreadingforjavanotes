package chapter03.section1.thread_3_1_6.project_1_notifyOne;

public class NotifyThread extends Thread {
	private Object lock;

	public NotifyThread(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			//可以调用lock.notifyAll()唤醒所有等待lock锁的线程
		}
	}
}