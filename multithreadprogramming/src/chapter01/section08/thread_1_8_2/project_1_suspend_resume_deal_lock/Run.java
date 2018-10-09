package chapter01.section08.thread_1_8_2.project_1_suspend_resume_deal_lock;

public class Run {
	public static void main(String[] args) {
		try {
			final SynchronizedObject object = 
					new SynchronizedObject();
			Thread thread1 = new Thread() {
				@Override
				public void run() {
					object.printString();
				}
			};
			
			thread1.setName("a");
			thread1.start();
			
			Thread.sleep(1000);
			
			Thread thread2 = new Thread() {
				@Override
				public void run() {
					System.out
						.println("thread2�����ˣ������벻��printString()����!ֻ��ӡ1��begin");
					System.out
						.println("��ΪprintString()������a�߳�����������Զ��suspend��ͣ��!");
					object.printString();
				}
			};
			thread2.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
/*
result:
begin
a�߳���Զ suspend��!
thread2�����ˣ������벻��printString()����!ֻ��ӡ1��begin
��ΪprintString()������a�߳�����������Զ��suspend��ͣ��!
*/














