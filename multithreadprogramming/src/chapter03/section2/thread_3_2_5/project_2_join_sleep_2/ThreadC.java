package chapter03.section2.thread_3_2_5.project_2_join_sleep_2;

public class ThreadC extends Thread {
	
	private ThreadB threadB;

	public ThreadC(ThreadB threadB) {
		super();
		this.threadB = threadB;
	}

	@Override
	public void run() {
		threadB.bService();
	}
}
