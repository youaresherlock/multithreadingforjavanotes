package chapter01.section10.thread_1_10_2.project_1_t19;

public class Run {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			MyThread1 thread1 = new MyThread1();
			thread1.setPriority(1);
			thread1.start();
			
			MyThread2 thread2 = new MyThread2();
			thread2.setPriority(1);
			//thread2.setPriority(10);
			thread2.start();
		}
	}
}
/*
´øÉÏ×¢ÊÍresult:
-----thread2 use time=496
-----thread2 use time=506
-----thread2 use time=535
*****thread1 use time=535
*****thread1 use time=557
*****thread1 use time=568
*****thread1 use time=569
-----thread2 use time=570
*****thread1 use time=575
-----thread2 use time=574
È¥µô×¢ÊÍresult:
-----thread2 use time=301
-----thread2 use time=393
-----thread2 use time=426
-----thread2 use time=439
-----thread2 use time=484
*****thread1 use time=509
*****thread1 use time=522
*****thread1 use time=522
*****thread1 use time=534
*****thread1 use time=535
*/
