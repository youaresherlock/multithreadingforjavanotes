package chapter01.section11.project_1_daemonThread;

public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.setDaemon(true); //设置为守护线程
			thread.start();
			Thread.sleep(5000);
			System.out.println("我离开thread对象也不再打印了，也就是停止了!");
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
/*
result:
i=1
i=2
i=3
i=4
i=5
我离开thread对象也不再打印了，也就是停止了!
 */