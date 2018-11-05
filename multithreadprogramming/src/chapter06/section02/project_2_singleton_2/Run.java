package chapter06.section02.project_2_singleton_2;

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
单线程情况下result:
781844118
多线程情况下加上注释result:
1456203498
1455173736
2038812851
*/

























