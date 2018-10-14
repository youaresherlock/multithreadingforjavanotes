package chapter02.section01.thread_2_1_6.project_1_synLockIn_l;

public class Run {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}
}
/*
result:
service1
service2
service3
 */