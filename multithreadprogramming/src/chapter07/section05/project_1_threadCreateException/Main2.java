package chapter07.section05.project_1_threadCreateException;

import java.lang.Thread.UncaughtExceptionHandler;

public class Main2 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("�߳�t1");
		t1.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("�߳�:" + t.getName() + " �������쳣��");
				e.printStackTrace();
			}
		});
		t1.start();

		MyThread t2 = new MyThread();
		t2.setName("�߳�t2");
		t2.start();
	}
}
/*
result:
�߳�:�߳�t1 �������쳣��
Exception in thread "�߳�t2" java.lang.NullPointerException
	at chapter07.section05.project_1_threadCreateException.MyThread.run(MyThread.java:7)
java.lang.NullPointerException
	at chapter07.section05.project_1_threadCreateException.MyThread.run(MyThread.java:7)
*/
