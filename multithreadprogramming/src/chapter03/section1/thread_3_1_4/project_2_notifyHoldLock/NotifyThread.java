package chapter03.section1.thread_3_1_4.project_2_notifyHoldLock;

public class NotifyThread extends Thread{
	private Object lock;

	public NotifyThread(Object lock) {
		super();
		this.lock = lock;
	}
	
	@Override
	public void run() {
		Service service = new Service();
		service.synNotifyMethod(lock);
	}
}
