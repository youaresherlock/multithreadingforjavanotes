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
已经是停止状态了!我要退出了!
进MyThread.java类run方法中的catch了!
java.lang.InterruptedException
	at chapter01.section07.thread_1_7_3.
	project_3_t13_1.MyThread.run(MyThread.java:10)
 */