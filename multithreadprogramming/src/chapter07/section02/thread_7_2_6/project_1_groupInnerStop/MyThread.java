package chapter07.section02.thread_7_2_6.project_1_groupInnerStop;

public class MyThread extends Thread{
	
	public MyThread(ThreadGroup group, String name) {
		super(group, name);
	}
	
	@Override
	public void run() {
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ "׼����ʼ��ѭ���� :)");
		while(!this.isInterrupted()) {
			
		}
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ "������ :)");
	}
	
}



























