package chapter04.section01.thread_4_1_13.project_3_tryLockTest;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		final Service service = new Service();

		Runnable runnableRef = new Runnable() {
			@Override
			public void run() {
				service.waitMethod();
			}
		};

		Thread threadA = new Thread(runnableRef);
		threadA.setName("A");
		threadA.start();
		Thread threadB = new Thread(runnableRef);
		threadB.setName("B");
		threadB.start();
	}
}
/*
result:
A获得锁
B没有获得锁
*/






















