package chapter02.section01.thread_2_1_7.project_1_throwExceptionNoLock;

public class Test {
	public static void main(String[] args) {
		try {
			Service service = new Service();
			
			ThreadA a = new ThreadA(service);
			a.setName("a");
			a.start();
			
			Thread.sleep(5000);
			
			ThreadB b = new ThreadB(service);
			b.setName("b");
			b.start();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
/*
result:
ThreadName=a run beginTime=1539601209770
ThreadName=a run exceptionTime=1539601210053
Exception in thread "a" java.lang.NumberFormatException: For input string: "a"
	at java.base/java.lang.NumberFormatException.forInputString(Unknown Source)
	at java.base/java.lang.Integer.parseInt(Unknown Source)
	at java.base/java.lang.Integer.parseInt(Unknown Source)
	at chapter02.section01.thread_2_1_7.project_1_throwExceptionNoLock.Service.testMethod(Service.java:16)
	at chapter02.section01.thread_2_1_7.project_1_throwExceptionNoLock.ThreadA.run(ThreadA.java:13)
Thread B run Time=1539601214778
*/