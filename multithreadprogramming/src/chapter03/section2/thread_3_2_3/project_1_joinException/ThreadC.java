package chapter03.section2.thread_3_2_3.project_1_joinException;

public class ThreadC extends Thread {
	
	private ThreadB threadB;
	
	public ThreadC(ThreadB threadB) {
		super();
		this.threadB = threadB;
	}
	
	@Override
	public void run() {
		threadB.interrupt();
	}
}
