package chapter07.section06.project_1_threadGroup_1;

public class Run {
	public static void main(String[] args) {
		ThreadGroup group = new ThreadGroup("�ҵ��߳���");
		MyThread[] myThread = new MyThread[2];
		for (int i = 0; i < myThread.length; i++) {
			myThread[i] = new MyThread(group, "�߳�" + (i + 1), "1");
			myThread[i].start();
		}
		MyThread newT = new MyThread(group, "�����߳�", "a");
		newT.start();
	}
}
