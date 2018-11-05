package chapter07.section07.project_1_threadExceptionMove;

public class Run1 {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		// ∂‘œÛ
		myThread
		 .setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
		// ¿‡
		MyThread
			.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
		myThread.start();
	}
}
