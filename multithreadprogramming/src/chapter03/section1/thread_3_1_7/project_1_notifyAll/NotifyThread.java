package chapter03.section1.thread_3_1_7.project_1_notifyAll;

public class NotifyThread extends Thread {
	private Object lock;

	public NotifyThread(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			lock.notifyAll();
			//���Ե���lock.notifyAll()�������еȴ�lock�����߳�
		}
	}
}