package chapter06.section02.project_6_singleton_5;

public class Run {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		
		t1.start();
		t2.start();
		t3.start();
	}
}
/*
reslt:
1403299602
1403299602
1403299602
*/

























