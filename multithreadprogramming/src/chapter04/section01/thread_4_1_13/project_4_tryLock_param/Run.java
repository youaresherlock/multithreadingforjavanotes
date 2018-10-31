package chapter04.section01.thread_4_1_13.project_4_tryLock_param;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		final Service service = new Service();

		Runnable runnableRef = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()
						+ "调用waitMethod时间：" + System.currentTimeMillis());
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






















