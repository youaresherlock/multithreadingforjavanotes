package chapter07.section01.thread_7_1_1.project_1_stateTest1;

public class MyThread extends Thread {
	
	public MyThread() {
		System.out.println("���췽���е�״̬: " + Thread.currentThread().getState());
	}
	
	@Override
	public void run() {
		System.out.println("run�����е�״̬: " + Thread.currentThread().getState());
	}
}
