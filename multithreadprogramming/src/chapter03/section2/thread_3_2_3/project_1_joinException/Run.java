package chapter03.section2.thread_3_2_3.project_1_joinException;

public class Run {
	
	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			b.start();
			
			Thread.sleep(500);
			
			ThreadC c = new ThreadC(b);
			c.start();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
/*
result:
线程B在catch处打印了
java.lang.InterruptedException
	at java.base/java.lang.Object.wait(Native Method)
	at java.base/java.lang.Thread.join(Unknown Source)
	at java.base/java.lang.Thread.join(Unknown Source)
	at chapter03.section2.thread_3_2_3.project_1_joinException.ThreadB.run(ThreadB.java:10)
*/