package chapter01.section10.thread_1_10_3.project_1_t20;

public class Run {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			MyThread1 thread1 = new MyThread1();
			thread1.setPriority(5);
			thread1.start();
			
			MyThread2 thread2 = new MyThread2();
			thread2.setPriority(6);
			thread2.start();
		}
	}
}
/*
result:
-----thread2 use time=2
-----thread2 use time=2
*****thread1 use time=2
-----thread2 use time=2
*****thread1 use time=2
-----thread2 use time=3
*****thread1 use time=3
-----thread2 use time=3
*****thread1 use time=3
*****thread1 use time=4
其实不一定是thread1最后才执行完，有一些不确定性和随机性
*/
