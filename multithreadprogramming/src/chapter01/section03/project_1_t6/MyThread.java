package chapter01.section03.project_1_t6;

public class MyThread extends Thread {
	
	public MyThread() {
		System.out.println("���췽���Ĵ�ӡ: " + Thread.currentThread().getName());
	}
	
	@Override
	public void run() {
		System.out.println("run�����Ĵ�ӡ: " + Thread.currentThread().getName());
	}
}
