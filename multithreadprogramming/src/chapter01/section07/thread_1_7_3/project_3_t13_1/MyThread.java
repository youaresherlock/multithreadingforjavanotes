package chapter01.section07.thread_1_7_3.project_3_t13_1;

public class MyThread extends Thread{
	@Override
	public void run() {
		try {
			for(int i = 0; i < 500000; i++) {
				if(Thread.interrupted()) {
					System.out.println("�Ѿ���ֹͣ״̬��!��Ҫ�˳���!");
					throw new InterruptedException();
				}
				System.out.println("i=" + (i + 1));
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("��MyThread.java��run�����е�catch��!");
			e.printStackTrace();
		}
	}
}
