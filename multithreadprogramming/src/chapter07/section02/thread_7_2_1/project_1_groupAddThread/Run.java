package chapter07.section02.thread_7_2_1.project_1_groupAddThread;

public class Run {
	public static void main(String[] args) {
		ThreadA aRunnable = new ThreadA();
		ThreadB bRunnable = new ThreadB();

		ThreadGroup group = new ThreadGroup("Clarence");

		Thread aThread = new Thread(group, aRunnable);
		Thread bThread = new Thread(group, bRunnable);
		aThread.start();
		bThread.start();

		System.out.println("活动的线程数为：" + group.activeCount());
		System.out.println("线程组的名称为：" + group.getName());
	}
}
/*
result:
活动的线程数为：2
线程组的名称为：Clarence
ThreadName=Thread-3
ThreadName=Thread-2
...................
 */