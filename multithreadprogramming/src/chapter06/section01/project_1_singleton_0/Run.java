package chapter06.section01.project_1_singleton_0;

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
result:
1122949189
1122949189
1122949189
*/

























