package chapter01.section02.thread_1_2_4.project_1_smaeNum;

public class MyThread extends Thread {
	private int i = 5;
	
	@Override
	public void run() {
//	synchronized public void run() {
		System.out.println("i=" + (i--) + " threadName="
				+ Thread.currentThread().getName());
	}
}















