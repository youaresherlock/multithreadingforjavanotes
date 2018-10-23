package chapter03.section1.thread_3_1_3.project_1_test1;

public class Test1 {
	public static void main(String[] args) {
		try {
			String newString = new String("");
			newString.wait();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
/*
result:
Exception in thread "main" java.lang.IllegalMonitorStateException
	at java.base/java.lang.Object.wait(Native Method)
	at java.base/java.lang.Object.wait(Unknown Source)
	at chapter03.section1.thread_3_1_3.project_1_test1.Test1.main(Test1.java:7)
*/






















