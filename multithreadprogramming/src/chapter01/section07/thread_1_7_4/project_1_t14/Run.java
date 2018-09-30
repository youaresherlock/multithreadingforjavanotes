package chapter01.section07.thread_1_7_4.project_1_t14;

public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(200);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}

}

/*
result:
run begin
end!
在沉睡中被停止!进入catch!false
java.lang.InterruptedException: sleep interrupted
	at java.base/java.lang.Thread.sleep(Native Method)
	at chapter01.section07.thread_1_7_4.project_1_t14.
	MyThread.run(MyThread.java:9)
*/