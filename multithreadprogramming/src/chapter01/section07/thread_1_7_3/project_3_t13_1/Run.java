package chapter01.section07.thread_1_7_3.project_3_t13_1;

public class Run {
	
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("main catch");
			e.printStackTrace();
		}
	}

}


/*
........
i=424944
i=424945
�Ѿ���ֹͣ״̬��!��Ҫ�˳���!
��MyThread.java��run�����е�catch��!
java.lang.InterruptedException
	at chapter01.section07.thread_1_7_3.
	project_3_t13_1.MyThread.run(MyThread.java:10)
 */