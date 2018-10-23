package chapter03.section1.thread_3_1_4.project_1_waitReleaseLock;

public class Test {
	public static void main(String[] args) {

		Object lock = new Object();

		ThreadA a = new ThreadA(lock);
		a.start();

		ThreadB b = new ThreadB(lock);
		b.start();
	}
}
/*
result:
begin wait()
begin wait()
 */