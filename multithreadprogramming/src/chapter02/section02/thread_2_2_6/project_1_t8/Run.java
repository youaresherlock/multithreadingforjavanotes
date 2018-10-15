package chapter02.section02.thread_2_2_6.project_1_t8;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		Task task = new Task();

		MyThread1 thread1 = new MyThread1(task);
		thread1.start();

		Thread.sleep(10);

		MyThread2 thread2 = new MyThread2(task);
		thread2.start();
	}
}
/*
有synchronized方法otherMethod()的result:
.......................................
synchronized threadName=Thread-0 i=9998
synchronized threadName=Thread-0 i=9999
synchronized threadName=Thread-0 i=10000
------------------run--otherMethod
没有synchronized方法otherMethod()的result:
.......................................
synchronized threadName=Thread-0 i=602
synchronized threadName=Thread-0 i=603
------------------run--otherMethod
synchronized threadName=Thread-0 i=604
synchronized threadName=Thread-0 i=605
......................................
*/







