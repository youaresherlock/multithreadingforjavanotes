package chapter03.section1.thread_3_1_5.project_1_waitInterruptException;

public class Test {
	public static void main(String[] args) {

		try {
			Object lock = new Object();

			ThreadA a = new ThreadA(lock);
			a.start();

			Thread.sleep(5000);

			a.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
/*
result:
begin wait()
java.lang.InterruptedException
出现异常了，因为呈wait状态的线程被interrupt了！
	at java.base/java.lang.Object.wait(Native Method)
	at java.base/java.lang.Object.wait(Unknown Source)
	at chapter03.section1.thread_3_1_5.project_1_waitInterruptException.Service.testMethod(Service.java:9)
	at chapter03.section1.thread_3_1_5.project_1_waitInterruptException.ThreadA.run(ThreadA.java:15)
 */