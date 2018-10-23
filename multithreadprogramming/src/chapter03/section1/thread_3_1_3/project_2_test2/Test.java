package chapter03.section1.thread_3_1_3.project_2_test2;

public class Test {
	public static void main(String[] args) {
		try {
			Object lock = new Object();
			
			MyThread1 t1 = new MyThread1(lock);
			t1.start();
			
			Thread.sleep(3000);
			
			MyThread2 t2 = new MyThread2(lock);
			t2.start();
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
/*
result:
��ʼ    wait time=1540272811455
��ʼnotify time=1540272814462
����notify time=1540272814462
����    wait time=1540272814462
*/







































