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

		System.out.println("����߳���Ϊ��" + group.activeCount());
		System.out.println("�߳��������Ϊ��" + group.getName());
	}
}
/*
result:
����߳���Ϊ��2
�߳��������Ϊ��Clarence
ThreadName=Thread-3
ThreadName=Thread-2
...................
 */