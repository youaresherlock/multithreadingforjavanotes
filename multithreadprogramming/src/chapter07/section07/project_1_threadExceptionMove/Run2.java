package chapter07.section07.project_1_threadExceptionMove;

public class Run2 {
	public static void main(String[] args) {
		MyThreadGroup group = new MyThreadGroup("�ҵ��߳���");
		MyThread myThread = new MyThread(group, "�ҵ��߳�");
		// ����
		// myThread
		// .setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
		// ��
		// MyThread
		// .setDefaultUncaughtExceptionHandler(new
		// StateUncaughtExceptionHandler());
		myThread.start();

	}
}