package chapter01.section07.thread_1_7_4.project_1_t15;

public class Run {
	
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		thread.interrupt();
		System.out.println("end!");
	}

}

/*
result:
i=100000
run begin
��ֹͣ����������sleep!����catch!
java.lang.InterruptedException: sleep interrupted
	at java.base/java.lang.Thread.sleep(Native Method)
	at chapter01.section07.thread_1_7_4.project_1_t15.
	MyThread.run(MyThread.java:12)
*/