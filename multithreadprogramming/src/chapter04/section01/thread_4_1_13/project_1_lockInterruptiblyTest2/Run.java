package chapter04.section01.thread_4_1_13.project_1_lockInterruptiblyTest2;

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
		Thread.sleep(500);
		Thread threadB = new Thread(runnableRef);
		threadB.setName("B");
		threadB.start();
		threadB.interrupt();// 打标记
		System.out.println("main end!");
	}
}
/*
result：
lock begin A
main end!
lock   end A
lock begin B
lock   end B
去掉注释，将lock.lock()换成lock.lockInterruptibly()
result:
lock begin A
main end!
线程B进入catch~!
java.lang.InterruptedException
	at java.base/java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireInterruptibly(Unknown Source)
	at java.base/java.util.concurrent.locks.ReentrantLock.lockInterruptibly(Unknown Source)
	at chapter04.section01.thread_4_1_13.project_1_lockInterruptiblyTest1.Service.waitMethod(Service.java:13)
	at chapter04.section01.thread_4_1_13.project_1_lockInterruptiblyTest1.Run$1.run(Run.java:10)
	at java.base/java.lang.Thread.run(Unknown Source)
lock   end A
*/






















