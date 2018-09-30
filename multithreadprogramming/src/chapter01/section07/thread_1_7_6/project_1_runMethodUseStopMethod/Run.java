package chapter01.section07.thread_1_7_6.project_1_runMethodUseStopMethod;

public class Run {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
	}
}

/*
result:
进入了catch()方法！
java.lang.ThreadDeath
	at java.base/java.lang.Thread.stop(Unknown Source)
	at chapter01.section07.thread_1_7_6.
	project_1_runMethodUseStopMethod.MyThread.run(MyThread.java:7)
 */