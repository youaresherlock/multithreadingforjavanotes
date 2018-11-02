package chapter04.section01.thread_4_1_14.project_1_awaitUninterruptiblyTest_1;

public class Run {
	public static void main(String[] args) {
		try {
			Service service = new Service();
			MyThread myThread = new MyThread(service);
			myThread.start();
			Thread.sleep(3000);
			myThread.interrupt();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
/*
 result:
 wait begin
java.lang.InterruptedException
	at java.base/java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.reportInterruptAfterWait(Unknown Source)
	at java.base/java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(Unknown Source)
	at chapter04.section01.thread_4_1_14.project_1_awaitUninterruptiblyTest_1.Service.testMethod(Service.java:15)
	at chapter04.section01.thread_4_1_14.project_1_awaitUninterruptiblyTest_1.MyThread.run(MyThread.java:14)
catch
*/