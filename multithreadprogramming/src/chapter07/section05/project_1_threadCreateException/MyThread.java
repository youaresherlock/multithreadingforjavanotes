package chapter07.section05.project_1_threadCreateException;

public class MyThread extends Thread{
	@Override
	public void run() {
		String username = null;
		System.out.println(username.hashCode());
	}
}
/*
Exception in thread "Thread-0" java.lang.NullPointerException
	at chapter07.section05.project_1_threadCreateException.MyThread.run(MyThread.java:7)
*/